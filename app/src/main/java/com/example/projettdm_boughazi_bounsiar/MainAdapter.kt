package com.example.projettdm_boughazi_bounsiar

import com.example.projettdm_boughazi_bounsiar.data.Country

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.country_row.view.*

class MainAdapter(val homeFeed: List<Country>) : RecyclerView.Adapter<CustomViewHolder>(){
    override fun getItemCount(): Int {
        Log.d("number", homeFeed.count().toString())
        return homeFeed.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.country_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val country = homeFeed.get(position)



     var countryImage = holder.view?.main_country_image
        countryImage.setImageResource(country.mainImage)
    }
}

class CustomViewHolder(val view: View, var country: Country? = null):RecyclerView.ViewHolder(view){
    companion object{
        val COUNTRY_CODE = "COUNTRY_CODE"
    }
    init {
        view.setOnClickListener {
            val intent = Intent(view.context, CountryDetailActivity::class.java)
            intent.putExtra(COUNTRY_CODE, country?.codeCountry)
            view.context.startActivity(intent)
        }
    }
}