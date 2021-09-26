package com.example.intro_splashscreen_kenko;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class mental_wellbeing extends AppCompatActivity {
    Button bn1, bn2, bn3, bn4;
    TextView t1;
    private Intent quot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_wellbeing);
        t1 = findViewById(R.id.feels);
        bn1 = findViewById(R.id.joy);
        bn2 = findViewById(R.id.nue);
        bn3 = findViewById(R.id.sad);
        bn4 = findViewById(R.id.quotes);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(R.string.st1);

            }
        });


        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(R.string.st2);
            }
        });


        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(R.string.st3);
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Intent det = new Intent(mental_wellbeing.this, detoxcenter.class);
                        startActivity(det);

                    }
                }, 3000);
            }
        });


        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quot = new Intent(mental_wellbeing.this, quotes.class);
                startActivity(quot);
            }
        });

    }
}