package com.example.bmi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BMR_calculator : AppCompatActivity() {
    var a: EditText? = null
    var bmr = 0f
    var result: TextView? = null
    var chees: TextView? = null
    var calculation: String? = null
    var cheesburgers: String? = null
    private val bmrButton: Button? = null
    private var quizButton: Button? = null
    var radioGender: RadioGroup? = null
    var gender: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_m_r_calculator)
        a = findViewById(R.id.age)
        result = findViewById(R.id.result)
        chees = findViewById(R.id.chees)
        quizButton = findViewById<View>(R.id.goToQuiz) as Button?
        quizButton.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                goToQuiz()
            }
        })
    }

    fun onRadioButtonClicked(v: View) {
        when (v.getId()) {
            R.id.male -> gender = "m"
            R.id.female -> gender = "f"
        }
    }

    fun goToQuiz() {
        val intent = Intent(this, Quiz::class.java)
        startActivity(intent)
    }

    fun calculateBMR(view: View?) {
        val weight: Float = MainActivity.getW().getText().toString().toFloat()
        val height: Float = MainActivity.getH().getText().toString().toFloat()
        val age: Int = a.getText().toString().toInt()
        if (gender === "m") {
            bmr = 66.5f + 13.7f * weight + 5 * height - 6.76f * age
        } else if (gender === "f") {
            bmr = 655.1f + 9.6f * weight + 1.8f * height - 5.68f * age
        } else {
            calculation = "Check your gender"
            bmr = 2f
        }
        calculation = "BMR = " + String.format("%,.2f", bmr)
        if (weight <= 0.0f || height <= 0.0f) {
            calculation = "Fulfill BMI first"
        }
        val cheesburgerLeft = bmr.toInt() / 303
        cheesburgers = "You can eat $cheesburgerLeft cheesburgers daily in CoronaVirus Times"
        chees.setText(cheesburgers)
        result.setText(calculation)
    }
}