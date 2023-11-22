package com.example.imagegallery.model

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.imagegallery.R

class PictureScreenActivity : AppCompatActivity()  {
    lateinit var textView: TextView
    lateinit var imageView: ImageView
    private val texts = arrayOf(R.string.picture_1, R.string.picture_2, R.string.picture_3, R.string.picture_4, R.string.picture_5, R.string.picture_6, R.string.picture_7, R.string.picture_8, R.string.picture_9)
    private val pictures = arrayOf(R.drawable.image1_1, R.drawable.image2_2, R.drawable.image3_3, R.drawable.image4_4, R.drawable.image5_5, R.drawable.image6_6, R.drawable.image7_7, R.drawable.image8_8, R.drawable.image9_9)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_screen)
        textView = findViewById(R.id.textView5)
        imageView = findViewById(R.id.imageView)
        receiveIntent()
    }
    private fun receiveIntent() {
        val position:Int = intent.getIntExtra("image_number", 0)
        imageView.setImageResource(pictures[position])
        textView.setText(texts[position])
    }
}