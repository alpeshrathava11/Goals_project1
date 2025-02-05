package com.example.goals_project

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class FeedbackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_feedback)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)

        btnSubmit.setOnClickListener {
            val getRatingBar = ratingBar.rating
            Toast.makeText(this, "Rating: $getRatingBar", Toast.LENGTH_LONG).show()
        }
    }
}
