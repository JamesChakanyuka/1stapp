package com.example.james.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class factActivity extends AppCompatActivity {

    private TextView factTextView;
    private Button newFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact);

        factTextView = findViewById(R.id.factTextView);
        newFactButton = findViewById(R.id.newFactButton);

        newFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] facts = {
                        "Education is not preparation for life; education is life itself. John Dewey",
                        "Develop a passion for learning. If you do, you will never cease to grow. Anthony J. D'Angelo",
                        "Education is what remains after one has forgotten what one has learned in school. Albert Einstein",
                };
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(facts.length);
                String fact = facts[randomNumber] + "";
                factTextView.setText(fact);
            }
        });
    }
}
