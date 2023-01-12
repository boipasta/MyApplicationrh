package com.example.myapplicationrh;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;


public class Register extends AppCompatActivity implements View.OnClickListener {
    EditText namereg,tanggalreg, usreg, pasreg;
    Button btn_simpan,btn_tanggal;
    private int tahun, bulan, hari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        namereg = (EditText) findViewById(R.id.namaText);
        usreg = (EditText) findViewById(R.id.username);
        pasreg = (EditText) findViewById(R.id.password);
        tanggalreg = (EditText) findViewById(R.id.txttgl);
        btn_simpan = (Button)findViewById(R.id.btnRegis);
        btn_tanggal = (Button)findViewById(R.id.btntgl);

        btn_tanggal.setOnClickListener(this);
        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nreg = namereg.getText().toString();
                String pass = pasreg.getText().toString();
                String user = usreg.getText().toString();
                String tgl = tanggalreg.getText().toString();

                Toast.makeText(getApplicationContext(), "Register Berhasil Dibuat",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Register.this, Login.class);
                Register.this.startActivity(intent);
            }
        });

    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btntgl) {
            Calendar c = Calendar.getInstance();
            tahun = c.get(Calendar.YEAR);
            bulan = c.get(Calendar.MONTH);
            hari = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int thn, int bhn, int tgl) {

                            tanggalreg.setText(tgl + "-" + (bhn + 1) + "-" + thn);
//
                        }
                    }, tahun, bulan, hari);
            datePickerDialog.show();
        }
    }
}