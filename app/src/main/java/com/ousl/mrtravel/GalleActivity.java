package com.ousl.mrtravel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galle);

        //Arugambay card
        ConstraintLayout constraintLayout = findViewById(R.id.ArugamLayout);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleActivity.this, ArugamActivity.class);
                startActivity(intent);
            }
        });

        ImageView imageView = findViewById(R.id.backhome);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}