package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private int states = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (1 == states) {
            setTheme(R.style.Default_TextSize_Small);
        } else if (2 == states) {
            setTheme(R.style.Default_TextSize_Middle);
        } else {
            setTheme(R.style.Default_TextSize_Big);
        }
    }
}