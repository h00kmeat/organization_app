package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.myproject.activities.FirstScreen;
import com.example.myproject.activities.LoginActivities;
import com.example.myproject.activities.RegisterActivity;

public class MainActivity extends AppCompatActivity {
    private Button logIn;
    private Button signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logIn = findViewById(R.id.logIn);
        signIn = findViewById(R.id.reg_button);
        signIn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
        logIn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivities.class);
            startActivity(intent);
        });

    }
}