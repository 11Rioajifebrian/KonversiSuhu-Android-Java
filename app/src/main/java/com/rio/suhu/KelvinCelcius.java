package com.rio.suhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KelvinCelcius extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin_celcius);
        final EditText inputKelvin = findViewById(R.id.input_kelvinToCelcius);
        Button konversiButton = findViewById(R.id.konversi_kelvinToCelcius);

        konversiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                konversiDanKirim(inputKelvin.getText().toString());
            }
        });
    }

    private void konversiDanKirim(String nilaiKelvinToCelcius) {
        // Lakukan konversi Kelvin ke Celcius
        double kelvin = Double.parseDouble(nilaiKelvinToCelcius);
            double celcius = kelvin - 273.15;

            // Kembalikan hasil konversi ke MainActivity
            Intent resultIntent = new Intent();
            resultIntent.putExtra("HASIL_KONVERSI_CELCIUS", celcius);
            setResult(RESULT_OK, resultIntent);

            // Tutup Activity konversi
            finish();
    }
}