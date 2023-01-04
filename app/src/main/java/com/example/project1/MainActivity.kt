package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById <Button> (R.id.buttonPress)
        val textView = findViewById <TextView> (R.id.textView)

        button1?.setOnClickListener()
        {
            textView.setText("Narayan!!!")
        }
    }
}
