package com.example.projettdm_boughazi_bounsiar.data

import android.content.res.Resources
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

        var countries : List<Country> = listOf(Country(213, "Alger",R.string.description_alger.toString()  , "2 381 740 KM2" ,"34 586 184" ,"1152\n" +
                "     toutes les forces locales sont définitivement vaincues par une nouvelle dynastie berbère, les Almohades, dirigés par Abdelmoumen Ibn Ali et dont le chef spirituel est Ibn Toumert", R.drawable.alger,
            R.raw.idir,"Selon les données du ministère des Ressources en eau, l’Algérie compte 50 barrages en exploitation, 11 sont en cours de réalisation et 50 autres barrages à l’étude. Ces derniers devraient être réalisés avant 2020" , R.drawable.algermain),

            Country(123, "Alger",R.string.description_alger.toString()  , "2 381 740 KM2" ,"34 586 184" ,
                "1152\n toutes les forces locales sont définitivement vaincues par une nouvelle dynastie berbère, les Almohades, dirigés par Abdelmoumen Ibn Ali et dont le chef spirituel est Ibn Toumert", R.drawable.alger,
                R.raw.idir,"Selon les données du ministère des Ressources en eau, l’Algérie compte 50 barrages en exploitation, 11 sont en cours de réalisation et 50 autres barrages à l’étude. Ces derniers devraient être réalisés avant 2020" , R.drawable.algermain))

        return countries

    }
}

