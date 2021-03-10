package com.alonsodelcid.displayinternetimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_full_screen.*

class FullScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_screen)

        val image = intent.getStringExtra("image")

        Glide
            .with(this)
            .load(image)
            .centerCrop()
            .into(fullScreenImage)
    }
}