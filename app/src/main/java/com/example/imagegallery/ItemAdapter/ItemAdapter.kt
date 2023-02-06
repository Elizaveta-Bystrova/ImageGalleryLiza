package com.example.imagegallery.ItemAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.imagegallery.R
import com.example.imagegallery.model.Images

class ItemAdapter(private val context:Context,
                  val dataSet:List<Images>):RecyclerView.Adapter<ItemAdapter.ImageViewHolder>(){
    class ImageViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val imageView:ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ImageViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val item = dataSet[position]
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}