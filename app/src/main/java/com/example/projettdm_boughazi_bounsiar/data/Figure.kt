package com.example.projettdm_boughazi_bounsiar.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.projettdm_boughazi_bounsiar.R


@Entity
data class Figure(
    @PrimaryKey var codeFigure : Int,
    @ColumnInfo(name = "nom") var nom: String,
    @ColumnInfo(name = "prenom") var prenom: String,
    @ColumnInfo(name = "description") var description : String,
    @ColumnInfo(name = "image") var image : Int,
    @ColumnInfo(name= "country") var countryCode : Int

){
    constructor():this(0,"","", "", 0 , 0){
    }

    fun prepopulateFigure() : List<Figure>{

        var figures : List<Figure> = listOf(Figure( 1 , "Melikechi", "Noureddine", "Physicien atomique pour la NASA.",
            R.drawable.persoalg1, 213) ,
        Figure(2,"Haba","Belgacem","Chercheur algérien, avec 500 brevets d'invention.",R.drawable.persoalg2, 213),
            Figure(3,"Mahrez","Riad","Footballeur international, meilleur joueur de l'année PFA 2016.",R.drawable.persoalg3, 213),
            Figure(4,"Trudeau","Justin","Prime ministre de Canada.",R.drawable.persocnd1, 1),
            Figure(5,"Musk","Elon","DG de SpaceX.",R.drawable.persocnd2, 1),
            Figure(6,"Bondar","Roberta","La première astronaute canadienne.",R.drawable.persocnd3, 1),
            Figure(7,"Abe","Shinzō ","Chef du gouvernement au Japon.",R.drawable.persojapan1, 81),
            Figure(8,"Honjo","Tasuku ","Immunologiste japonais, lauréat du prix de Nobel de physiologie en 2019.",R.drawable.persojapan2, 81),
            Figure(9,"Sommaruga","Simonetta ","Présidente de la Confédération suisse.",R.drawable.persoswiss1, 41),
            Figure(10,"Mayor","Michel ","Astrophysicien  et lauréat du prix Nobel de physique en 2019.",R.drawable.persoswiss2, 41),
            Figure(11,"Euler","Leonhard","Mathématicien et physicien.",R.drawable.persoswiss3, 41),
            Figure(12,"Moon","Jae-in","Président de la République de Corée.",R.drawable.persokorean1, 82),
            Figure(13,"Lee","Kun-hee","Président de la société Samsung.",R.drawable.persokorean2, 82),
            Figure(14,"Kim","Dae-jung","ex- Président et lauréat du prix Nobel de la paix en 2000.",R.drawable.persokorean3, 82)


            )
        return figures

    }
}