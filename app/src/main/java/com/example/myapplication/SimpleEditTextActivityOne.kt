package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SimpleEditTextActivityOne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_edittext_activity_layout_one)
        val btn = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editText)
        btn.setOnClickListener {
            val message = editText.text.toString()
            val intent = Intent(this, SimpleEditTextActivityTwo::class.java)
            if (!message.isNullOrEmpty()) {
                intent!!.putExtra("data", message)
            }
            startActivity(intent)
        }
    }

}

