package com.example.bmi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Quiz : AppCompatActivity(), View.OnClickListener {
    var ans_one: Button? = null
    var ans_two: Button? = null
    var ans_three: Button? = null
    var ans_four: Button? = null
    var tv_question: TextView? = null
    private var question_number = 0
    var score = 0
    private val question = Question()
    private var answer: String? = null
    private val questionLength = question.questions.size
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        ans_one = findViewById<View>(R.id.ans_one) as Button?
        ans_one.setOnClickListener(this)
        ans_two = findViewById<View>(R.id.ans_two) as Button?
        ans_two.setOnClickListener(this)
        ans_three = findViewById<View>(R.id.ans_three) as Button?
        ans_three.setOnClickListener(this)
        ans_four = findViewById<View>(R.id.ans_four) as Button?
        ans_four.setOnClickListener(this)
        tv_question = findViewById<View>(R.id.tv_question) as TextView?
        NextQuestion(question_number)
    }

    fun onClick(v: View) {
        if (question_number >= 6) {
            static_score = score
            goToScore()
        } else {
            when (v.getId()) {
                R.id.ans_one -> if (ans_one.getText() === answer) {
                    score += 1
                    NextQuestion(question_number)
                } else {
                    NextQuestion(question_number)
                }
                R.id.ans_two -> if (ans_two.getText() === answer) {
                    score += 1
                    NextQuestion(question_number)
                } else {
                    NextQuestion(question_number)
                }
                R.id.ans_three -> if (ans_three.getText() === answer) {
                    score += 1
                    NextQuestion(question_number)
                } else {
                    NextQuestion(question_number)
                }
                R.id.ans_four -> if (ans_four.getText() === answer) {
                    score += 1
                    NextQuestion(question_number)
                } else {
                    NextQuestion(question_number)
                }
            }
        }
    }

    private fun NextQuestion(num: Int) {
        tv_question.setText(question.getQuestion(num))
        ans_one.setText(question.getchoice1(num))
        ans_two.setText(question.getchoice2(num))
        ans_three.setText(question.getchoice3(num))
        ans_four.setText(question.getchoice4(num))
        question_number += 1
        answer = question.getCorrectAnswer(num)
    }

    fun goToScore() {
        val intent = Intent(this, Score::class.java)
        startActivity(intent)
    }

    companion object {
        private var static_score = 0
        fun getScore(): Int {
            return static_score
        }
    }
}