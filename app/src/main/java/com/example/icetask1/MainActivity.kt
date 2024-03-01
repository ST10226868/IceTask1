package com.example.icetask1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val splashTimeOut: Long = 2000 // 2 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create a handler to delay navigating to the HelloActivity
        Handler().postDelayed({
            startActivity(Intent(this@MainActivity, HelloActivity::class.java))
            finish()
        }, splashTimeOut)
    }
}

