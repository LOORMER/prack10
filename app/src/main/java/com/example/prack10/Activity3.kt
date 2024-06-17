package com.example.prack10

import android.health.connect.datatypes.units.Length
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_3)
        val next : Button = findViewById(R.id.next)
        next.setOnClickListener{
            Toast.makeText(applicationContext, getString(R.string.Next_Note), Toast.LENGTH_SHORT).show()
        }
    }
}