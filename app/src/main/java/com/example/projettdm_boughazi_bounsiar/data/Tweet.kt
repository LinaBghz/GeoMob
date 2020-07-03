package com.example.projettdm_boughazi_bounsiar.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity
data class Tweet(
    @PrimaryKey var urlTweet : String,
    @ColumnInfo(name = "displayname") var displayname: String,
    @ColumnInfo(name = "handle") var handle : String,
    @ColumnInfo(name = "contenue") var contenue : String,
    @ColumnInfo(name= "country") var countryCode : Int

){
    constructor():this("","","", "", 0){
    }

    fun prepopulateTweet() : List<Tweet>{

        var tweets : List<Tweet> = listOf(
            Tweet("https://twitter.com/TebbouneAmadjid/status/1274697819430031360", "عبدالمجيد تبون - Abdelmadjid Tebboune",
            "@TebbouneAmadjid", "فقدت الجزائر باستشهاد العريف زناندة مصطفى،شبلا من أشبال الأمة ممن سالت دماؤهم في سبيل الوطن المفدى ضد الإرهاب الهمجي.لن تذهب دماء مصطفى ومن سبقوه سدى وسنقضي معا بحول الله على بقايا الإرهاب.تعازيّ الخالصة لأسرة الشهيد و للجيش الوطني الشعبي،سليل جيش التحرير.إنا لله وإنا إليه راجعون", 213),
            Tweet("https://twitter.com/guide_alger/status/1267767387094466563", "Guide Alger",
                "@guide_alger", "Quels sont les endroits qui vous manquent le plus à Alger ? \n" +
                        "\n ما هي الأماكن التي اشتقت اليها في الجزائر العاصمة ؟ \n \n Crédit images : \n@MoumenAb1\n\n\n#alger #algerie #algeria #confinement", 213),
            Tweet("https://twitter.com/visitkoreaFR/status/1278584192058535936", "VisitKoreaFR",
                "@visitkoreaFR", "La ville de #Busan offre toujours de nouveux lieux à découvrir même après plusieurs visites ! ⛵ Aujourd'hui, consultez notre article \"Deux jours et une nuit à Busan\" https://bit.ly/2YRI14I\n" +
                        "\n#Corée #Voyage #VisitKorea #OurHeartsAreAlwaysOpen", 82),
            Tweet("https://twitter.com/KoreaCenterFR/status/1277975834486177794", "CentreCulturelCoréen",
                "@KoreaCenterFR", "#Spectacle  Ce jeudi 2 juillet à 20h, n'oubliez pas de profiter de la diffusion gratuite du spectacle de marionnettes, \"Histoire de Dallae\" ⠀\n" +
                        "https://buff.ly/2YwvHGx\n\nBon visionnage à tous !", 82),
            Tweet("https://twitter.com/japan/status/1278634598079946760", "japan",
                "@japan", "Japan’s largest denim production center #FukuyamaCity, Hiroshima, is also creating a city of the future by experimenting city-wide w/ new technologies to address #UrbanTranport, #healthcare, and #tourism.\n" +
                        "\n#SetoInlandSea #InnovationJapan #Society5_0", 81),
            Tweet("https://twitter.com/Web_Japan/status/1276394057292378112", "japan",
                    "@japan", "#WebJapan, provides the various information about #Japan including facts, fun and new trends, traditional and pop culture, science and technology, food, travel and life style!\n" +
                        "\nhttps://web-japan.org\nMainly available in English, French, Spanish, Chinese, Arabic, and Japanese. !", 81),
            Tweet("https://twitter.com/CanadianPM/status/1278518756369674241", "CanadianPM",
                "@CanadianPM", "What makes Canada special is not that Canadians know that this is the best country in the world – it’s that we know it could be. We know our work together is not yet done. Watch Prime Minister Justin Trudeau and Mrs. " +
                        "Sophie Grégoire Trudeau’s #CanadaDay remarks Flèche vers le bas", 1),
            Tweet("https://twitter.com/Women_Canada/status/1278675484931502080", "Women and Gender Equality Canada",
                "@Women_Canada", "Canada’s frontline workers are making it possible for us to #flattenthecurve. Thank you for your courage and dedication!  http://ow.ly/y7YJ50AlY0b", 1),
            Tweet("https://twitter.com/MySwitzerland_f/status/1269971862982983680", "Suisse Tourisme",
                "@MySwitzerland_f", "Nous avons besoin d'une nature qui nous donne de l’énergie. Nous avons besoin de Suisse. " +
                        "En savoir plus: https://myswitzerland.com/fr-ch/nous-avons-besoin-de-suisse/ #IneedSwitzerland", 41),
            Tweet("https://twitter.com/MySwitzerlandIN/status/1276149974607302657", "MySwitzerlandIN",
                "@MySwitzerlandIN", "Creating World Records!!!\n\nSwiss acrobats perform death-defying stunts during an airshow at the \n@Glacier_3000", 41)


        )
        return tweets

    }
}