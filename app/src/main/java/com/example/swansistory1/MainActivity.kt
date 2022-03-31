package com.example.swansistory1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mainButton = findViewById<Button>(R.id.buttonMain)
        mainButton.setOnClickListener{
            val thumbnailIntent = Intent(this@MainActivity, ThumbnailActivity::class.java)
            startActivity(thumbnailIntent)
        }
    }

}