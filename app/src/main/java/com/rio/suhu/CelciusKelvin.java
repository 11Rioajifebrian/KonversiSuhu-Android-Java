package com.rio.suhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CelciusKelvin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius_kelvin);

        final EditText inputCelcius = findViewById(R.id.input_celciusToKelvin);
        Button konversiButton = findViewById(R.id.konversi_celciusToKelvin);

        konversiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                konversiDanKirim(inputCelcius.getText().toString());
            }
        });
    }

    private void konversiDanKirim(String nilaiCelciusToKelvin) {
            // Lakukan konversi Celcius ke Kelvin
            double celcius = Double.parseDouble(nilaiCelciusToKelvin);
            double kelvin = celcius + 273.15;

            // Kembalikan hasil konversi ke MainActivity
            Intent resultIntent = new Intent();
            resultIntent.putExtra("HASIL_KONVERSI_KELVIN", kelvin);
            setResult(RESULT_OK, resultIntent);

            // Tutup Activity konversi
            finish();
    }
}