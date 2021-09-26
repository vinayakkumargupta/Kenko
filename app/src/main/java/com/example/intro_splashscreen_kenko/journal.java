package com.example.intro_splashscreen_kenko;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class journal extends AppCompatActivity {
    Intent i1, i2;
    Button bn1;
    Editable s1;
    private EditText t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);
        bn1 = findViewById(R.id.jbutton);
        t1 = findViewById(R.id.jedit);
        s1 = t1.getText();

        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1 = new Intent(journal.this, whyjournal.class);
                startActivity(i1);
            }
        });

    }
}