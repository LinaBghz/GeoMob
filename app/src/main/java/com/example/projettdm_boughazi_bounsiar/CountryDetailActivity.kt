package com.example.projettdm_boughazi_bounsiar

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.MeasureSpec
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.projettdm_boughazi_bounsiar.data.*
import kotlinx.android.synthetic.main.country_layout.*




class CountryDetailActivity : AppCompatActivity() {

    private var mp: MediaPlayer? = null
    private lateinit var figureListAdapter: FigureListAdapter
    private lateinit var tweetsListAdapter: TweetListAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.country_layout)

        var countryCode: Int
        countryCode = intent.getIntExtra("COUNTRY_CODE", 0)



        setScreenData(countryCode)


    }

    private fun setScreenData(code: Int) {
        var act = this

        object : AsyncTask<Void, Void, Void>() {
            override fun doInBackground(vararg voids: Void): Void? {
                val db = CountryDB.getInstance(act)
                val dao = db?.CountryDAO()
                val country = dao?.getCountry(code)
                var figures: MutableList<Figure> = mutableListOf<Figure>()
                var images: MutableList<Image>? = mutableListOf<Image>()
                var tweets: MutableList<Tweet>? = mutableListOf<Tweet>()
                var videos: MutableList<Video>? = mutableListOf<Video>()

                if (country != null) {


                    for (figureCountry in dao?.FiguresOfCountry()) {

                        if (figureCountry.country.codeCountry == code) {

                            for (figure in figureCountry.figures) {

                                figures?.add(figure)
                            }
                        }
                    }

                    for (imageCountry in dao?.ImagesOfCountry()) {
                        if (imageCountry.country.codeCountry == code) {

                            for (image in imageCountry.images) {

                                images?.add(image)
                            }
                        }
                    }

                    for (tweetCountry in dao?.TweetsOfCountry()) {
                        if (tweetCountry.country.codeCountry == code) {

                            for (tweet in tweetCountry.tweets) {

                                tweets?.add(tweet)
                            }
                        }
                    }

                    for (videoCountry in dao?.VideosOfCountry()) {
                        if (videoCountry.country.codeCountry == code) {

                            for (video in videoCountry.videos) {

                                videos?.add(video)
                            }
                        }
                    }

                    runOnUiThread {

                        //text views setup
                        country_name.text = country.nom
                        surface_tv.text = country.surface
                        population_tv.text = country.population
                        country_desc_tv.text = country.description
                        historique_tv.text = country.historique
                        princip_ressources_tv.text = country.ressources

                        //Flag set
                        flag_image_view.setImageResource(country.drapeau)


                        //image slide setup
                        val imageList = ArrayList<SlideModel>() // Create image list
                        for (image in images!!) {
                            imageList.add(SlideModel(image.codeImage, image.titreImage))
                        }
                        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
                        imageSlider.setImageList(imageList)
                        imageSlider.startSliding(30000)

                        //audio player setup
                        play_hymne_btn.setOnClickListener {
                            lireAudio(country.hymne)
                        }

                        //figure list view setup
                        figureListAdapter = FigureListAdapter(act, figures!!)
                        perso_list_view.adapter = figureListAdapter
                        justifyListViewHeightBasedOnChildren(perso_list_view);


                        //videos listview setup

                        var videosListAdapter = VideoListAdapter(act, videos!!)
                        vid_pop_list_view.setOnItemClickListener { parent, view, position, id ->
                            startActivity(
                                Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse(videos.get(position).urlVideo)

                                )
                            )
                        }
                        vid_pop_list_view.adapter = videosListAdapter
                      justifyListViewHeightBasedOnChildren(vid_pop_list_view)

                        //tweets listview setup

                        tweetsListAdapter = TweetListAdapter(act, tweets!!)
                        tweet_pop_list_view.setOnItemClickListener{ parent, view, position, id ->
                            startActivity(
                                Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse(tweets.get(position).urlTweet)
                                )
                            )

                        }

                        tweet_pop_list_view.adapter = tweetsListAdapter
                      justifyListViewHeightBasedOnChildren(tweet_pop_list_view)


                    }


                }

                return null
            }

            override fun onPostExecute(result: Void?) {


            }
        }.execute()
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
        for (i in 0 until adapter.count) {
            val listItem: View = adapter.getView(i, null, vg)
            listItem.measure(0, 0)
            totalHeight += listItem.getMeasuredHeight()

        }
        val par: ViewGroup.LayoutParams = listView.getLayoutParams()
        if (listView == perso_list_view) {
            totalHeight -= 50 * adapter.getCount()

        } else if (listView == vid_pop_list_view) {
            totalHeight -= 3000* adapter.getCount()
        }
        else {
            totalHeight -= 50 * adapter.getCount()
        }
        par.height = totalHeight + listView.getDividerHeight() * (adapter.count - 1)
        listView.setLayoutParams(par)
        listView.requestLayout()
    }

}