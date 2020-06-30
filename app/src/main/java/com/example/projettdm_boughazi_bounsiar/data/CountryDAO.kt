package com.example.projettdm_boughazi_bounsiar.data


import androidx.room.*
import com.example.projettdm_boughazi_bounsiar.data.Relations.CountryFigures
import com.example.projettdm_boughazi_bounsiar.data.Relations.CountryImages
import com.example.projettdm_boughazi_bounsiar.data.Relations.CountryTweets
import com.example.projettdm_boughazi_bounsiar.data.Relations.CountryVideos

@Dao
interface CountryDAO{

    //countries
    @Query("SELECT * FROM country")
    fun getCountries(): MutableList<Country>

    @Query("SELECT * FROM country WHERE codeCountry = :code")
    fun getCountry(code: Int): Country

    @Insert
    fun ajouterCountry(country : Country)

    @Insert
    fun insertAllCountries(countries : List<Country>)



    @Update
    fun modifierCountry(country : Country)

    @Delete
    fun supprimerCountry(country : Country)


    //images
    @Query("SELECT * FROM Image")
    fun getImages(): MutableList<Image>

    @Query("SELECT * FROM Image WHERE codeImage = :code")
    fun getImage(code: Int): Image

    @Insert
    fun ajouterImage(image: Image)

    @Insert
    fun insertAllImages(images : List<Image>)

    @Update
    fun modifierImage(image: Image)

    @Delete
    fun supprimerImage(image: Image)

    //figures
    @Query("SELECT * FROM Figure")
    fun getFigures(): MutableList<Figure>

    @Query("SELECT * FROM Figure WHERE codeFigure = :code")
    fun getFigure(code: Int): Figure

    @Insert
    fun ajouterFigure(figure : Figure)

    @Insert
    fun insertAllFigures(figures : List<Figure>)

    @Update
    fun modifierFigure(figure : Figure)

    @Delete
    fun supprimerFigure(figure : Figure)



    //videos
    @Query("SELECT * FROM Video")
    fun getVideos(): MutableList<Video>

    @Query("SELECT * FROM Video WHERE urlVideo = :url")
    fun getVideo(url: String): Video

    @Insert
    fun ajouterVideo(video : Video)

    @Insert
    fun insertAllVideos(videos : List<Video>)

    @Update
    fun modifierVideo(video : Video)

    @Delete
    fun supprimerVideo(video : Video)


    //tweets
    @Query("SELECT * FROM Tweet")
    fun getTweets(): MutableList<Tweet>

    @Query("SELECT * FROM Tweet WHERE urlTweet= :url")
    fun getTweet(url: String): Tweet

    @Insert
    fun ajouterTweet(tweet : Tweet)

    @Insert
    fun insertAllTweets(tweets : List<Tweet>)

    @Update
    fun modifierTweet(tweet : Tweet)

    @Delete
    fun supprimerTweet(tweet : Tweet)

    //Transactions

    @Transaction
    @Query("SELECT * FROM Country")
    fun FiguresOfCountry(): MutableList<CountryFigures>

    @Transaction
    @Query("SELECT * FROM Country")
    fun ImagesOfCountry(): MutableList<CountryImages>

    @Transaction
    @Query("SELECT * FROM Country")
    fun TweetsOfCountry(): MutableList<CountryTweets>

    @Transaction
    @Query("SELECT * FROM Country")
    fun VideosOfCountry(): MutableList<CountryVideos>



}