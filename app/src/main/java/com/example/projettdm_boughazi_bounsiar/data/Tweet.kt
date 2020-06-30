package com.example.projettdm_boughazi_bounsiar.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity
data class Tweet(
    @PrimaryKey var urlTweet : String,
    @ColumnInfo(name = "displayname") var displayname: String,
    @ColumnInfo(name = "handle") var handle : String,
    @ColumnInfo(name = "contenue") var contenue : String,
    @ColumnInfo(name= "country") var countryCode : Int

){
    constructor():this("","","", "", 0){
    }

    fun prepopulateTweet() : List<Tweet>{

        var tweets : List<Tweet> = listOf(Tweet())
        return tweets

    }
}