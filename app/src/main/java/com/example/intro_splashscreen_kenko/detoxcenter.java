package com.example.intro_splashscreen_kenko;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class detoxcenter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detoxcenter);
        //set the tag here, so that user name is displayed there.
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i1 = new Intent(detoxcenter.this, journal.class);
                startActivity(i1);

            }
        }, 12000);
    }
}