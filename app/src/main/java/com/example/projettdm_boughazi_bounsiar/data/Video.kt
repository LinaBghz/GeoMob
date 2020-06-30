package com.example.projettdm_boughazi_bounsiar.data


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.projettdm_boughazi_bounsiar.R


@Entity
data class Video(
    @PrimaryKey var urlVideo : String,
    @ColumnInfo(name = "titre") var titre: String,
    @ColumnInfo(name = "image") var image : Int,
    @ColumnInfo(name= "country") var countryCode : Int

){
    constructor():this("","",0, 0){
    }

    fun prepopulateVideo() : List<Video>{

        var videos : List<Video> = listOf(Video("https://www.youtube.com/watch?v=Atvsg_zogxo","Noice MV",
            R.drawable.placeholder, 213),Video("https://www.youtube.com/watch?v=Atvsg_zogxo","Another one",
            R.drawable.placeholder, 213))
        return videos

    }
}