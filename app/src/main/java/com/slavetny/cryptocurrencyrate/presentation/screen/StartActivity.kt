package com.slavetny.cryptocurrencyrate.presentation.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.slavetny.cryptocurrencyrate.R

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }
}