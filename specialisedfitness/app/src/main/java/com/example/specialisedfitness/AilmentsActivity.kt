package com.example.specialisedfitness_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



    class AilmentsActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_ailments)

            val lowerBackPainButton: Button = findViewById(R.id.buttonLowerBackPain)
            lowerBackPainButton.setOnClickListener {
                val intent = Intent(this, LowerBackPainActivity::class.java)
                startActivity(intent)
            }


        }
    }

