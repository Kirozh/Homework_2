package com.example.kirozh.andersen_homework_2.Activity_lifecycle_and_state

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.kirozh.andersen_homework_2.R

class CounterActivity : AppCompatActivity() {
    private var mCount = 0
    private lateinit var countTextView: TextView
    private lateinit var countButton: Button
    private lateinit var countEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        countTextView = findViewById(R.id.countTextView)
        countButton = findViewById(R.id.count_button)
        countEditText = findViewById(R.id.countEditText)

        val count = savedInstanceState?.getInt("count", 0) ?: 0
        countTextView.text = count.toString()
    }

    override fun onStart(){
        super.onStart()
        Log.d("LOG_TAG", "onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.d("LOG_TAG", "onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.d("LOG_TAG", "onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d("LOG_TAG", "onStop")
    }
    
    fun countUp(view: View) {
        ++mCount
        countTextView.text = mCount.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count", mCount)
        Log.d("TAG_SAVE", mCount.toString())
    }
}