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
    fun getCountry(): MutableList<Country>

    @Query("SELECT * FROM country WHERE codeCountry = :code")
    fun getCountry(code: Int): List<Country>

    @Insert
    fun ajouterCountry(country : Country)

    @Update
    fun modifierCountry(country : Country)

    @Delete
    fun supprimerCountry(country : Country)


    //Transactions

    @Transaction
    @Query("SELECT * FROM Country")
    fun FiguresOfCountry(): List<CountryFigures>

    @Transaction
    @Query("SELECT * FROM Country")
    fun ImagesOfCountry(): List<CountryImages>

    @Transaction
    @Query("SELECT * FROM Country")
    fun TweetsOfCountry(): List<CountryTweets>

    @Transaction
    @Query("SELECT * FROM Country")
    fun VideosOfCountry(): List<CountryVideos>



}