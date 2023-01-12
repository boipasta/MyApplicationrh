package com.example.myapplicationrh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Order extends AppCompatActivity implements View.OnClickListener {

    Button btnsimpan;
    LinearLayout parent1;
    EditText nokursi,jm,bioskop;
    TextView hasil;
    TextView hasil2;
    TextView hasil3;
    TextView hasil4;
    TextView tvDefault;
    ImageView ivDefault;
    public String[] nkursi={"01","02","03","04","05","06","07","08"};
    public String[] nmbioskop ={"CSB Premier","CSB XX1","Grage","CGV","Ramayana Cirebon","Transmart Cirebon"};
    public String[] jmtayang ={"12:00","13:20","14:30","17:00","19:00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        btnsimpan = (Button) findViewById(R.id.btnsimpan);
        nokursi = (EditText) findViewById(R.id.txtkursi);
        jm = (EditText) findViewById(R.id.txtjamtayang);
        bioskop = (EditText) findViewById(R.id.txtbioskop);
        hasil = (TextView) findViewById(R.id.hasil);
        hasil2 = (TextView) findViewById(R.id.hasil2);
        hasil3 = (TextView) findViewById(R.id.hasil3);
        hasil4 = (TextView) findViewById(R.id.hasil4);
        ivDefault=(ImageView) findViewById(R.id.iv_default);
        tvDefault= (TextView) findViewById(R.id.tv_default);
        btnsimpan.setOnClickListener(this);

        Intent intent = getIntent();
        int LogoAplikasi = intent.getIntExtra("gambar",0);
        String namaAplikasi = intent.getStringExtra("teks");

        ivDefault.setImageResource(LogoAplikasi);
        tvDefault.setText(namaAplikasi);
        hasil.setText("Nama Film "+ namaAplikasi);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnsimpan:
                hasil = findViewById(R.id.hasil);
                hasil2.setText("Nama Bioskop : " + bioskop.getText());
                hasil3.setText("Jam Tayang : " + jm.getText());
                hasil4.setText("No kursi : " + nokursi.getText());
                break;
        }
    }

    public void nokursi(View view) {
        AlertDialog.Builder ab = new AlertDialog.Builder(this);
        ab.setTitle("No Kursi");
        ab.setItems(nkursi, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                nokursi.setText(nkursi[i]);
                dialogInterface.dismiss();
            }
        }).show();
    }


    public void bioskop(View view) {
        AlertDialog.Builder ac = new AlertDialog.Builder(this);
        ac.setTitle("Nama Bioskop");
        ac.setItems(nmbioskop, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                bioskop.setText(nmbioskop[i]);
                dialogInterface.dismiss();
            }
        }).show();
    }

    public void jamtayang(View view) {
        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setTitle("Jam tayang Film");
        ad.setItems(jmtayang, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                jm.setText(jmtayang[i]);
                dialogInterface.dismiss();
            }
        }).show();
    }
}