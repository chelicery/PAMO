package com.example.bmi

class Question {
    var questions = arrayOf(
            "Which pathogen causes Covid-19?",
            "Which name stands for covid vaccine?",
            "What country is the origin of Covid-19?",
            "What are the common symptoms of COVID-19? ",
            "What is the best thing that helps you to avoid Covid-19? ",
            "Why in the name of Covid is a 'Corona' ?"
    )
    var choices = arrayOf(arrayOf("Virus SARS-CoV-2", "bacterium E. coli", "Trojan Horse", "Bill Gates"), arrayOf("Opel Astra", "Ch. Fizer", "Modern Talking", "Sputnik V"), arrayOf("China", "U.S.A", "Tunis", "Poland"), arrayOf("Fever", "Tiredness", "Loose sense of taste and smell", "All of the above"), arrayOf("Prayer", "Washing hands", "Whisper instead of screaming", "Scrambled eggs"), arrayOf("First patient was a king", "Virus looks like has a crown", "Virus is attacking only nobly born people", "Both is hard to get"))
    var correctAnswer = arrayOf(
            "Virus SARS-CoV-2",
            "Sputnik V",
            "China",
            "All of the above",
            "Washing hands",
            "Virus looks like has a crown"
    )

    fun getQuestion(a: Int): String {
        return questions[a]
    }

    fun getchoice1(a: Int): String {
        return choices[a][0]
    }

    fun getchoice2(a: Int): String {
        return choices[a][1]
    }

    fun getchoice3(a: Int): String {
        return choices[a][2]
    }

    fun getchoice4(a: Int): String {
        return choices[a][3]
    }

    fun getCorrectAnswer(a: Int): String {
        return correctAnswer[a]
    }
}