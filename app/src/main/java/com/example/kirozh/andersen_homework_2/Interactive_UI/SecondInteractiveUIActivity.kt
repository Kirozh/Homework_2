package com.example.kirozh.andersen_homework_2.Interactive_UI

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kirozh.andersen_homework_2.R
class SecondInteractiveUIActivity: AppCompatActivity() {
    private var mCount = 0
    private lateinit var mToastButton: Button
    private lateinit var mCountButton: Button
    private lateinit var mSetZero: Button
    private lateinit var mTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_interactive_uiactivity)

        mToastButton = findViewById(R.id.button_toast)
        mCountButton = findViewById(R.id.button_count)
        mTextView = findViewById(R.id.show_count)
        mSetZero = findViewById(R.id.button_zero)
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG).show()
    }

    @SuppressLint("ResourceAsColor")
    fun countUp(view: View) {
        ++mCount

        if (mCount != 0)
            mSetZero.setBackgroundColor(0xFF8BC34A.toInt())
            mCountButton.setBackgroundColor(0xFFB30B08.toInt())

        if (mCount % 2 == 0)
            mCountButton.setBackgroundColor(0xFFB30B08.toInt())
        else
            mCountButton.setBackgroundColor(0xFF1839F1.toInt())

        mTextView.text = (mCount.toString());
    }

    @SuppressLint("ResourceAsColor")
    fun setZero(view: View) {
        mCount = 0
        mSetZero.setBackgroundColor(0xFF7A7A7A.toInt())
        mCountButton.setBackgroundColor(0xFF1839F1.toInt())
        mTextView.text = (mCount.toString())
    }
}