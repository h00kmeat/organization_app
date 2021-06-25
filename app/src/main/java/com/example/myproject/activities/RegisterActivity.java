 package com.example.myproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myproject.R;
import com.google.firebase.FirebaseApiNotAvailableException;

 public class RegisterActivity extends AppCompatActivity {
    private Button logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        logIn = findViewById(R.id.logIn_RegistrationPage);
        logIn.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterActivity.this, LoginActivities.class);
            startActivity(intent);
        });
    }
}