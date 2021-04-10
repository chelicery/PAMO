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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class BMR_calculator extends AppCompatActivity {

    EditText a;
    float bmr = 0;
    TextView result, chees;
    String calculation, cheesburgers;
    private Button bmrButton;
    RadioGroup radioGender;
    String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_r_calculator);
        a = findViewById(R.id.age);
        result = findViewById(R.id.result);
        chees = findViewById(R.id.chees);


    }
    public void onRadioButtonClicked(View v) {
        switch (v.getId()) {
            case R.id.male:
                gender = "m";
                break;
            case R.id.female:
                gender = "f";
                break;
        }
    }
    public void calculateBMR(View view){
        float weight = Float.parseFloat(MainActivity.getW().getText().toString());
        float height = Float.parseFloat(MainActivity.getH().getText().toString());
        int age = Integer.parseInt(a.getText().toString());

        if (gender == "m"){
            bmr = 66.5f + (13.7f*weight) + (5*height) - (6.76f*age);
        } else if (gender == "f"){
            bmr = 655.1f + (9.6f*weight) + (1.8f*height) - (5.68f*age);
        } else {
            calculation = "Check your gender";
            bmr = 2;
        }

        calculation = "BMR = " + String.format("%,.2f", bmr);
        if(weight <= 0.0f || height <= 0.0f){
            calculation = "Fulfill BMI first";
        };
        int cheesburgerLeft = (int)bmr / 303;
        cheesburgers = "You can eat " + cheesburgerLeft + " cheesburgers daily in CoronaVirus Times" ;
        chees.setText(cheesburgers);
        result.setText(calculation);
    }






}