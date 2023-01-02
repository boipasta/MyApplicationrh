package com.example.myapplicationrh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Register extends AppCompatActivity {
    EditText usreg, pasreg;
    Button btn_simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usreg = (EditText) findViewById(R.id.user_regis);
        pasreg = (EditText) findViewById(R.id.pw_regis);
        btn_simpan = (Button)findViewById(R.id.btnRegis);
        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = usreg.getText().toString();
                String pass = pasreg.getText().toString();
                Toast.makeText(getApplicationContext(), "Register Berhasil",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Register.this, Login.class);
                Register.this.startActivity(intent);
            }
        });
    }
}