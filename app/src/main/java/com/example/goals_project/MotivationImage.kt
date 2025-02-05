package com.example.goals_project

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import jp.wasabeef.glide.transformations.BlurTransformation

class MotivationImage : AppCompatActivity() {

    private var nature_Image: ImageView? = null
    private var popular_Image: ImageView? = null
    private var life_Image: ImageView? = null
    private var positive_Image: ImageView? = null
    private var confidence_Image: ImageView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motivation_image)

        // Initializing the ImageView
        nature_Image = findViewById(R.id.imgNature)
        popular_Image = findViewById(R.id.imgPopular)
        life_Image = findViewById(R.id.imgLife)
        positive_Image = findViewById(R.id.imgPositive)
        confidence_Image = findViewById(R.id.imgConfidence)

        // Applying blur transformation to the image using Glide
        Glide.with(this)
            .load(R.drawable.img_16)  // Update this with your actual image resource or URL
            .apply(RequestOptions.bitmapTransform(BlurTransformation(25, 2)))
            .into(nature_Image!!)

        Glide.with(this)
            .load(R.drawable.img_17)  // Update this with your actual image resource or URL
            .apply(RequestOptions.bitmapTransform(BlurTransformation(25, 2)))
            .into(popular_Image!!)

        Glide.with(this)
            .load(R.drawable.img_23)  // Update this with your actual image resource or URL
            .apply(RequestOptions.bitmapTransform(BlurTransformation(25, 2)))
            .into(life_Image!!)

        Glide.with(this)
            .load(R.drawable.img_24)  // Update this with your actual image resource or URL
            .apply(RequestOptions.bitmapTransform(BlurTransformation(25, 2)))
            .into(positive_Image!!)

        Glide.with(this)
            .load(R.drawable.img_22)  // Update this with your actual image resource or URL
            .apply(RequestOptions.bitmapTransform(BlurTransformation(25, 2)))
            .into(confidence_Image!!)


    }
}
