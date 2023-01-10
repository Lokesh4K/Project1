package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //access the objects
        val button1 = findViewById <Button> (R.id.buttonPress)
        val textView = findViewById <TextView> (R.id.textView)

        //button click callback
        button1?.setOnClickListener()
        {
            textView.setText("Narayan!!!")
            // transitioning to another screen
            intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
