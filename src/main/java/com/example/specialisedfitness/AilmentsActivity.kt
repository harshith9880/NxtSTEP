package com.example.specialisedfitness_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.specialisedfitness_1.ArthritisActivity
import com.example.specialisedfitness_1.HeartDiseaseActivity
import com.example.specialisedfitness_1.LowerBackPainActivity
import com.example.specialisedfitness_1.R



class AilmentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ailments) // Set your layout file here

       val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            // Navigate to HeartDiseaseActivity
            val intent = Intent(this, HeartDiseaseActivity::class.java)
            startActivity(intent)
        }

        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener {
            // Navigate to LowerBackPainActivity
            val intent = Intent(this, LowerBackPainActivity::class.java)
            startActivity(intent)
        }
        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener {
            // Navigate to ArthritisActivity
            val intent = Intent(this, ArthritisActivity::class.java)
            startActivity(intent)
        }
        val imageButton3: ImageButton = findViewById(R.id.imageButton3)
        imageButton3.setOnClickListener {
            // Navigate back (or to another activity)
            finish() // or start another activity if needed
        }
        val imageButton4: ImageButton = findViewById(R.id.imageButton4)
        imageButton4.setOnClickListener {
            // Navigate to hear activity if it's defined
            // val intent = Intent(this, HearActivity::class.java) // Example, update accordingly
            // startActivity(intent)
        }
        val imageButton5: ImageButton = findViewById(R.id.imageButton5)
        imageButton5.setOnClickListener {
            // Navigate to knee activity if it's defined
            // val intent = Intent(this, KneeActivity::class.java) // Example, update accordingly
            // startActivity(intent)
        }
    }
}
