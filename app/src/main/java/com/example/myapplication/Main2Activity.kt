package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sub_layout_2)
        val textView = findViewById<TextView>(R.id.textView)

        val bundle:Bundle = intent.extras as Bundle
        val value:String = bundle.get("data").toString()
        textView!!.text = value

    }
}