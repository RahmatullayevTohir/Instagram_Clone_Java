package com.example.insta_clonejava.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.insta_clonejava.R;

/**
 * In SignUpActivity, user can login using email, password
 */

public class SignInActivity extends AppCompatActivity {
    static final String TAG = SignInActivity.class.getSimpleName();
    static EditText et_email;
    static EditText et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initViews();
    }

    private void initViews() {
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        Button b_signin = findViewById(R.id.b_signin);
        b_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callMainActivity();
            }
        });
        TextView tv_signup = findViewById(R.id.tv_signup);
        tv_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callSignUpActivity();
            }
        });
    }

    private void callMainActivity(){
        Intent intent = new Intent(SignInActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void callSignUpActivity(){
        Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);
        startActivity(intent);
    }
}