package com.example.swansistory1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainButton = findViewById<Button>(R.id.buttonMain)
        val infoButton = findViewById<Button>(R.id.buttonInfo)

        mainButton.setOnClickListener{
            val thumbnailIntent = Intent(this@MainActivity, ThumbnailActivity::class.java)
            startActivity(thumbnailIntent)
        }

        infoButton.setOnClickListener{
            val infoThreeCliffActivity = Intent(this@MainActivity, InfoThreeCliffActivity::class.java)
            startActivity(infoThreeCliffActivity)
        }

        var bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        bottomNavigationView.setOnNavigationItemSelectedListener{item->
            var message = " "
            when (item.itemId){
                R.id.home -> message = "Home clicked"
                R.id.explore -> message = "Explore clicked"
                R.id.favourites -> message = "favourites clicked"
                R.id.map -> message = "Map clicked"
            }

            Toast.makeText(this@MainActivity,message, Toast.LENGTH_LONG).show()
            //Toast.makeText(this, message, Toast.LENGTH_LONG)

            return@setOnNavigationItemSelectedListener true
        }
    }
}