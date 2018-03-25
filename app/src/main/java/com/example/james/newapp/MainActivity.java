package com.example.james.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button welcomeFactButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeFactButton = findViewById(R.id.welcomeFactButton);

        welcomeFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factPage();

            }
        });
    }

    private void factPage() {
        Intent intent = new Intent(this, factActivity.class);
        startActivity(intent);
    }
}
