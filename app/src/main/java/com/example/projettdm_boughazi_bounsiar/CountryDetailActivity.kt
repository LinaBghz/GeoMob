package com.example.projettdm_boughazi_bounsiar

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.projettdm_boughazi_bounsiar.data.Country
import kotlinx.android.synthetic.main.country_layout.*


class CountryDetailActivity : AppCompatActivity() {

    private var mp: MediaPlayer? = null
    private lateinit var figureListAdapter: FigureListAdapter
    private lateinit var videosListAdapter: VideoListAdapter
    private lateinit var country: Country

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.country_layout)

        country = intent.getParcelableExtra("Country") as Country

        setScreenDate(country)




    }

    private fun setScreenDate(country: Country){
        //text views setup
        country_name.text = country.nom
        surface_tv.text = country.surface
        population_tv.text = "9.900"
        country_desc_tv.text = country.description
        historique_tv.text = country.historique
        princip_ressources_tv.text = country.ressources

        //Flag set
        flag_image_view.setImageResource(country.drapeau)

        //image slide setup
        val imageList = ArrayList<SlideModel>() // Create image list
        for (image in country.images!!){
            imageList.add(SlideModel(image,"image title"))
        }
        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
        imageSlider.startSliding(30000)

        //audio player setup
        play_hymne_btn.setOnClickListener {
            lireAudio(country.hymne)
        }

        //figure list view setup
        figureListAdapter = FigureListAdapter(this, country.figures!!)
        perso_list_view.adapter = figureListAdapter
        justifyListViewHeightBasedOnChildren(perso_list_view);


        //videos listview setup
        val videoList = country.videos
        videosListAdapter = VideoListAdapter(this, videoList!!)
        vid_pop_list_view.setOnItemClickListener { parent, view, position, id ->
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(videoList[position].url)))
        }
        vid_pop_list_view.adapter = videosListAdapter
        justifyListViewHeightBasedOnChildren(vid_pop_list_view)
    }

    fun lireAudio(resId: Int) {
        if (mp == null) {        //set up MediaPlayer
            mp = MediaPlayer.create(this, resId)

            try {
                mp!!.prepare()

            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
        if (!mp!!.isPlaying())
            mp!!.start()
        else
            mp!!.pause()
    }


    fun justifyListViewHeightBasedOnChildren(listView: ListView) {
        val adapter: ListAdapter = listView.getAdapter() ?: return
        val vg: ViewGroup = listView
        var totalHeight = 0
        for (i in 0 until adapter.getCount()) {
            val listItem: View = adapter.getView(i, null, vg)
            listItem.measure(0, 0)
            totalHeight += listItem.getMeasuredHeight()
        }
        val par: ViewGroup.LayoutParams = listView.getLayoutParams()
        if(listView == perso_list_view){
            totalHeight +=30
            par.height = totalHeight + listView.getDividerHeight() * (adapter.getCount() - 1)
        }
        else {
            totalHeight -=800
            par.height = totalHeight + listView.getDividerHeight() * (adapter.getCount() - 2)
        }


        listView.setLayoutParams(par)
        listView.requestLayout()
    }
}
