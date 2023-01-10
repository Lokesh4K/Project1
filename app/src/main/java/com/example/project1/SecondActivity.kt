package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonsec = findViewById<Button>(R.id.buttonS)

        buttonsec?.setOnClickListener()
        {
            //going back to previous screen
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}