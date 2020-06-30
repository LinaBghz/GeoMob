package com.example.projettdm_boughazi_bounsiar.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.projettdm_boughazi_bounsiar.R


@Entity
data class Figure(
    @PrimaryKey var codeFigure : Int,
    @ColumnInfo(name = "nom") var nom: String,
    @ColumnInfo(name = "prenom") var prenom: String,
    @ColumnInfo(name = "description") var description : String,
    @ColumnInfo(name = "image") var image : Int,
    @ColumnInfo(name= "country") var countryCode : Int

){
    constructor():this(0,"","", "", 0 , 0){
    }

    fun prepopulateFigure() : List<Figure>{

        var figures : List<Figure> = listOf(Figure( 1 , "Ben Bella", "Ahmed", "Président de la République algérienne démocratique et populaire",
            R.drawable.benbella, 213) ,
        Figure(2,"Obama","Barak","Ex US president",R.drawable.placeholder, 213))
        return figures

    }
}