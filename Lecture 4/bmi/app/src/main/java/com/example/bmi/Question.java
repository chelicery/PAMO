package com.example.bmi;

public class Question {

    public String questions[] = {
            "Which pathogen causes Covid-19?",
            "Which name stands for covid vaccine?",
            "What country is the origin of Covid-19?",
            "What are the common symptoms of COVID-19? ",
            "What is the best thing that helps you to avoid Covid-19? ",
            "Why in the name of Covid is a 'Corona' ?"
    };

    public String choices[][] = {
            {"Virus SARS-CoV-2", "bacterium E. coli", "Trojan Horse", "Bill Gates"},
            {"Opel Astra", "Ch. Fizer", "Modern Talking", "Sputnik V"},
            {"China", "U.S.A", "Tunis", "Poland"},
            {"Fever", "Tiredness", "Loose sense of taste and smell", "All of the above"},
            {"Prayer", "Washing hands", "Whisper instead of screaming", "Scrambled eggs"},
            {"First patient was a king", "Virus looks like has a crown", "Virus is attacking only nobly born people", "Both is hard to get"}
    };

    public String correctAnswer[] = {
            "Virus SARS-CoV-2",
            "Sputnik V",
            "China",
            "All of the above",
            "Washing hands",
            "Virus looks like has a crown"

    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
