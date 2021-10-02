package com.example.kirozh.andersen_homework_2.Activity_lifecycle_and_state

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.core.view.marginStart
import com.example.kirozh.andersen_homework_2.Activity_lifecycle_and_state.SecondShoppingActivity.Companion.SHOP_EXTRA
import com.example.kirozh.andersen_homework_2.R
private const val REQUEST_CODE_SHOP = 0

class MainShoppingActivity : AppCompatActivity() {
    private lateinit var addItemButton: Button
    private lateinit var shopList: ArrayList<String>
    private lateinit var itemListView: ListView
    private lateinit var adapter:ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_shopping)

        addItemButton = findViewById(R.id.addItemButton)
        itemListView = findViewById(R.id.list_view)

        shopList = if (savedInstanceState?.getStringArrayList("shopList") != null)
            savedInstanceState.getStringArrayList("shopList")!!
        else
            ArrayList(0)

        adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
            shopList)

        itemListView.adapter = adapter

        addItemButton.setOnClickListener {
            val shopIntent = Intent(this, SecondShoppingActivity::class.java)
            startActivityForResult(shopIntent, REQUEST_CODE_SHOP)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode != Activity.RESULT_OK)
            return
        if (requestCode == REQUEST_CODE_SHOP) {
            val item = data?.getStringExtra(SHOP_EXTRA) ?: ""
            if (shopList.size < 10)
                shopList.add(item)
            adapter.notifyDataSetChanged()
        }
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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putStringArrayList("shopList", shopList)
    }
}