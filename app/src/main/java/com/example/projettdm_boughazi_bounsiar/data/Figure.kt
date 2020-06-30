package com.example.projettdm_boughazi_bounsiar.data

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Parcelize
@Entity
data class Figure(
    @PrimaryKey var code : Int,
    @ColumnInfo(name = "nom") var nom: String,
    @ColumnInfo(name = "prenom") var prenom: String,
    @ColumnInfo(name = "description") var description : String,
    @ColumnInfo(name = "image") var image : Int

) : Parcelable {
    constructor():this(0,"","", "", 0 ){
    }
}