package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText w,h;
    TextView result;
    String calculation, BMIresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        w  = findViewById(R.id.weight);
        h  = findViewById(R.id.height);
        result = findViewById(R.id.result);
    }

    public void calculateBMI(View view){
        double weight = Float.parseFloat(w.getText().toString());
        double height = Float.parseFloat(h.getText().toString())/100;


        double bmi = weight / Math.pow(height, 2);
        calculation = "BMI = " + String.format("%,.2f", bmi);

        result.setText(calculation);

    }




}