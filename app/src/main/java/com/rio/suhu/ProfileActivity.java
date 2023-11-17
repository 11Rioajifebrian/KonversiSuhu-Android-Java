package com.rio.suhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void visitWeb(View view) {
        Uri webAdress = Uri.parse("https://www.unmuhpnk.ac.id");
        Intent intent = new Intent(Intent.ACTION_VIEW, webAdress);
        startActivity(intent);
    }
    public void visitTelepon(View view) {
        Uri phoneNumber = Uri.parse("tel:+6285821263408");
        Intent intent = new Intent(Intent.ACTION_DIAL, phoneNumber);
        startActivity(intent);
    }
    public void visitMaps(View view) {
        Uri latLng = Uri.parse("geo:-0.038815, 109.364296");
        Intent intent = new Intent(Intent.ACTION_VIEW, latLng);
        startActivity(intent);
    }
}