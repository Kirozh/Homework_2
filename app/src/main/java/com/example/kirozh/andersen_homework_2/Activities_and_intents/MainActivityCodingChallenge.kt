package com.example.kirozh.andersen_homework_2.Activities_and_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.kirozh.andersen_homework_2.R

class MainActivityCodingChallenge : AppCompatActivity() {
    private lateinit var gruppaKroviButton:Button
    private lateinit var sunStarButton:Button
    private lateinit var vosmiklassnitsaButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_coding_challenge)

        gruppaKroviButton = findViewById(R.id.gruppa_krovi_button)
        sunStarButton = findViewById(R.id.zvezda_sun_button)
        vosmiklassnitsaButton = findViewById(R.id.vosmiklassnitsa_button)

        val songIntent: Intent = Intent(this,SecondActivityCodingChallenge::class.java)

        gruppaKroviButton.setOnClickListener {
            songIntent.putExtra(SONG_TITLE, "gruppa_krovi")
            startActivity(songIntent)
        }

        sunStarButton.setOnClickListener {
            songIntent.putExtra(SONG_TITLE, "sun_star")
            startActivity(songIntent)
        }

        vosmiklassnitsaButton.setOnClickListener {
            songIntent.putExtra(SONG_TITLE, "vosmiklassnitsa")
            startActivity(songIntent)
        }
    }

    companion object{
        const val SONG_TITLE = "com.example..kirozh.andersen_homework_2.Activities_and_intents.SONG_TILE"
    }

}