package com.example.intro_splashscreen_kenko;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class sos_page extends AppCompatActivity {
    Button bn1, bn2, bn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos_page);
        bn1 = findViewById(R.id.button);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(sos_page.this, covidresources.class);
                startActivity(i1);
            }
        });
        bn2 = findViewById(R.id.button2);
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(sos_page.this, heartaidcasualty.class);
                startActivity(i2);
            }
        });

        bn3 = findViewById(R.id.button4);
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(sos_page.this, accident_assistance.class);
                startActivity(i3);
            }
        });

    }
}