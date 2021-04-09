package com.example.bmi;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMR_calculator extends AppCompatActivity {

    EditText a;
    //EditText w =
    TextView result;
    String calculation;
    private Button bmrButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_r_calculator);

        result = findViewById(R.id.result);


    }

    public void calculateBMI(View view){
//        double weight = Float.parseFloat(w.getText().toString());
//        double height = Float.parseFloat(h.getText().toString())/100;
        double bmi = 23;
        calculation = "BMI = " + String.format("%,.2f", bmi);
        result.setText(calculation);
    }

}