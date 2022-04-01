package com.example.swansistory1

import android.widget.ImageView
import android.widget.TextView

class Thumbnails_poi {
    var thumbnail_imageView: Int = 0
    var thumbnail_textView: String? = null
    var thumbnail_id = null

    fun getThumbnailImage(): Int{
        return thumbnail_imageView
    }

    fun getThumbnailText(): String{
        return thumbnail_textView.toString()
    }

    fun setThumbnailImage(image_drawable :Int){
        this.thumbnail_imageView = image_drawable
    }

    fun setThumbnailText(text :String){
        this.thumbnail_textView = text
    }

}


