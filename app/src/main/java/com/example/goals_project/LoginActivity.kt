package com.example.goals_project

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.goals_project.databinding.ActivityLoginBinding
import com.example.goals_project.databinding.FragmentProfileBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        binding.clickBackIcon.setOnClickListener {
//
//            val fragment = ProfileFragment()
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.profile, fragment) // Replace the fragment container
//                .addToBackStack(null) // Optional: adds this transaction to the back stack
//                .commit()
//        }

    }
}