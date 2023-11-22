package com.example.imagegallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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



        val adapter = ItemAdapter(this, dataPassed)
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object: ItemAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@MainActivity, "Clicked $position", Toast.LENGTH_SHORT).show()

            }

    })

        val adapter2 = ItemAdapter(this, dataPassed)
        recyclerView2.adapter = adapter2
        adapter2.setOnItemClickListener(object: ItemAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@MainActivity, "Clicked $position", Toast.LENGTH_SHORT).show()

            }
        })

        val adapter3 = ItemAdapter(this, dataPassed)
        recyclerView3.adapter = adapter3
        adapter3.setOnItemClickListener(object: ItemAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@MainActivity, "Clicked $position", Toast.LENGTH_SHORT).show()

            }

        })
        recyclerView.setHasFixedSize(true)
        recyclerView2.setHasFixedSize(true)
        recyclerView3.setHasFixedSize(true)
}
}
