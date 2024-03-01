package com.example.icetask1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HelloActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var languageTextView: TextView
    private val translations = mapOf(
        "English" to "Hello World",
        "Spanish" to "¡Hola Mundo!",
        "French" to "Bonjour le Monde",
        "German" to "Hallo Welt",
        "Japanese" to "こんにちは世界"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        languageTextView = findViewById(R.id.languageTextView)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val language = when (view.id) {
            R.id.button1 -> "English"
            R.id.button2 -> "Spanish"
            R.id.button3 -> "French"
            R.id.button4 -> "German"
            R.id.button5 -> "Japanese"
            else -> "Unknown"
        }
        val translation = translations[language]
        languageTextView.text = translation
    }
}
