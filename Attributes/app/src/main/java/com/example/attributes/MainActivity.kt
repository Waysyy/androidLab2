package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val size_8spn = 8
        val size_24spn = 24
        var tv : EditText = findViewById(R.id.textAssist)
        val button1 : Button = findViewById(R.id.button1)
        button1.setOnClickListener{
            tv.setTextColor(Color.BLACK)
        }
        val button2 : Button = findViewById(R.id.button2)
        button2.setOnClickListener{
            tv.setTextColor(Color.RED)
        }
        val button3 : Button = findViewById(R.id.button3)
        button3.setOnClickListener{
            tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, size_8spn.toFloat())
        }
        val button4 : Button = findViewById(R.id.button4)
        button4.setOnClickListener{
            tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, size_24spn.toFloat())
        }
        val button5 : Button = findViewById(R.id.button5)
        button5.setOnClickListener{
            tv.setBackgroundColor(Color.WHITE)
        }
        val button6 : Button = findViewById(R.id.button6)
        button6.setOnClickListener{
            tv.setBackgroundColor(Color.YELLOW)
        }
    }
}