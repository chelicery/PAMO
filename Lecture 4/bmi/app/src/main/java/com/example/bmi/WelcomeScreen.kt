package com.example.bmi

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)
        Handler().postDelayed(object : Runnable() {
            override fun run() {
                val homeIntent = Intent(this@WelcomeScreen, MainActivity::class.java)
                startActivity(homeIntent)
                finish()
            }
        }, SPLASH_TIME_OUT)
    }

    companion object {
        var SPLASH_TIME_OUT = 2000
    }
}