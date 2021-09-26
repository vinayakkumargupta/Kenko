package com.example.intro_splashscreen_kenko;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class quotes extends AppCompatActivity {
    float x1, x2, y1, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);
        TextView t1;
        t1 = findViewById(R.id.quoted);
        Random r = new Random();
        int integer = r.nextInt(15);
        String[] sq = {"William James\n" +
                "Act as if what you do makes a difference. It does", "Keep your face to the sunshine and you cannot see a shadow. \n— Helen Keller", "Yesterday is not ours to recover, but tomorrow is ours to win or lose. \n— Lyndon B. Johnson", "In order to carry a positive action we must develop here a positive vision. \n— Dalai Lama", "I always like to look on the optimistic side of life, but I am realistic enough to know that life is a complex matter. \n— Walt Disney", "Positive thinking will let you do everything better than negative thinking will.\n — Zig Ziglar", "Pessimism leads to weakness, optimism to power.\n — William James", "You can’t make positive choices for the rest of your life without an environment that makes those choices easy, natural, and enjoyable.\n— Deepak Chopra", "The thing that lies at the foundation of positive change, the way I see it, is service to a fellow human being.\n— Lee lacocca", "“Positive thinking is more than just a tagline. It changes the way we behave. And I firmly believe that when I am positive, it not only makes me better, but it also makes those around me better.\n — Harvey Mackay",
                "In every day, there are 1,440 minutes. That means we have 1,440 daily opportunities to make a positive impact.\n — Les Brown", "I’m a very positive thinker, and I think that is what helps me the most in difficult moments.\n — Roger Federer"
                , "Perpetual optimism is a force multiplier. \n— Colin Powell", "Attitude is a little thing that makes a big difference.” \n— Winston Churchill", "Let us rise up and be thankful, for if we didn’t learn a lot today, at least we learned a little, and if we didn’t learn a little, at least we didn’t get sick, and if we got sick, at least we didn’t die; so let us all be thankful.\n— Buddha"};
        t1.setText(sq[integer]);
    }

}