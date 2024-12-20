package com.example.coffe

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {


    private lateinit var proximo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        proximo = findViewById(R.id.imageView9)

        proximo.setOnClickListener {

            val proximatela = Intent(this, MainActivity4::class.java)

            startActivity(proximatela)
        }

    }
}