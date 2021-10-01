package com.example.kirozh.andersen_homework_2.Interactive_UI

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kirozh.andersen_homework_2.R

class FirstInteractiveUIActivity : AppCompatActivity() {
    private var mCount = 0
    private lateinit var mToastButton: Button
    private lateinit var mCountButton: Button
    private lateinit var mTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_interactive_ui_activity)

        mToastButton = findViewById(R.id.button_toast)
        mCountButton = findViewById(R.id.button_count)
        mTextView = findViewById(R.id.textView)

    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG).show()
    }

    fun countUp(view: View) {
        ++mCount
        mTextView.text = (mCount.toString())
    }
}