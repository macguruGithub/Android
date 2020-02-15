package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sub_layout_1)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val textView = findViewById<EditText>(R.id.editText).getText().toString()
            val intent = Intent(this, Main2Activity::class.java)
            if (!"".equals(textView)) {
                intent.putExtra("data", textView)
            }
            startActivity(intent);
        }
    }

}

