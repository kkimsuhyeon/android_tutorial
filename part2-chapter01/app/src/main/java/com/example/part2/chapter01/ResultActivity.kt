package com.example.part2.chapter01

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow

class ResultActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result)

        val height = intent.getIntExtra("height", 0)
        val weight = intent.getIntExtra("weight", 0)

        Log.d("resultActivity", "height $height, weight: $weight")

        val bmi = weight / (height / 100.0).pow(2.0);
        val resultText = when {
            bmi >= 35.0 -> "고도 비만"
            bmi >= 30 ->"중도 비만"
            else -> "저체중"
        }

        val resultValueTextView = findViewById<TextView>(R.id.bmiResultTextView)
        val resultStringTextview = findViewById<TextView>(R.id.resultTextview)

        resultValueTextView.text = bmi.toString()
        resultStringTextview.text = resultText
    }
}