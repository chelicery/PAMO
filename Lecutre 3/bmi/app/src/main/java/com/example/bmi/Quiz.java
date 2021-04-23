package com.example.bmi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

public class Quiz extends AppCompatActivity implements View.OnClickListener {
    Button ans_one, ans_two, ans_three, ans_four;
    TextView tv_question;
    private int question_number = 0;
    private static int static_score;
    public int score = 0;
    private Question question = new Question();

    private String answer;
    private int questionLength = question.questions.length;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        ans_one = (Button) findViewById(R.id.ans_one);
        ans_one.setOnClickListener(this);
        ans_two = (Button) findViewById(R.id.ans_two);
        ans_two.setOnClickListener(this);
        ans_three = (Button) findViewById(R.id.ans_three);
        ans_three.setOnClickListener(this);
        ans_four = (Button) findViewById(R.id.ans_four);
        ans_four.setOnClickListener(this);
        tv_question = (TextView) findViewById(R.id.tv_question);
        NextQuestion(question_number);
    }

    @Override
    public void onClick(View v) {
        if (question_number >= 6) {
            static_score = score;
            goToScore();
        } else {
        switch (v.getId()) {
            case R.id.ans_one:
                if (ans_one.getText() == answer) {
                    score+=1;
                    NextQuestion(question_number);

                } else {
                    NextQuestion(question_number);
                }
                break;

            case R.id.ans_two:
                if (ans_two.getText() == answer) {
                    score+=1;
                    NextQuestion(question_number);
                } else {
                    NextQuestion(question_number);
                }
                break;

            case R.id.ans_three:
                if (ans_three.getText() == answer) {
                    score+=1;
                    NextQuestion(question_number);
                } else {
                    NextQuestion(question_number);
                }

                break;

            case R.id.ans_four:
                if (ans_four.getText() == answer) {
                    score+=1;
                    NextQuestion(question_number);
                } else {
                    NextQuestion(question_number);
                }
                break;
        }
        }

    }



    private void NextQuestion(int num) {
        tv_question.setText(question.getQuestion(num));
        ans_one.setText(question.getchoice1(num));
        ans_two.setText(question.getchoice2(num));
        ans_three.setText(question.getchoice3(num));
        ans_four.setText(question.getchoice4(num));
        question_number += 1;
        answer = question.getCorrectAnswer(num);
    }

    public void goToScore() {
        Intent intent = new Intent(this, Score.class);
        startActivity(intent);
    }

    public static int getScore(){
        return static_score;
    }

}