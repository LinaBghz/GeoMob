package com.example.projettdm_boughazi_bounsiar.data


import android.util.Log
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

        var videos : List<Video> = listOf(Video("https://www.youtube.com/watch?v=TYqSUtQk12E", "A Documentary about Canada", R.drawable.ytbcnd1, 1),
            Video("https://www.youtube.com/watch?v=PDluztBSaBc","10 Best Places to Visit in Canada - Travel Video",R.drawable.ytbcnd2, 1),
            Video("https://www.youtube.com/watch?v=oZRBUBbfIJ8","10 Best Places to Visit in Switzerland - Travel Video",R.drawable.ytbswiss1, 41),
            Video("https://www.youtube.com/watch?v=sh4MGOqhR28","Switzerland - An alpine country",R.drawable.ytbswiss2, 41),
            Video("https://www.youtube.com/watch?v=6dGYVKt1zw4","South Korea: The Silent Cultural Superpower - Full BBC Documentary",R.drawable.ytbkorea1, 82),
            Video("https://www.youtube.com/watch?v=paUZs41-pvY","30 Things to Do and Know about Seoul - South Korea Travel Guide",R.drawable.ytbkorea2, 82),
            Video("https://www.youtube.com/watch?v=iNoTGO31MAI","Exploring ALGIERS, Capital City of ALGERIA دزاير DZ",R.drawable.ytbalg1, 213),
            Video("https://www.youtube.com/watch?v=JeQr63Gd2gE","99 CHOSES QUI N’ARRIVENT QU’EN ALGERIE | Lama Faché",R.drawable.ytbalg2, 213),
            Video("https://www.youtube.com/watch?v=00ZXaXIABMY","15 Tips for First-Time Travellers to Japan | japan-guide.com",R.drawable.ytbjapan1, 81),
            Video("https://www.youtube.com/watch?v=-pgCPJSiKoo","Japan : Tradition & Culture",R.drawable.ytbjapan2, 81)
        )

        return videos

    }
}