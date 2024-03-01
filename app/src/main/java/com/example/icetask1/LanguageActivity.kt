package com.example.icetask1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LanguageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        val languageTextView: TextView = findViewById(R.id.languageTextView)

        val language = intent.getStringExtra("language") ?: "Unknown"
        languageTextView.text = "Hello, $language!"
    }
}
