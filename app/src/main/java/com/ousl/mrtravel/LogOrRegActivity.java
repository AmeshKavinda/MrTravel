package com.ousl.mrtravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogOrRegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_or_reg);

        Button button = findViewById(R.id.GoLog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogOrRegActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        Button button1 = findViewById(R.id.GoReg);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogOrRegActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}