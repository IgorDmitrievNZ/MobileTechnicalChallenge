package com.example.android.mobiletechnicalchallenge.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.mobiletechnicalchallenge.R
import com.example.android.mobiletechnicalchallenge.ui.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HomeFragment())
                .commit()
        }
    }
}