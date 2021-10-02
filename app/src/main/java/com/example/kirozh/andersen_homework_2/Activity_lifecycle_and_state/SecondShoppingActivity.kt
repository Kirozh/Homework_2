package com.example.kirozh.andersen_homework_2.Activity_lifecycle_and_state

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.kirozh.andersen_homework_2.R

class SecondShoppingActivity : AppCompatActivity() {
    private lateinit var breadButton: Button
    private lateinit var tomatoButton: Button
    private lateinit var potatoButton: Button
    private lateinit var wineButton: Button
    private lateinit var milkButton: Button
    private lateinit var fishButton: Button
    private lateinit var meatButton: Button
    private lateinit var chickenButton: Button
    private lateinit var riceButton: Button
    private lateinit var macaronButton: Button
    private lateinit var bananaButton: Button
    private lateinit var mLocationEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_shopping)

        mLocationEditText = findViewById(R.id.locationEt)

        breadButton = findViewById(R.id.bread_button)
        tomatoButton = findViewById(R.id.tomato_button)
        potatoButton = findViewById(R.id.potato_button)
        wineButton = findViewById(R.id.wine_button)
        milkButton = findViewById(R.id.milk_button)
        fishButton = findViewById(R.id.fish_button)
        meatButton = findViewById(R.id.meat_button)
        chickenButton = findViewById(R.id.chicken_button)
        riceButton = findViewById(R.id.rice_button)
        macaronButton = findViewById(R.id.macaron_button)
        bananaButton = findViewById(R.id.banana_button)

        breadButton.setOnClickListener {
            chosenButton(breadButton)
        }
        tomatoButton.setOnClickListener {
            chosenButton(tomatoButton)
        }
        potatoButton.setOnClickListener {
            chosenButton(potatoButton)
        }
        wineButton.setOnClickListener {
            chosenButton(wineButton)
        }
        milkButton.setOnClickListener {
            chosenButton(milkButton)
        }
        fishButton.setOnClickListener {
            chosenButton(fishButton)
        }
        meatButton.setOnClickListener {
            chosenButton(meatButton)
        }
        chickenButton.setOnClickListener {
            chosenButton(chickenButton)
        }
        riceButton.setOnClickListener {
            chosenButton(riceButton)
        }
        macaronButton.setOnClickListener {
            chosenButton(macaronButton)
        }
        bananaButton.setOnClickListener {
            chosenButton(bananaButton)
        }

    }

    fun chosenButton(btn: Button){
        val shopReplyIntent = Intent(this, MainShoppingActivity::class.java)
        shopReplyIntent.putExtra(SHOP_EXTRA, btn.text.toString())
        setResult(Activity.RESULT_OK, shopReplyIntent)
        finish()
    }

    fun openLocationShoppingActivity(view: View?) {
        // Get the string indicating a location. Input is not validated; it is
        // passed to the location handler intact.
        val loc: String = mLocationEditText.text.toString()

        // Parse the location and create the intent.
        val addressUri = Uri.parse("geo:0,0?q=$loc")
        val intent = Intent(Intent.ACTION_VIEW, addressUri)

        // Find an activity to handle the intent, and start that activity.
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!")
        }
    }

    companion object{
        const val SHOP_EXTRA = "com.example.kirozh.andersen_homework_2.Activity_lifecycle_and_state.SHOP_EXTRA"
    }
}