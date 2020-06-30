package com.example.projettdm_boughazi_bounsiar.data


import androidx.room.*

@Dao
interface CountryDAO{

    //countries
    @Query("SELECT * FROM country")
    fun getCountry(): MutableList<Country>

    @Query("SELECT * FROM country WHERE code = :code")
    fun getCountry(code: Int): List<Country>

    @Insert
    fun ajouterCountry(country : Country)

    @Update
    fun modifierCountry(country : Country)

    @Delete
    fun supprimerCountry(country : Country)

    //figures
    @Query("SELECT * FROM Figure")
    fun getFigure(): MutableList<Figure>

    @Query("SELECT * FROM Figure WHERE code = :code")
    fun getFigure(code: Int): List<Figure>

    @Insert
    fun ajouterFigure(figure : Figure)

    @Update
    fun modifierFigure(figure : Figure)

    @Delete
    fun supprimerFigure(figure : Figure)



    //videos
    @Query("SELECT * FROM Video")
    fun getVideo(): MutableList<Video>

    @Query("SELECT * FROM Video WHERE url = :url")
    fun getVideo(url: String): List<Video>

    @Insert
    fun ajouterVideo(video : Video)

    @Update
    fun modifierVideo(video : Video)

    @Delete
    fun supprimerVideo(video : Video)


    //tweets
    @Query("SELECT * FROM Tweet")
    fun getTweet(): MutableList<Tweet>

    @Query("SELECT * FROM Tweet WHERE url = :url")
    fun getTweet(url: String): List<Tweet>

    @Insert
    fun ajouterTweet(tweet : Tweet)

    @Update
    fun modifierTweet(tweet : Tweet)

    @Delete
    fun supprimerTweet(tweet : Tweet)

}