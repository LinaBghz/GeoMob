package com.example.projettdm_boughazi_bounsiar.data

import android.graphics.Bitmap

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.projettdm_boughazi_bounsiar.R


@Entity
data class Country(
    @PrimaryKey var codeCountry : Int,
    @ColumnInfo(name = "nom") var nom: String,
    @ColumnInfo(name = "description") var description: String,
    @ColumnInfo(name = "surface") var surface : String,
    @ColumnInfo(name = "population") var population : String,
    @ColumnInfo(name = "historique") var historique : String,
    @ColumnInfo(name = "drapeau") var drapeau : Int,
    @ColumnInfo(name = "hymne") var hymne : Int,
    @ColumnInfo(name = "ressources") var ressources : String,
    @ColumnInfo(name = "main_image") var mainImage: Int
    ){
    constructor():this(0,"", "", "", "","",0, 0,
        "" , 0){

    }

    fun prepopulateCountry() : List<Country>{

        var countries : List<Country> = listOf(Country(213, "Alger",  R.string.description_alger.toString() , "2 381 740 KM2" ,"34 586 184" , R.string.historique_alger.toString(), R.drawable.alger,
            0, R.string.ressources_alger.toString(), R.drawable.algermain))
        return countries

    }
}

