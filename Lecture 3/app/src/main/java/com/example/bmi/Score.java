package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity {
    TextView result;
    String answer = " Your score is: " + Quiz.getScore();
    Button home_button, stats_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        result = findViewById(R.id.result);
        result.setText(answer);

        home_button = (Button) findViewById(R.id.go_to_home);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                go_to_home();
            };
         });

        stats_button = (Button) findViewById(R.id.go_to_statistics);
        stats_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                go_to_stats();
            };
        });

    }

    public void go_to_home(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    };

    public void go_to_stats(){
        Intent intent = new Intent(this, Stats.class);
        startActivity(intent);
    };
}
