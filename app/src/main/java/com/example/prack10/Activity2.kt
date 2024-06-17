package com.example.prack10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {
    val text: EditText = findViewById(R.id.text)
    var colors = arrayOf("#76A341","#386385","#874834")
    var sheetNumber = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)
        val next: Button = findViewById(R.id.next)
        next.setOnClickListener {
            if (sheetNumber < colors.size -1) {
                val intent = Intent(this, Activity1::class.java)
                intent.putExtra("sheetNumber", sheetNumber + 1)
                startActivity(intent)
            }
        }
    }
}