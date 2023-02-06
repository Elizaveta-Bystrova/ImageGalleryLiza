package com.example.imagegallery.dataSource

import com.example.imagegallery.R
import com.example.imagegallery.model.Images

class dataSource {
    fun loadImages():List<Images>{
        return listOf<Images>(
            Images(R.drawable.image1),
            Images(R.drawable.image2),
            Images(R.drawable.image3),
            Images(R.drawable.image4),
            Images(R.drawable.image5),
            Images(R.drawable.image6),
            Images(R.drawable.image7),
            Images(R.drawable.image8),
            Images(R.drawable.image9),
            Images(R.drawable.image10)
        )
    }
}