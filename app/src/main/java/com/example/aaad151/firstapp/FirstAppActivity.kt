package com.example.aaad151.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import com.example.primeraApp.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        var btnStart = findViewById<AppCompatButton>(R.id.btnStart);
        btnStart.setOnClickListener {
            Log.i("Norberto", "Button Pulsado");
        }
    }
}