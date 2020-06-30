package com.example.projettdm_boughazi_bounsiar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.projettdm_boughazi_bounsiar.data.Figure
import com.example.projettdm_boughazi_bounsiar.data.Video

class VideoListAdapter(var context : Context?, var videos : List<Video>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflater = LayoutInflater.from(context)
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