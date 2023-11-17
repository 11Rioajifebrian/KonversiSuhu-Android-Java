package com.rio.suhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

public class MainActivity extends AppCompatActivity {
    private TextView hasilTextView;

    private static final int CELCIUS_TO_FAHRENHEIT_REQUEST_CODE = 1;
    private static final int CELCIUS_TO_KELVIN_REQUEST_CODE = 2;
    private static final int KELVIN_TO_CELCIUS_REQUEST_CODE = 3;
    private static final int KELVIN_TO_FAHRENHEIT_REQUEST_CODE = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasilTextView = findViewById(R.id.hasil);
    }
    public void launchCelciusToFarenheit(View view) {
        Intent intent = new Intent(MainActivity.this, CelciusFarenheit.class);
        startActivityForResult(intent, CELCIUS_TO_FAHRENHEIT_REQUEST_CODE);
    }
    public void launchCelciusToKelvin(View view) {
        Intent intent = new Intent(MainActivity.this, CelciusKelvin.class);
        startActivityForResult(intent, CELCIUS_TO_KELVIN_REQUEST_CODE);
    }
    public void launchKelvinToFarenheit(View view) {
        Intent intent = new Intent(MainActivity.this, KelvinFarenheit.class);
        startActivityForResult(intent, KELVIN_TO_FAHRENHEIT_REQUEST_CODE);
    }
    public void launchKelvinToCelcius(View view) {
        Intent intent = new Intent(MainActivity.this, KelvinCelcius.class);
        startActivityForResult(intent, KELVIN_TO_CELCIUS_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CELCIUS_TO_FAHRENHEIT_REQUEST_CODE && resultCode == RESULT_OK) {
            double hasilKonversiFahrenheit = data.getDoubleExtra("HASIL_KONVERSI_FAHRENHEIT", 0);

            // Tampilkan hasil konversi di TextView
            hasilTextView.setText("Hasil Konversi : " + hasilKonversiFahrenheit + " Fahrenheit");
            hasilTextView.setVisibility(View.VISIBLE);
        } else if (requestCode == CELCIUS_TO_KELVIN_REQUEST_CODE && resultCode == RESULT_OK) {
            double hasilKonversiKelvin = data.getDoubleExtra("HASIL_KONVERSI_KELVIN", 0);

            // Tampilkan hasil konversi di TextView
            hasilTextView.setText("Hasil Konversi : " + hasilKonversiKelvin + " Kelvin");
            hasilTextView.setVisibility(View.VISIBLE);
        } else if (requestCode == KELVIN_TO_CELCIUS_REQUEST_CODE && resultCode == RESULT_OK) {
            double hasilKonversiCelcius = data.getDoubleExtra("HASIL_KONVERSI_CELCIUS", 0);

            // Tampilkan hasil konversi di TextView
            hasilTextView.setText("Hasil Konversi : " + hasilKonversiCelcius + " celcius");
            hasilTextView.setVisibility(View.VISIBLE);
        } else if (requestCode == KELVIN_TO_FAHRENHEIT_REQUEST_CODE && resultCode == RESULT_OK) {
            double hasilKonversiFahrenheitKelvin = data.getDoubleExtra("HASIL_KONVERSI_FAHRENHEIT_KELVIN", 0);

            // Tampilkan hasil konversi di TextView
            hasilTextView.setText("Hasil Konversi : " + hasilKonversiFahrenheitKelvin + " Fahrenheit");
            hasilTextView.setVisibility(View.VISIBLE);
        }
    }

    public void launchTentang(View view) {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}

