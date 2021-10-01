package com.example.kirozh.andersen_homework_2.Android_Studio_and_Hello_World

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.kirozh.andersen_homework_2.MainActivity

private val TAG_NAME = MainActivity::class.java.simpleName

class HelloWorldActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Проверяю работу log.d
        Log.d(TAG_NAME, "Happy Birthday to you")
        Toast.makeText(this, "See logs", Toast.LENGTH_LONG).show()

        // Проверяю работу Log.e
        try {10/0}
        catch (e: ArithmeticException){
            Log.e("MainActivityException", e.stackTraceToString())
        }

    }
}