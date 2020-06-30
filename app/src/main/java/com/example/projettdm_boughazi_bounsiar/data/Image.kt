package com.example.projettdm_boughazi_bounsiar.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.projettdm_boughazi_bounsiar.R


@Entity
data class Image(
    @PrimaryKey var codeImage : Int,
    @ColumnInfo(name= "country") var countryCode : Int,
    @ColumnInfo(name= "titre") var titreImage : String

){
    constructor():this(0, 0, ""){
    }


    fun prepopulateImage() : List<Image>{

        var images : List<Image> = listOf(Image( R.drawable.placeholder, 213,"image" ), Image(R.drawable.algermain, 213, "landscape"))
        return images

    }
}