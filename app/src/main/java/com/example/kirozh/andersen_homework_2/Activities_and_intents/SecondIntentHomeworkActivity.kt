package com.example.kirozh.andersen_homework_2.Activities_and_intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.example.kirozh.andersen_homework_2.R


class SecondIntentHomeworkActivity : AppCompatActivity() {

    private lateinit var countTextView: TextView
    private lateinit var helloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_intent_homework)

        helloTextView = findViewById(R.id.helloTextView)
        countTextView = findViewById(R.id.countTextView)

        intent
        val message = intent.getStringExtra(MainIntentHomeworkActivity.EXTRA_MESSAGE)

        countTextView.text = message
    }
}