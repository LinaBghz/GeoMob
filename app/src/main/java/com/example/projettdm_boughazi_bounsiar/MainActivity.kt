package com.example.projettdm_boughazi_bounsiar

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projettdm_boughazi_bounsiar.data.Country
import com.example.projettdm_boughazi_bounsiar.data.CountryDAO
import com.example.projettdm_boughazi_bounsiar.data.CountryDB
import com.example.projettdm_boughazi_bounsiar.data.Figure
import com.example.projettdm_boughazi_bounsiar.data.Relations.CountryFigures
import com.example.projettdm_boughazi_bounsiar.data.Relations.CountryImages
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var db: CountryDB? = null
    private var dao: CountryDAO? = null
    private var countries: MutableList<Country>? = null
    private var figures: MutableList<CountryFigures>? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      recycler.layoutManager = LinearLayoutManager(this)
              initDB()

    }

    fun initDB() {
        var act = this

        object : AsyncTask<Void, Void, Void>() {
            override fun doInBackground(vararg voids: Void): Void? {
                act.db = CountryDB.getInstance(act)
                act.dao = db?.CountryDAO()
                countries = act.dao?.getCountries()


                return null
            }

            override fun onPostExecute(result: Void?) {
                if(countries != null) {
                    val adapter = MainAdapter(
                        countries!!
                    )
                    recycler.adapter = adapter}


            }
        }.execute()
    }

    override fun onResume() {
        super.onResume()
        initDB()
    }

    override fun onRestart() {
        super.onRestart()
        initDB()
    }
}
