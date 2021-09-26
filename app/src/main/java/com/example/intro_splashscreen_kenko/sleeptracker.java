package com.example.intro_splashscreen_kenko;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class sleeptracker extends AppCompatActivity {
    ImageView h;
    TextView t1 , name , t2;
    Timer t = new Timer();
    Timer ti = new Timer();
    private int count,c  =0;
    float duration;
    theusername u;
    String hour,minute,whour,wminute,meridian1,meridian2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,am,pm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleeptracker);
        name = findViewById(R.id.sleep_text);
        //get user name and assign it to the textview
        //String stringname;
        //stringname = u.give();
        //name.setText("HI "+stringname);
        t1=findViewById(R.id.whensleeptext);
        t2=findViewById(R.id.durationtext);
        h=findViewById(R.id.hourclock);
        am=findViewById(R.id.am_button);
        pm=findViewById(R.id.pm_button);
        b1=findViewById(R.id.i1);
        b2=findViewById(R.id.i2);
        b3=findViewById(R.id.i3);
        b4=findViewById(R.id.i4);
        b5=findViewById(R.id.i5);
        b6=findViewById(R.id.i6);
        b7=findViewById(R.id.i7);
        b8=findViewById(R.id.i8);
        b9=findViewById(R.id.i9);
        b10=findViewById(R.id.i10);
        b11=findViewById(R.id.i11);
        b12=findViewById(R.id.i12);

        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==0 && hour!=null && minute != null) {
                    meridian1 = "am";
                    t1.setText("So you slept from "+hour+minute+" "+meridian1);
                    c=1;
                }else if(c==1 && whour!=null && wminute!=null){
                    meridian2 ="am";
                    t1.setText("So you woke up at "+whour+wminute+" "+meridian2);
                    t2.setText("Your sleep has been recorded from "+hour+minute+" "+meridian1+" to "+whour+wminute+" "+meridian2);
                }else{
                    t1.setText("Please select the time");
                }
            }
        });
        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c==0 && hour!=null && minute!=null){
                    c=1;
                    meridian1 ="pm";
                    t1.setText("So you slept from "+hour+minute+" "+meridian1);
                }else if(c==1 && whour!=null && wminute!=null) {
                    meridian2 = "pm";
                    t1.setText("So you woke up at " + whour + wminute + " " + meridian2);
                    t2.setText("Your sleep has been recorded from "+hour+minute+" "+meridian1+" to "+whour+wminute+" "+meridian2);

                }else {
                    t1.setText("Please select the time");
                }
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count ==0){
                    hour="01:";
                    h.setImageResource(R.drawable.minuteclock);
                    count = 1;
                }else if (count == 1){
                    count = 2;
                    minute = "05";
                    t1.setText("Is it am / pm");
                    t =  new Timer();
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            h.setImageResource(R.drawable.comboclock);
                            t1.setText("And when did you wake up ?");
                        }
                    },3000);
                }else if (count == 2){

                    count = 3 ;
                    whour = "01:";
                    h.setImageResource(R.drawable.minuteclock);
                }
                else if (count == 3){
                    wminute = "05";
                    t1.setText("Is it am / pm");

                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count ==0){
                    hour="02:";
                    h.setImageResource(R.drawable.minuteclock);
                    count = 1;
                }else if (count == 1){
                    count = 2;
                    minute = "10";
                    t1.setText("Is it am / pm");
                    t =  new Timer();
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            h.setImageResource(R.drawable.comboclock);
                            t1.setText("And when did you wake up ?");
                        }
                    },3000);
                }else if (count == 2){

                    count = 3 ;
                    whour = "02:";
                    h.setImageResource(R.drawable.minuteclock);
                }
                else if (count == 3){
                    wminute = "10";
                    t1.setText("Is it am / pm");

                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count ==0){
                    hour="03:";
                    h.setImageResource(R.drawable.minuteclock);
                    count = 1;
                }else if (count == 1){
                    count = 2;
                    minute = "15";
                    t1.setText("Is it am / pm");
                    t =  new Timer();
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            h.setImageResource(R.drawable.comboclock);
                            t1.setText("And when did you wake up ?");
                        }
                    },3000);
                }else if (count == 2){

                    count = 3 ;
                    whour = "03:";
                    h.setImageResource(R.drawable.minuteclock);
                }
                else if (count == 3){
                    wminute = "15";
                    t1.setText("Is it am / pm");

                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count ==0){
                    hour="04:";
                    h.setImageResource(R.drawable.minuteclock);
                    count = 1;
                }else if (count == 1){
                    count = 2;
                    minute = "20";
                    t1.setText("Is it am / pm");
                    t =  new Timer();
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            h.setImageResource(R.drawable.comboclock);
                            t1.setText("And when did you wake up ?");
                        }
                    },3000);
                }else if (count == 2){

                    count = 3 ;
                    whour = "04:";
                    h.setImageResource(R.drawable.minuteclock);
                }
                else if (count == 3){
                    wminute = "20";
                    t1.setText("Is it am / pm");

                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count ==0){
                    hour="05:";
                    h.setImageResource(R.drawable.minuteclock);
                    count = 1;
                }else if (count == 1){
                    count = 2;
                    minute = "25";
                    t1.setText("Is it am / pm");
                    t =  new Timer();
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            h.setImageResource(R.drawable.comboclock);
                            t1.setText("And when did you wake up ?");
                        }
                    },3000);
                }else if (count == 2){

                    count = 3 ;
                    whour = "05:";
                    h.setImageResource(R.drawable.minuteclock);
                }
                else if (count == 3){
                    wminute = "25";
                    t1.setText("Is it am / pm");

                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count ==0){
                    hour="06:";
                    h.setImageResource(R.drawable.minuteclock);
                    count = 1;
                }else if (count == 1){
                    count = 2;
                    minute = "30";
                    t1.setText("Is it am / pm");
                    t =  new Timer();
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            h.setImageResource(R.drawable.comboclock);
                            t1.setText("And when did you wake up ?");
                        }
                    },3000);
                }else if (count == 2){

                    count = 3 ;
                    whour = "06:";
                    h.setImageResource(R.drawable.minuteclock);
                }
                else if (count == 3){
                    wminute = "30";
                    t1.setText("Is it am / pm");

                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count ==0){
                    hour="07:";
                    h.setImageResource(R.drawable.minuteclock);
                    count = 1;
                }else if (count == 1){
                    count = 2;
                    minute = "35";
                    t1.setText("Is it am / pm");
                    t =  new Timer();
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            h.setImageResource(R.drawable.comboclock);
                            t1.setText("And when did you wake up ?");
                        }
                    },3000);
                }else if (count == 2){

                    count = 3 ;
                    whour = "07:";
                    h.setImageResource(R.drawable.minuteclock);
                }
                else if (count == 3){
                    wminute = "35";
                    t1.setText("Is it am / pm");

                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count ==0){
                    hour="08:";
                    h.setImageResource(R.drawable.minuteclock);
                    count = 1;
                }else if (count == 1){
                    count = 2;
                    minute = "40";
                    t1.setText("Is it am / pm");
                    t =  new Timer();
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            h.setImageResource(R.drawable.comboclock);
                            t1.setText("And when did you wake up ?");
                        }
                    },3000);
                }else if (count == 2){

                    count = 3 ;
                    whour = "08:";
                    h.setImageResource(R.drawable.minuteclock);
                }
                else if (count == 3){
                    wminute = "40";
                    t1.setText("Is it am / pm");

                }
            }
        });


        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count ==0){
                    hour="10:";
                    h.setImageResource(R.drawable.minuteclock);
                    count = 1;
                }else if (count == 1){
                    count = 2;
                    minute = "50";
                    t1.setText("Is it am / pm");
                    t =  new Timer();
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            h.setImageResource(R.drawable.comboclock);
                            t1.setText("And when did you wake up ?");
                        }
                    },3000);
                }else if (count == 2){

                    count = 3 ;
                    whour = "10:";
                    h.setImageResource(R.drawable.minuteclock);
                }
                else if (count == 3){
                    wminute = "50";
                    t1.setText("Is it am / pm");

                }
            }
        });


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count ==0){
                    hour="11:";
                    h.setImageResource(R.drawable.minuteclock);
                    count = 1;
                }else if (count == 1){
                    count = 2;
                    minute = "50";
                    t1.setText("Is it am / pm");
                    t =  new Timer();
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            h.setImageResource(R.drawable.comboclock);
                            t1.setText("And when did you wake up ?");
                        }
                    },3000);
                }else if (count == 2){

                    count = 3 ;
                    whour = "11:";
                    h.setImageResource(R.drawable.minuteclock);
                }
                else if (count == 3){
                    wminute = "55";
                    t1.setText("Is it am / pm");

                }
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count ==0){
                    hour="12:";
                    h.setImageResource(R.drawable.minuteclock);
                    count = 1;
                }else if (count == 1){
                    count = 2;
                    minute = "00";
                    t1.setText("Is it am / pm");
                    t =  new Timer();
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            h.setImageResource(R.drawable.comboclock);
                            t1.setText("And when did you wake up ?");
                        }
                    },3000);
                }else if (count == 2){

                    count = 3 ;
                    whour = "12:";
                    h.setImageResource(R.drawable.minuteclock);
                }
                else if (count == 3){
                    wminute = "00";
                    t1.setText("Is it am / pm");

                }
            }
        });
    }
}