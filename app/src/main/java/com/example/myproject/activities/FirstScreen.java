package com.example.myproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myproject.R;

public class FirstScreen extends AppCompatActivity {
    private Button  signIn;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        signIn = findViewById(R.id.signIn);
//        signIn.setOnClickListener(v -> {
//            Intent intent = new Intent(FirstScreen.this, LoginActivities.class);
//            startActivity(intent);
//
//        });

    }
}