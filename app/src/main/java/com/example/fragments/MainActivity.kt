package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        val btnFragment1 = findViewById<Button>(R.id.fragmentBtn1)
        val btnFragment2 = findViewById<Button>(R.id.fragmentBtn2)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, firstFragment)
            commit()
        }

        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, firstFragment)
                commit()
            }
        }

        btnFragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, secondFragment)
                commit()
            }
        }
    }
}