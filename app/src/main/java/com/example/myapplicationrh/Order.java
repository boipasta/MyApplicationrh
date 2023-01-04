package com.example.myapplicationrh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        ImageView ivDefault=findViewById(R.id.iv_default);
        TextView   tvDefault= findViewById(R.id.tv_default);

        Intent intent = getIntent();
        int LogoAplikasi = intent.getIntExtra("gambar",0);
        String namaAplikasi = intent.getStringExtra("teks");

        ivDefault.setImageResource(LogoAplikasi);
        tvDefault.setText(namaAplikasi);
    }
}