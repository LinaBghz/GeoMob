package com.example.projettdm_boughazi_bounsiar.data


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity
data class Video(
    @PrimaryKey var url : String,
    @ColumnInfo(name = "titre") var titre: String,
    @ColumnInfo(name = "image") var image : Int

){
    constructor():this("","",0){
    }
}