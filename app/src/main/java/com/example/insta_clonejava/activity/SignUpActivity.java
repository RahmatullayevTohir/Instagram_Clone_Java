package com.example.insta_clonejava.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.insta_clonejava.R;

/**
 * In SignUpActivity, user can signup using fullname, email, password
 */

public class SignUpActivity extends AppCompatActivity {
    String TAG = SignUpActivity.class.getSimpleName();
    EditText et_fullname;
    EditText et_password;
    EditText et_cpassword;
    EditText et_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initViews();
    }

    private void initViews() {
        et_fullname = findViewById(R.id.et_fullname);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        et_cpassword = findViewById(R.id.et_cpassword);

        Button b_signup = findViewById(R.id.b_signup);
        b_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        TextView tv_signin = findViewById(R.id.tv_signin);
        tv_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}