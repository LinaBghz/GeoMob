package com.example.projettdm_boughazi_bounsiar.data.Relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.projettdm_boughazi_bounsiar.data.Country
import com.example.projettdm_boughazi_bounsiar.data.Video

data class CountryVideos(
    @Embedded val country: Country,
    @Relation(
        parentColumn = "codeCountry",
        entityColumn = "country"
    )
    val videos: List<Video>
)