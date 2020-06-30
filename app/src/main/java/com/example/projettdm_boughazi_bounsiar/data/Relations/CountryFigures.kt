package com.example.projettdm_boughazi_bounsiar.data.Relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.projettdm_boughazi_bounsiar.data.Country
import com.example.projettdm_boughazi_bounsiar.data.Figure

data class CountryFigures(
    @Embedded val country: Country,
    @Relation(
        parentColumn = "codeCountry",
        entityColumn = "country"
    )
    val figures: List<Figure>
)