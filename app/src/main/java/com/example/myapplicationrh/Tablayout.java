package com.example.myapplicationrh;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class Tablayout extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);
        TabHost tabHost = getTabHost();
        this.setNewTab(this, tabHost, "tab1", "FIlM", R.drawable.ic_launcher_background, new Intent(this, MainActivity.class));
        this.setNewTab(this, tabHost, "tab2", "Profiles", R.drawable.ic_launcher_background, new Intent(this, Profiles.class));
}
    private void setNewTab(Context context, TabHost tabHost, String tag, String title, int icon, Intent intentid){
        TabHost.TabSpec tabSpec = tabHost.newTabSpec(tag);
        tabSpec.setIndicator(title, context.getResources().getDrawable(icon));
        tabSpec.setContent(intentid);
        tabHost.addTab(tabSpec);
    }
}