package com.example.projettdm_boughazi_bounsiar.data

import android.graphics.Bitmap

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity
data class Country(
    @PrimaryKey var code : Int,
    @ColumnInfo(name = "nom") var nom: String,
    @ColumnInfo(name = "description") var description: String,
    @ColumnInfo(name = "surface") var surface : String,
    @ColumnInfo(name = "historique") var historique : String,
    @ColumnInfo(name = "drapeau") var drapeau : Int,
    @ColumnInfo(name = "images") var images : List<Int>?,
    @ColumnInfo(name = "hymne") var hymne : Int,
    @ColumnInfo(name = "ressources") var ressources : String,
    @ColumnInfo(name = "figures") var figures: List<Figure>?,
    @ColumnInfo(name = "videos") var videos : List<Video>?,
    @ColumnInfo(name = "tweets") var tweets : List<Tweet>?


    ){
    constructor():this(0,"", "", "", "",0, null, 0 ,
        "", null, null , null ){

    }
}