package com.rio.suhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KelvinFarenheit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin_farenheit);

        final EditText inputKelvin = findViewById(R.id.input_kelvinToFarenheit);
        Button konversiButton = findViewById(R.id.konversi_kelvinToFarenheit);

        konversiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                konversiDanKirim(inputKelvin.getText().toString());
            }
        });
    }

    private void konversiDanKirim(String nilaiKelvinToFarenheit) {
        // Lakukan konversi Kelvin ke Fahrenheit
        double kelvin = Double.parseDouble(nilaiKelvinToFarenheit);
        double fahrenheit = (kelvin - 273.15) * 9/5 + 32;

        // Kembalikan hasil konversi ke MainActivity
        Intent resultIntent = new Intent();
        resultIntent.putExtra("HASIL_KONVERSI_FAHRENHEIT_KELVIN", fahrenheit);
        setResult(RESULT_OK, resultIntent);

        // Tutup Activity konversi
        finish();
    }
}