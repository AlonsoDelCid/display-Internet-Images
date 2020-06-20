package com.alonsodelcid.displayinternetimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ImagesAdapter(this)

        val list = resources.getStringArray(R.array.images)

        (recyclerView.adapter as ImagesAdapter).setImagesList(list.asList())
    }
}