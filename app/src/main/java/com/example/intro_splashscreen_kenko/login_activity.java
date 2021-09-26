package com.example.intro_splashscreen_kenko;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class login_activity extends AppCompatActivity {
    private ImageView img1, appname;
    private LottieAnimationView l1, l2;
    private Button btn1, btn2;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        img1 = findViewById(R.id.image1);
        t1 = findViewById(R.id.kenko);
        l2 = findViewById(R.id.animated2);
        l1 = findViewById(R.id.animation1);
        btn1 = findViewById(R.id.letsgo);
        btn2 = findViewById(R.id.letsgo2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(login_activity.this, themenu.class);
                startActivity(i2);
            }
        });
        img1.animate().translationY(-3150).setDuration(1000).setStartDelay(2000);
        //  appname.animate().translationY(150).setDuration(1000).setStartDelay(4500);
        l1.animate().translationY(-100).setDuration(1000).setStartDelay(2000);
        btn1.animate().translationY(300).setDuration(1000).setStartDelay(2000);
        l2.animate().translationY(300).setDuration(1000).setStartDelay(2000);
        t1.animate().translationY(-75).setDuration(1000).setStartDelay(2000);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(login_activity.this, splash_login_2.class);
                startActivity(i1);
            }
        });
    }
}