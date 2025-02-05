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
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomsheet.BottomSheetDialog
public class MainActivity : AppCompatActivity() {


    private lateinit var navview: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        navview = findViewById(R.id.nav_view)

        replace(HomeFragment())

        navview.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->replace(HomeFragment())
                R.id.profile->replace(ProfileFragment())
                R.id.addButton->replace(AddFragment())
            }
            true
        }


//        val btnShare = findViewById<Button>(R.id.ShareButton)
//
//        btnShare.setOnClickListener {
//
//            val shareBody = "https://www.youtube.com/"
//            val shareSub = "https://www.youtube.com/"
//
//            val shareIntent = Intent(Intent.ACTION_SEND)
//            shareIntent.type = "text/plain"
//
//            shareIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub)
//            shareIntent.putExtra(Intent.EXTRA_TEXT,shareBody)
//
//            startActivity(shareIntent)
//
//        }

//        button = findViewById(R.id.ShareButton)
//
//        val url = "https://www.youtube.com/"
//
//
//        button.setOnClickListener {
//
//            val intent = Intent(Intent.ACTION_SEND)
//            intent . putExtra ("Share this",url)
//            val chooser = Intent.createChooser(intent, "Share using...")
//            startActivity(chooser)
//
//        }


        /**  val btn = findViewById<Button>(R.id.btnSubmit) as Button
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar) as RatingBar

        btn.setOnClickListener {

        val getRatingBar = ratingBar.rating
        Toast.makeText(this,"Rating " +getRatingBar,Toast.LENGTH_LONG).show()

        } **/

    }

   private fun replace(fragment: Fragment) {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.navhost, fragment)
        transaction.commit()

    }

}

