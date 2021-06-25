package com.example.myproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myproject.MainActivity;
import com.example.myproject.R;

public class LoginActivities extends AppCompatActivity{
    private Button register;
    private Button signIn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_activity);
//        logIn = findViewById(R.id.button2);
////        logIn.setOnClickListener(v -> {
////            Intent intent = new Intent(LoginActivities.this, RegisterActivity.class);
////            startActivity(intent);
////
////        });
        register = findViewById(R.id.reg_button);
        register.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivities.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}
