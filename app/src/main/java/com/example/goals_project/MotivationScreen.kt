package com.example.goals_project

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.goals_project.databinding.ActivityMotivationScreenBinding


class MotivationScreen : AppCompatActivity() {

    private lateinit var binding: ActivityMotivationScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_motivation_screen)

        binding = ActivityMotivationScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardMotivationImages.setOnClickListener {

            val intent = Intent(this,MotivationImage::class.java)
            startActivity(intent)

        }

    }
}