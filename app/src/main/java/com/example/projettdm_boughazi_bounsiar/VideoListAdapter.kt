package com.example.projettdm_boughazi_bounsiar

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import com.example.projettdm_boughazi_bounsiar.data.Figure
import com.example.projettdm_boughazi_bounsiar.data.Video

class VideoListAdapter(val context : Context, val videos : MutableList<Video>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView = layoutInflater.inflate(R.layout.video_list_item, parent, false)
        val vidTitle = rowView.findViewById<TextView>(R.id.video_title)
        val thumbnail = rowView.findViewById<ImageView>(R.id.video_thumbnail)

        val current = videos[position]

        vidTitle.text = current.titre
        thumbnail.setImageResource(current.image)



        return rowView
    }

    override fun getItem(position: Int): Any {
        return  videos.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return videos.count()
    }

}