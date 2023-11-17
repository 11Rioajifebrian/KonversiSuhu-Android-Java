package com.rio.suhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CelciusFarenheit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius_farenheit);

        final EditText inputCelcius = findViewById(R.id.input_celciusToFarenheit);
        Button konversiButton = findViewById(R.id.konversi_celciusToFarenheit);

        konversiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                konversiDanKirim(inputCelcius.getText().toString());
            }
        });
    }

    private void konversiDanKirim(String nilaiCelciusToFarenheid) {
            // Lakukan konversi Celcius ke Fahrenheit
            double celcius = Double.parseDouble(nilaiCelciusToFarenheid);
            double fahrenheit = (celcius * 9 / 5) + 32;

            // Kembalikan hasil konversi ke MainActivity
            Intent resultIntent = new Intent();
            resultIntent.putExtra("HASIL_KONVERSI_FAHRENHEIT", fahrenheit);
            setResult(RESULT_OK, resultIntent);

            // Tutup Activity konversi
            finish();
        }
    }