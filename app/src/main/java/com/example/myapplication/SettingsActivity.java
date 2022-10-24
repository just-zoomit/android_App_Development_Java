package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //Recieve data passed from input on Home screen
        Intent i = getIntent();
        String message = i.getStringExtra("World");
        ((TextView) findViewById(R.id.textView)).setText(message);
    }
}