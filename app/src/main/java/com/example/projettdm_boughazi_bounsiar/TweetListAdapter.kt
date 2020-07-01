package com.example.projettdm_boughazi_bounsiar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.projettdm_boughazi_bounsiar.data.Tweet

class TweetListAdapter(var context : Context?, var tweets : MutableList<Tweet>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflater = LayoutInflater.from(context)
        val rowView = layoutInflater.inflate(R.layout.tweet_list_item, parent, false)
        val displayName = rowView.findViewById<TextView>(R.id.display_name)
        val handle = rowView.findViewById<TextView>(R.id.handle)
        val content = rowView.findViewById<TextView>(R.id.tweet_content)

        val current = tweets[position]

        displayName.text = current.displayname
        handle.text = current.handle
        content.text = current.contenue


        return rowView
    }

    override fun getItem(position: Int): Any {
        return  tweets.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return tweets.count()
    }

}