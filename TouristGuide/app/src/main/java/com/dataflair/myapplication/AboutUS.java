package com.dataflair.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AboutUS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        getSupportActionBar().hide();
    }
}