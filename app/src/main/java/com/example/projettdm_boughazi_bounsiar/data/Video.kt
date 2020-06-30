package com.example.projettdm_boughazi_bounsiar.data


import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Parcelize
@Entity
data class Video(
    @PrimaryKey var url : String,
    @ColumnInfo(name = "titre") var titre: String,
    @ColumnInfo(name = "image") var image : Int

) : Parcelable {
    constructor():this("","",0){
    }
}