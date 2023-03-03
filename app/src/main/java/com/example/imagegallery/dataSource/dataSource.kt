package com.example.imagegallery.dataSource

import com.example.imagegallery.R
import com.example.imagegallery.model.Images

class dataSource {
    fun loadImages():List<Images>{
        return listOf<Images>(
            Images(R.drawable.image1_1),
            Images(R.drawable.image2_2),
            Images(R.drawable.image3_3),
            Images(R.drawable.image4_4),
            Images(R.drawable.image5_5),
            Images(R.drawable.image6_6),
            Images(R.drawable.image7_7),
            Images(R.drawable.image8_8),
            Images(R.drawable.image9_9),
            Images(R.drawable.image10_10)
        )
    }
}