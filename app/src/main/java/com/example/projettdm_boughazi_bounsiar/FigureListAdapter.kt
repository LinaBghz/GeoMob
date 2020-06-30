package com.example.projettdm_boughazi_bounsiar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.projettdm_boughazi_bounsiar.data.Figure

class FigureListAdapter(var context : Context?, var figures : List<Figure>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflater = LayoutInflater.from(context)
        val rowView = layoutInflater.inflate(R.layout.figure_list_item, parent, false)
        val nameTV = rowView.findViewById<TextView>(R.id.figure_name)
        val titleTV = rowView.findViewById<TextView>(R.id.figure_title)
        val imageView = rowView.findViewById<ImageView>(R.id.video_thumbnail)

        val current = figures[position]
        nameTV.text = current.nom +" "+ current.prenom
        titleTV.text = current.description
        imageView.setImageResource(current.image)

        return rowView
    }

    override fun getItem(position: Int): Any {
        return  figures.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return figures.count()
    }

}