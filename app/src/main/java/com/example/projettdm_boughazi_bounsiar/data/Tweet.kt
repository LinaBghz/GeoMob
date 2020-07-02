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

        var tweets : List<Tweet> = listOf(
            Tweet("https://twitter.com/NCTsmtown_127/status/1274983396360380417", "NCT 127",
            "@NCTsmtown_127", "여러분 ㅎㅎ 잠깐이라도 얘기해서 힐링됐어요  저는이만가볼게용 ㅎㅎ 시즈니모두사랑해", 213))
        return tweets

    }
}