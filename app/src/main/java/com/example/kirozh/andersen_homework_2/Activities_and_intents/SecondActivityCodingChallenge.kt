package com.example.kirozh.andersen_homework_2.Activities_and_intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.kirozh.andersen_homework_2.Activities_and_intents.MainActivityCodingChallenge.Companion.SONG_TITLE
import com.example.kirozh.andersen_homework_2.R

class SecondActivityCodingChallenge : AppCompatActivity() {
    private lateinit var songTitle: TextView
    private lateinit var songText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_coding_challenge)

        songTitle = findViewById(R.id.song_title_text_view)
        songText = findViewById(R.id.song_text_textView)

        val song = intent.getStringExtra(SONG_TITLE)
        when(song){
            "gruppa_krovi" -> {
                songTitle.setText(R.string.who_doesnt_celebrate_christmas_title)
                songText.setText(R.string.gruppa_krovi_text)
            }
            "sun_star" -> {
                songTitle.setText(R.string.macaroons_title)
                songText.setText(R.string.sun_star_text)
            }
            "vosmiklassnitsa" -> {
                songTitle.setText(R.string.was_it_better_before_title)
                songText.setText(R.string.vosmiklassnitsa_text)
            }
        }
    }
}