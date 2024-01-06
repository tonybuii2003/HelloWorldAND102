package com.example.helloworldand102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.hi)
        button.setOnClickListener {
            Log.v("Clicked Successfully","Button Clicked")
            Toast.makeText(this, "Fue Fue Hello Hello!!", Toast.LENGTH_SHORT).show()
        }
    }
}