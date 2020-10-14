package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MoveActivity extends AppCompatActivity {
    private TextView textextra;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
        
        textextra = findViewById(R.id.scrol);
        Intent move = getIntent();
        text = move.getStringExtra("one");
        textextra.setText(text);
        
        TextView tv = (TextView)findViewById(R.id.scrol);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }
}