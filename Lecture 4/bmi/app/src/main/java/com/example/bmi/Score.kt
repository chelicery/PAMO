package com.example.bmi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Score : AppCompatActivity() {
    var result: TextView? = null
    var answer = " Your score is: " + Quiz.getScore()
    var home_button: Button? = null
    var stats_button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        result = findViewById(R.id.result)
        result.setText(answer)
        home_button = findViewById<View>(R.id.go_to_home) as Button?
        home_button.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                go_to_home()
            }
        })
        stats_button = findViewById<View>(R.id.go_to_statistics) as Button?
        stats_button.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                go_to_stats()
            }
        })
    }

    fun go_to_home() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun go_to_stats() {
        val intent = Intent(this, Stats::class.java)
        startActivity(intent)
    }
}