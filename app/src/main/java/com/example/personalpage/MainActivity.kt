package com.example.personalpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarNavigation: Toolbar
    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appBarNavigation = findViewById(R.id.toolbar)
        bottomNavigation = findViewById(R.id.bottom_nav)

        setSupportActionBar(appBarNavigation)
    }
}