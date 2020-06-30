package com.example.projettdm_boughazi_bounsiar.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Image(
    @PrimaryKey var codeImage : Int,
    @ColumnInfo(name= "country") var countryCode : Int,
    @ColumnInfo(name= "titre") var titreImage : String

){
    constructor():this(0, 0, ""){
    }
}