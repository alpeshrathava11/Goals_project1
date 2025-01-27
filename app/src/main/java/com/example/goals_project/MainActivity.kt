package com.example.goals_project

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

   // private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val btnShare = findViewById<Button>(R.id.ShareButton)

        btnShare.setOnClickListener {

            val shareBody = "https://www.youtube.com/"
            val shareSub = "https://www.youtube.com/"

            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub)
            shareIntent.putExtra(Intent.EXTRA_TEXT,shareBody)

            startActivity(shareIntent)

        }

    /**    button = findViewById(R.id.ShareButton)

        val url = "https://www.youtube.com/"


        button.setOnClickListener {

            val intent = Intent(Intent.ACTION_SEND)
            intent . putExtra ("Share this",url)
            val chooser = Intent.createChooser(intent, "Share using...")
            startActivity(chooser)

        }  **/


        /**  val btn = findViewById<Button>(R.id.btnSubmit) as Button
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar) as RatingBar

        btn.setOnClickListener {

        val getRatingBar = ratingBar.rating
        Toast.makeText(this,"Rating " +getRatingBar,Toast.LENGTH_LONG).show()

        } **/

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


}