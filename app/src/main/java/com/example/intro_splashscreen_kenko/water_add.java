package com.example.intro_splashscreen_kenko;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class water_add extends AppCompatActivity {
    public int limiter, count = 0, total = 1;
    TextView t1, t2;
    private Button add, sub;
    private ImageView i1, i2,i3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_add);
        t1 = findViewById(R.id.water_drunk);
        add = findViewById(R.id.wateradd);
        sub = findViewById(R.id.watersub);
        i1 = findViewById(R.id.imageView2);
        i2 = findViewById(R.id.imageView3);
        i3 = findViewById(R.id.imageView4);
        t2 = findViewById(R.id.water_quote);
        String[] s = {"Drinking water is like washing out your insides. The water will cleanse the system, fill you up, decrease your caloric load and improve the function of all your tissues.\n- Kevin R Stone",
                "Water is life's matter and matrix, mother and medium. There is no life without water.\n- Albert Szent-Gyorgyi", "In time and with water, everything changes.\n- Henry David Thoreau",
                "I believe that water is the only drink for a wise man. \n- Henry David Thoreau", "If there is magic on this planet, it is contained in water.\n- Loren Eiseley"};

        Random r = new Random();
        limiter = r.nextInt(5);
        t2.setText(s[limiter]);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count + 1;
                if (count == 1) {
                    t1.setText("You had " + count + " glass of water");
                } else if (count > 8) {
                    t1.setText(new StringBuilder().append("Congrats it seems you have drunk ").append(count).append(" glasses of water and is properly hydrated.").toString());
                } else {
                    t1.setText("You had " + count + " glasses of water");
                }
                i1.setImageResource(R.mipmap.water_add_onclick_round);
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        i1.setImageResource(R.mipmap.water_add_round);
                    }
                }, 150);
                if (count == 1){
                    i3.setImageResource(R.drawable.glass1);
                }
                else if(count == 2)
                    i3.setImageResource(R.drawable.glass2);
                else if(count == 3)
                    i3.setImageResource(R.drawable.glass3);
                else if(count == 4)
                    i3.setImageResource(R.drawable.glass4);
                else if(count == 5)
                    i3.setImageResource(R.drawable.glass5);
                else if(count == 6)
                    i3.setImageResource(R.drawable.glass6);
                else if(count == 7)
                    i3.setImageResource(R.drawable.glass7);
                else if(count == 8)
                    i3.setImageResource(R.drawable.glass8);
                else if(count == 9)
                    i3.setImageResource(R.drawable.glass9);
                else
                    i3.setImageResource(R.drawable.glass10);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count - 1;
                if (count > 0 && count < 8) {
                    t1.setText(new StringBuilder().append("It seems you have only drunk : ").append(count).append(" glasses of water").toString());
                } else if (count > 8) {
                    t1.setText(new StringBuilder().append("Congrats! It seems you have drunk ").append(count).append(" glasses of water and is properly hydrated.").toString());
                } else if (count <= 0) {
                    count = 0;
                    t1.setText("It seems you have not drunk enough water to stay hydrated");
                }

                i2.setImageResource(R.mipmap.water_subtract_onclick__round);

                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        i2.setImageResource(R.mipmap.water_subtract_onclick_round);

                    }
                }, 150);


                if (count == 0)
                    i3.setImageResource(R.drawable.worldwaterday);
                if (count == 1)
                    i3.setImageResource(R.drawable.glass1);
                else if(count == 2)
                    i3.setImageResource(R.drawable.glass2);
                else if(count == 3)
                    i3.setImageResource(R.drawable.glass3);
                else if(count == 4)
                    i3.setImageResource(R.drawable.glass4);
                else if(count == 5)
                    i3.setImageResource(R.drawable.glass5);
                else if(count == 6)
                    i3.setImageResource(R.drawable.glass6);
                else if(count == 7)
                    i3.setImageResource(R.drawable.glass7);
                else if(count == 8)
                    i3.setImageResource(R.drawable.glass8);
                else if(count == 9)
                    i3.setImageResource(R.drawable.glass9);
                else if( count >= 10)
                    i3.setImageResource(R.drawable.glass10);
            }
        });
    }
}