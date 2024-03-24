package com.universitaskuningan.aplikasikalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNumber1, etNumber2;
    TextView result;

    Double angkaPertama,angkaKedua,hasilTambah,hasilKurang,hasilKali,hasilBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber1 = findViewById(R.id.et_input_number_1);
        etNumber2 = findViewById(R.id.et_input_number_2);
        result = findViewById(R.id.tv_result_number_operations);
    }

    public void plus(View v) {
        angkaPertama = Double.valueOf(etNumber1.getText().toString().trim());
        angkaKedua = Double.valueOf(etNumber2.getText().toString().trim());
        hasilTambah = angkaPertama+ angkaKedua;
        result.setText("Hasil Penjumlahan = " + hasilTambah);
    }

    public void minus(View v) {
        angkaPertama = Double.valueOf(etNumber1.getText().toString().trim());
        angkaKedua = Double.valueOf(etNumber2.getText().toString().trim());
        hasilKurang = angkaPertama - angkaKedua;
        result.setText("Hasil Pengurangan = " + hasilKurang);
    }

    public void multiplied(View v) {
        angkaPertama = Double.valueOf(etNumber1.getText().toString().trim());
        angkaKedua= Double.valueOf(etNumber2.getText().toString().trim());
        hasilKali = angkaPertama * angkaKedua;
        result.setText("Hasil Perkalian = " + hasilKali);
    }

    public void divided(View v) {
        angkaPertama = Double.valueOf(etNumber1.getText().toString().trim());
        angkaKedua= Double.valueOf(etNumber2.getText().toString().trim());
        if (angkaKedua != 0) {
            hasilBagi = angkaPertama / angkaKedua;
            result.setText("Hasil Pembagian = " + hasilBagi);
        } else {
            result.setText("Tidak bisa dibagi dengan 0");
        }
    }

}