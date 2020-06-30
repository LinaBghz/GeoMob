package com.example.projettdm_boughazi_bounsiar.data

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Parcelize
@Entity
data class Tweet(
    @PrimaryKey var url : String,
    @ColumnInfo(name = "utilisateur") var utilisateur: String,
    @ColumnInfo(name = "contenue") var contenue : String

) : Parcelable {
    constructor():this("","",""){
    }
}