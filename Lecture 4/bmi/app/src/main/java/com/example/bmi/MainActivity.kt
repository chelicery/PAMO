package com.example.bmi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var result: TextView? = null
    private var calculation: String? = null
    private val BMIresult: String? = null
    private var bmrButton: Button? = null
    private var quizButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        w = findViewById(R.id.weight)
        h = findViewById(R.id.height)
        result = findViewById(R.id.result)
        bmrButton = findViewById<View>(R.id.button) as Button?
        bmrButton.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                goToBmrCalculator()
            }
        })
        quizButton = findViewById<View>(R.id.quiz) as Button?
        quizButton.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                goToQuiz()
            }
        })
    }

    fun calculateBMI(view: View?) {
        val weight: Double = w.getText().toString().toFloat().toDouble()
        val height: Double = (h.getText().toString().toFloat() / 100).toDouble()
        val bmi: Double = weight / java.lang.Math.pow(height, 2.0)
        calculation = "BMI = " + String.format("%,.2f", bmi)
        result.setText(calculation)
    }

    fun goToBmrCalculator() {
        val intent = Intent(this, BMR_calculator::class.java)
        startActivity(intent)
    }

    fun goToQuiz() {
        val intent = Intent(this, Quiz::class.java)
        startActivity(intent)
    }

    companion object {
        private var w: EditText? = null
        private var h: EditText? = null
        fun getW(): EditText? {
            return w
        }

        fun getH(): EditText? {
            return h
        }
    }
}