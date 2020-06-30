package com.example.projettdm_boughazi_bounsiar.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity
data class Tweet(
    @PrimaryKey var url : String,
    @ColumnInfo(name = "utilisateur") var utilisateur: String,
    @ColumnInfo(name = "contenue") var contenue : String

){
    constructor():this("","",""){
    }
}