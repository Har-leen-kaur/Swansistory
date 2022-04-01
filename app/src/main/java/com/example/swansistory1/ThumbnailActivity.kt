package com.example.swansistory1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ThumbnailActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thumbnail)

        val thumbnailList = populateList()
        val recyclerView = findViewById<View>(R.id.myRecyclerView) as RecyclerView
        val layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = layoutManager
        val mAdapter = ThumbnailAdapter(thumbnailList)
        recyclerView.adapter = mAdapter


    }

    private fun populateList(): ArrayList<Thumbnails_poi> {
        val list = ArrayList<Thumbnails_poi>()

        // Nasty handcoded array of images
        val myImageList = arrayOf(R.drawable.swansea_castle, R.drawable.mumbles_and_swansea_bay, R.drawable.clyne_gardens,
            R.drawable.national_waterfront_museum, R.drawable.rhosilli, R.drawable.three_cliffs_bay, R.drawable.swansea_museum_dylan_thomas_centre,
        )
//    ditto but of names (at least the strings are externalised)
        val myImageNameList = arrayOf(R.string.swanseaCastle, R.string.mumbles, R.string.clyneGarden,
            R.string.nationalWaterfront, R.string.rhosilli, R.string.threeCliff, R.string.swanseaMuseumDylan)



//    Wrapping up an image and a name in the model class
        for (i in 0..6) {
            val imageModel = Thumbnails_poi()
            imageModel.setThumbnailText(getString(myImageNameList[i]))
            imageModel.setThumbnailImage(myImageList[i])

            list.add(imageModel)
        }
        //sorting alphabetically
        //list.sortBy { list -> list.modelName }
        return list
    }


}