package com.example.kirozh.andersen_homework_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kirozh.andersen_homework_2.Activities_and_intents.MainIntentActivity
import com.example.kirozh.andersen_homework_2.Activities_and_intents.MainIntentHomeworkActivity
import com.example.kirozh.andersen_homework_2.Activity_lifecycle_and_state.CounterActivity
import com.example.kirozh.andersen_homework_2.Android_Studio_and_Hello_World.HelloWorldActivity
import com.example.kirozh.andersen_homework_2.Implicit_intents.ImplicitIntentActivity
import com.example.kirozh.andersen_homework_2.Interactive_UI.FirstInteractiveUIActivity
import com.example.kirozh.andersen_homework_2.Interactive_UI.SecondInteractiveUIActivity
import com.example.kirozh.andersen_homework_2.Text_and_Scrolling_Views.ScrollingTextActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 1.1 делаем запись в логе - пакет Android_Studio_and_Hello_world
//        val intent_1_1 = Intent(this, HelloWorldActivity::class.java)
//        startActivity(intent_1_1)
//        // 1.2a горизонтальное отображение layout-a - First_interactive_ui
//        val intent_1_2a = Intent(this, FirstInteractiveUIActivity::class.java)
//        startActivity(intent_1_2a)
        // 1.2b добавление кнопки zero - пакет First_interactive_ui
//        val intent_1_2b = Intent(this, SecondInteractiveUIActivity::class.java)
//        startActivity(intent_1_2b)
        // 1.3 скроллинг - пакет Text_and_Scrolling_Views
//        val intent_1_3 = Intent(this, ScrollingTextActivity::class.java)
//        startActivity(intent_1_3)
        // 2.1 вторая activity - пакет Activities_and_intents
        val intent_2_1 = Intent(this, MainIntentHomeworkActivity::class.java)
        startActivity(intent_2_1)
        // 2.2 сохранение и восстановление состояния экземпляра активити -
    // пакет Activity Lifecycle and state
//        val intent_2_2 = Intent(this, CounterActivity::class.java)
//        startActivity(intent_2_2)
        // 2.3 неявные интенты - пакет Implicit Intent
//        val intent_2_3 = Intent(this, ImplicitIntentActivity::class.java)
//        startActivity(intent_2_3)


    }
}