package com.example.intro_splashscreen_kenko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class yourname extends AppCompatActivity {
    Button bn;
    EditText t;
    String s;
    //theusername u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yourname);
        bn=findViewById(R.id.tokenkomain);
        t=findViewById(R.id.username_txt);
        s=t.getText().toString();
        //u.assignname(s);
        bn.setOnClickListener(v -> {
            Intent i = new Intent(yourname.this,MainActivity.class);
            startActivity(i);
        });
    }
}