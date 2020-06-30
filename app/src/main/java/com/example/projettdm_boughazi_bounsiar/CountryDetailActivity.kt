package com.example.projettdm_boughazi_bounsiar

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.projettdm_boughazi_bounsiar.data.Figure
import kotlinx.android.synthetic.main.country_layout.*

class CountryDetailActivity : AppCompatActivity() {

    private var mp: MediaPlayer? = null
    private lateinit var figureListAdapter: FigureListAdapter

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.country_layout)

        //image slide setup
        val imageList = ArrayList<SlideModel>() // Create image list
        imageList.add(SlideModel(R.drawable.placeholder,"plaaaceholder"))
        imageList.add(SlideModel(R.drawable.log_make,"testo"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
        imageSlider.startSliding(30000)

        //audio player setup
        play_hymne_btn.setOnClickListener {
            lireAudio(R.raw.idir)
        }

        //figure list view setup
        figureListAdapter = FigureListAdapter(this, arrayListOf(Figure(0,"Justin","Trudeau","PM canada",R.drawable.placeholder)))
        perso_list_view.adapter = figureListAdapter

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

}
