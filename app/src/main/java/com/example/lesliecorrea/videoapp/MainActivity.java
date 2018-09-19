package com.example.lesliecorrea.videoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.lesliecorrea.videoapp.kotlin.KotlinVideoActivity;

public class MainActivity extends AppCompatActivity {

    Button JavaButton,KotlinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JavaButton = (Button) findViewById(R.id.javaButton);
        KotlinButton = (Button) findViewById(R.id.kotlinButton);

        //Handle button click
        JavaButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(MainActivity.this, JavaVideoActivity.class);
                startActivity(nextActivity);
            }
        });
        KotlinButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(MainActivity.this, KotlinVideoActivity.class);
                startActivity(nextActivity);
            }
        });

    }
}
