package com.example.intro_splashscreen_kenko;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class intro_splash_screen_kenko_2 extends AppCompatActivity {
    private ImageView img1;
    private LottieAnimationView l1, l2;
    private Button btn1;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_splash_screen_kenko2);
        img1 = findViewById(R.id.image1);
        t1 = findViewById(R.id.kenko);
        l2 = findViewById(R.id.animated2);
        l1 = findViewById(R.id.animation1);
        btn1 = findViewById(R.id.letsgo);
        img1.animate().translationY(-3150).setDuration(1000).setStartDelay(4500);
        //  appname.animate().translationY(150).setDuration(1000).setStartDelay(4500);
        l1.animate().translationY(-100).setDuration(1000).setStartDelay(4500);
        btn1.animate().translationY(-100).setDuration(1000).setStartDelay(4500);
        l2.animate().translationY(-100).setDuration(1000).setStartDelay(4500);
        t1.animate().translationY(-75).setDuration(1000).setStartDelay(4500);

        btn1.setOnClickListener(v -> {
            Intent i1 = new Intent(intro_splash_screen_kenko_2.this, yourname.class);
            startActivity(i1);
        });
    }

}