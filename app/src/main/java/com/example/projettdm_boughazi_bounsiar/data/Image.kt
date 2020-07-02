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

        var images : List<Image> = listOf(Image( R.drawable.alg2, 213,"" ), Image(R.drawable.alg1, 213, ""), Image(R.drawable.alg3, 213, ""),
            Image(R.drawable.canada1, 1, ""), Image(R.drawable.canada3, 1, ""),Image(R.drawable.canada2, 1, "") )
        return images

    }
}