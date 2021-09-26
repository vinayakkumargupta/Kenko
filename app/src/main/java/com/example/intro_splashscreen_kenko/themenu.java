package com.example.intro_splashscreen_kenko;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class themenu extends AppCompatActivity {
    Intent i1, i2, i3, i4;
    private Button water, nutrition, sleep, mentalh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themenu);
        water = findViewById(R.id.waterintake);
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1 = new Intent(themenu.this, water_add.class);
                startActivity(i1);

            }
        });
        nutrition = findViewById(R.id.nutrition);
        nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i2 = new Intent(themenu.this, nutrition.class);
                startActivity(i2);

            }
        });
        sleep = findViewById(R.id.sleep);
        sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i3 = new Intent(themenu.this, sleeptracker.class);
                startActivity(i3);

            }
        });

        mentalh = findViewById(R.id.mental);
        mentalh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i4 = new Intent(themenu.this, mental_wellbeing.class);
                startActivity(i4);
            }
        });
    }
}
