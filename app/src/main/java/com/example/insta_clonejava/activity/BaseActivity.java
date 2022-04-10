package com.example.insta_clonejava.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.insta_clonejava.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}