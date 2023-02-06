package com.example.imagegallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.imagegallery.ItemAdapter.ItemAdapter
import com.example.imagegallery.dataSource.dataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataPassed = dataSource().loadImages()
        val recyclerView= findViewById<RecyclerView>(R.id.recyclerView)
        val recyclerView2= findViewById<RecyclerView>(R.id.recyclerView2)
        val recyclerView3= findViewById<RecyclerView>(R.id.recyclerView3)
        recyclerView.adapter =ItemAdapter(this, dataPassed)
        recyclerView2.adapter =ItemAdapter(this, dataPassed)
        recyclerView3.adapter =ItemAdapter(this, dataPassed)
        recyclerView.setHasFixedSize(true)
        recyclerView2.setHasFixedSize(true)
        recyclerView3.setHasFixedSize(true)
    }
}