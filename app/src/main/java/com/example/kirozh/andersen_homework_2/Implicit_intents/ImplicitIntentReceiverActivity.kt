package com.example.kirozh.andersen_homework_2.Implicit_intents

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.kirozh.andersen_homework_2.R

class ImplicitIntentReceiverActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent_receiver)

        val iIntent = intent
        val uri: Uri? = iIntent.data

        if (uri != null){
            val uri_string = "URI: $uri"
            textView = findViewById(R.id.text_uri_message)
            textView.text = uri_string
        }
    }
}