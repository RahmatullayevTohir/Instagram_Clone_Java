package com.example.insta_clonejava.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.insta_clonejava.R;

/**
 *  In SplashActivity, user can visit to SignInActivity or MainActivity
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        initViews();
    }

    private void initViews() {
        countDownTimer();
    }

    private void countDownTimer() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,SignInActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}