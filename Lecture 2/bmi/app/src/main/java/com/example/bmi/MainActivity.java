package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static EditText w,h;
    private TextView result;
    private String calculation, BMIresult;
    private Button bmrButton;
    public static int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this, WelcomeScreen.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);


        w  = findViewById(R.id.weight);
        h  = findViewById(R.id.height);
        result = findViewById(R.id.result);

        bmrButton = (Button) findViewById(R.id.button);
        bmrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                goToBmrCalculator();
            }
        });
    }

    public void calculateBMI(View view){
        double weight = Float.parseFloat(w.getText().toString());
        double height = Float.parseFloat(h.getText().toString())/100;
        double bmi = weight / Math.pow(height, 2);
        calculation = "BMI = " + String.format("%,.2f", bmi);
        result.setText(calculation);
    }

    public void goToBmrCalculator(){
        Intent intent = new Intent(this, BMR_calculator.class);
        startActivity(intent);
    };

    public static EditText getW(){
        return w;
    }
    public EditText getH(){
        return h;
    }




}