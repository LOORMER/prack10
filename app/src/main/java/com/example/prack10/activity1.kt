package com.example.prack10

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout


class Activity1 : AppCompatActivity() {
    val text: EditText = findViewById(R.id.text)
    var colors = arrayOf("#76A341","#386385","#874834")
    var sheetNumber = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        sheetNumber = intent.getIntExtra("sheetNumber",0)
        val next: Button = findViewById(R.id.next)
        next.setOnClickListener {
            if (sheetNumber < colors.size -1){
                val intent = Intent(this, Activity1::class.java)
                intent.putExtra("sheetNumber", sheetNumber + 1)
                startActivity(intent)
            }
            else{
                Toast.makeText(applicationContext, getString(R.string.Next_Note), Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun onPause() {
        super.onPause()
        val prefs = getPreferences(Context.MODE_PRIVATE).edit()
        prefs.putString("note" + sheetNumber, text.editableText.toString())
        prefs.apply()
    }
    override fun onResume() {
        super.onResume()
        val sheet: ConstraintLayout = findViewById(R.id.sheet)
        sheet.setBackgroundColor(colors[sheetNumber].toInt())
        val saveState = getPreferences(Context.MODE_PRIVATE).getString("note1",null)
        if (saveState != null){
            text.setText(saveState)
        }
    }
}