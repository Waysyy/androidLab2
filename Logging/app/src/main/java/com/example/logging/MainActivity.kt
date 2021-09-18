package com.example.logging

import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1: Button = findViewById(R.id.button_log)
        button1.setOnClickListener {
            val textInEditText: EditText = findViewById(R.id.textView)
            Log.v("From EditText", textInEditText.text.toString());
        }
        val button2: Button = findViewById(R.id.button_timber)
        button2.setOnClickListener {
            Timber.plant(Timber.DebugTree());
            val textInEditText: EditText = findViewById(R.id.textView)
            Timber.v(textInEditText.text.toString());
        }
    }
}