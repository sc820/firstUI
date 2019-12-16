package com.example.firstui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonRandom;
    private TextView textShow;
    private ProgressBar seekbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRandom = findViewById(R.id.buttonRandom);
        textShow = findViewById(R.id.textShow);
        seekbar = findViewById(R.id.seekBar);

        buttonRandom.setOnClickListener( new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                int number = new Random().nextInt(seekbar.getProgress());
                textShow.setText(Integer.toString(number));
            }
        });
    }
}
