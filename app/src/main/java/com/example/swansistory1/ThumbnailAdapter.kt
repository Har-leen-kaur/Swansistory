package com.example.swansistory1

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.swansistory1.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

//import com.example.swansistory1.databinding.RecyclerViewItemBinding


class ThumbnailAdapter (private val imageModelArrayList: MutableList<Thumbnails_poi>) : RecyclerView.Adapter<ThumbnailAdapter.ViewHolder>() {

    /*
     * Inflate our views using the layout defined in row_layout.xml
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.recycler_view_thumbnail, parent, false)

        return ViewHolder(v)
    }

    /*
     * Bind the data to the child views of the ViewHolder
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val info = imageModelArrayList[position]

        holder.imgView.setImageResource(info.getThumbnailImage())
        holder.txtMsg.text = info.getThumbnailText()
    }

    /*
     * Number of models in the array
     */
    override fun getItemCount(): Int {
        return imageModelArrayList.size
    }

    /*
     * The parent class that handles layout inflation and child view use
     */
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener
    {

        var imgView = itemView.findViewById<View>(R.id.poi_thumbnail_img) as ImageView
        var txtMsg = itemView.findViewById<View>(R.id.poi_thumbnail_txt) as TextView

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            val mess =
                txtMsg.text.toString()
            val snackbar = Snackbar.make(v, mess, Snackbar.LENGTH_LONG)
            snackbar.show()
        }
    }
}
