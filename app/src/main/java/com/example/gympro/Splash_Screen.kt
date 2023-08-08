package com.example.gympro

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Splash_Screen : AppCompatActivity() {


    lateinit var btnCWG: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen2)


        btnCWG = findViewById(R.id.buttonCWG)


        Handler().postDelayed({ //
            val i = Intent(this@Splash_Screen, MainActivity::class.java)
            startActivity(i)
            finish();
        }, 500)




    }
}