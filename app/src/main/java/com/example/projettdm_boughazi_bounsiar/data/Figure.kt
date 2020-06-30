package com.example.projettdm_boughazi_bounsiar.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey



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
}