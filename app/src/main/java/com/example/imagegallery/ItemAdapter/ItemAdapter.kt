package com.example.imagegallery.ItemAdapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.MenuView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.imagegallery.R
import com.example.imagegallery.model.DetaleActivity
import com.example.imagegallery.model.Images

class ItemAdapter(private val context:Context,
                  val dataSet:List<Images>):RecyclerView.Adapter<ItemAdapter.ImageViewHolder>(){

    lateinit var mListener: onItemClickListener
    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {

        mListener = listener

    }

    class ImageViewHolder(val view: View, listener: onItemClickListener):RecyclerView.ViewHolder(view){
        val imageView:ImageView = view.findViewById(R.id.item_image)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ImageViewHolder(adapterLayout, mListener)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val item = dataSet[position]
        holder.imageView.setImageResource(item.imageResourceId)
//        holder.imageView.setOnClickListener {
//            val intent = Intent(context, DetaleActivity::class.java)
//            context.startActivity(intent)
//        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}