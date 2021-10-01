package com.example.kirozh.andersen_homework_2.Activities_and_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.kirozh.andersen_homework_2.R


class MainIntentHomeworkActivity : AppCompatActivity() {
    private var mCount = 0
    private lateinit var mSayHelloButton: Button
    private lateinit var mCountButton: Button
    private lateinit var mTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_intent_homework)

        mSayHelloButton = findViewById(R.id.button_sayHello)
        mCountButton = findViewById(R.id.button_count)
        mTextView = findViewById(R.id.countTextView)

    }

    fun countUp(view: View) {
        ++mCount
        mTextView.text = (mCount.toString())
    }

    fun launchSayHelloActivity(view: View) {
        val message = mTextView.text.toString()
        val sayHelloIntent = Intent(this, SecondIntentHomeworkActivity::class.java)
        sayHelloIntent.putExtra(EXTRA_MESSAGE, message)
        startActivity(sayHelloIntent)
    }

    companion object{
        const val EXTRA_MESSAGE = "com.example.kirozh.andersen_homework_2.Activities_and_intents.extra"
    }
}