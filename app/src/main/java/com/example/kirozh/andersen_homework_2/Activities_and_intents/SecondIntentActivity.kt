package com.example.kirozh.andersen_homework_2.Activities_and_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.kirozh.andersen_homework_2.R

private val LOG_TAG = SecondIntentActivity::class.java.simpleName

class SecondIntentActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var mReply: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_intent)

        mReply = findViewById(R.id.editText_second)
        textView = findViewById(R.id.text_message)

        intent
        val message = intent.getStringExtra(MainIntentActivity.EX_MESSAGE)
        textView.text = message
    }

    fun returnReply(view: View) {
        val reply = mReply.text.toString()
        val replyIntent = Intent()
        replyIntent.putExtra(EX_REPLY, reply)
        setResult(RESULT_OK, replyIntent)
        Log.d(LOG_TAG, "End SecondActivity")
        mReply.text.clear()
        finish()
    }

    companion object {
        const val EX_REPLY: String = "com.example.android.twoactivities.extra.REPLY"
    }
}