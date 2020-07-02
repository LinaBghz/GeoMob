package com.example.projettdm_boughazi_bounsiar.data

import android.content.res.Resources
import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.projettdm_boughazi_bounsiar.R


@Entity
data class Country(
    @PrimaryKey var codeCountry : Int,
    @ColumnInfo(name = "nom") var nom: String,
    @ColumnInfo(name = "description") var description: String,
    @ColumnInfo(name = "surface") var surface : String,
    @ColumnInfo(name = "population") var population : String,
    @ColumnInfo(name = "historique") var historique : String,
    @ColumnInfo(name = "drapeau") var drapeau : Int,
    @ColumnInfo(name = "hymne") var hymne : Int,
    @ColumnInfo(name = "ressources") var ressources : String,
    @ColumnInfo(name = "main_image") var mainImage: Int
    ){
    constructor():this(0,"", "", "", "","",0, 0, "" , 0){

    }

    fun prepopulateCountry() : List<Country>{

        var countries : List<Country> = listOf(
            Country(213, "Alger","L\\'Algérie est un pays nord-africain doté d\\'un littoral sur la mer Méditerranée et d\\'un intérieur désertique, le Sahara. De nombreux empires y ont laissé leur marque, comme les anciennes ruines romaines de Tipasa, en bord de mer. Dans la capitale, Alger, des sites ottomans, " +
                    "La guerre commence le 1er novembre 1954, après la réunion à Alger des six chefs du Front de libération nationale (Algérie) et anciens membres de l'Organisation spéciale, bras armé du Mouvement pour le triomphe des libertés démocratiques et aussi responsables du Comité révolutionnaire d'unité et d'action, et après la déclaration du 1er novembre 1954."  , "2 381 740 KM2" ,"42 972 878 HAB" ,"1954\n" +
                "   Toutes les forces locales sont définitivement vaincues par une nouvelle dynastie berbère, les Almohades, dirigés par Abdelmoumen Ibn Ali et dont le chef spirituel est Ibn Toumert. \n \n 5 juillet 1962 \n   L’Algérie devient indépendante à l’issue d’une guerre de 8 ans contre la présence coloniale française, une présence qui dura 132 ans.", R.drawable.algerianflag,
            R.raw.idir,"Les principaux gisements en Algérie sont parmi les plus importants dans le monde. Généralement ils sont localisés dans le Sud. Selon Sonatrach, les 67 % de réserves en hydrocarbures sont situés dans les régions de Oued Mya et de Hassi Messaoud. Gaz à Hassi R'Mel et le pétrole à Hassi Messaoud (huile). Illizi contient 14 % des réserves. Enfin, Rhourde Nouss renferme 9 % et Ahnet Timimoun 4 % et Berkine50. Les sites exploités pour pomper l'huile ou pour rechercher les hydrocarbures, actuellement, en Algérie, sont :" +
                        " Hassi Messaoud, Ain Amenas, Hassi R’mel, Stah, Rourde Nouss, Tin Fouyé Tabankort, Gassi Touil, Ohanet, Haoud Berkaoui, Hassi Berkine, Ourhoud, Mensel Lejmet Nord et satellites, Rhourde Ouled Djemaa, Touat, El Gassi, In Salah, Rhourde El Baguel \n Selon les données du ministère des Ressources en eau, l’Algérie compte 50 barrages en exploitation, 11 sont en cours de réalisation et 50 autres barrages à l’étude. Ces derniers devraient être réalisés avant 2020." , R.drawable.algeriamain),

            Country(1, "Canada","Le Canada est un pays nord-américain situé entre les États-Unis au sud et le cercle polaire au nord. Les principales villes sont Toronto, Vancouver, centre du cinéma de la côte ouest, Montréal et Québec, toutes deux francophones, et Ottawa, la capitale. Le Canada compte, parmi ses vastes étendues sauvages, le parc national de Banff avec ses nombreux lacs situé dans les montagnes Rocheuses. Il abrite également les célèbres et majestueuses chutes du Niagara." ,
                "9 984 670 KM2" ,"37 589 26 HAB" ,
                "1841-1843\nAu moment de l'Acte d'Union, c'est Kingston qui est désignée comme la capitale du nouveau pays. \n \n 2016 \n les cent patrons canadiens les mieux rémunérés ont gagné en moyenne 10,4 millions de dollars canadiens, soit plus de 200 fois le revenu moyen d'un travailleur canadien en 2016.", R.drawable.canadianflag,
                R.raw.idir, "Le Canada dispose de diverses ressources dont le pétrole, le gaz naturel, les combustibles fossiles, le carburant de remplacement, l\\'uranium et les énergies renouvelables." , R.drawable.canadamain),

                Country(81, "Japan", "Le Japon est un pays insulaire situé dans l'océan Pacifique. Il comporte des villes denses, des palais impériaux, des parcs nationaux montagneux ainsi que des milliers de temples et de sanctuaires. Les trains à grande vitesse Shinkansen relient les îles principales de Kyūshū (avec les plages subtropicales d'Okinawa), Honshū (où se trouvent Tokyo et le mémorial en hommage aux victimes du bombardement atomique d'Hiroshima) et Hokkaidō (prisée pour le ski). Tokyo, la capitale, est réputée pour ses gratte-ciel, ses magasins et sa culture populaire.",
                    "377 975 KM2", "125,930,000 HAB" , " 15 août 1945 \n L'empereur Shōwa procéda finalement à la reddition de l'empire du Japon après les bombardements atomiques d'Hiroshima et de Nagasaki par l'aviation américaine et l'invasion soviétique du Mandchoukouo. Le traité de paix avec la Russie est toujours en négociation, en règlement du problème des îles Kouriles du Sud, occupées par cette dernière depuis la fin du conflit. \n \n 1950 - 1980 \n  le Japon connaît un apogée culturel et économique et une formidable croissance. " , R.drawable.japaneseflag, 0 , "Le charbon japonais représente 15 milliards de tonnes de réserve, dont 10 milliards exploitables. C’est presque uniquement du charbon bitumineux à bas degré de carbonisation et cher à exploiter. \n Cinq métaux seulement existent en quantité suffisante au Japon pour la satisfaction de ses besoins : le cuivre, l’or, l’argent, le magnésium (extrait de l’eau de mer) et le chromium, nécessaire aux aciers spéciaux. Un sixième, le zinc, est assez abondant.", R.drawable.japanmain),
            Country( 41, "Switzerland","La Suisse est un pays montagneux d'Europe centrale abritant de nombreux lacs et villages, ainsi que les hauts sommets des Alpes. Les villes du pays comprennent des quartiers médiévaux et des monuments comme la Zytglogge (tour-clocher) de Berne, la capitale, et le pont en bois de la chapelle de Lucerne. Le pays est également réputé pour ses stations de ski et ses sentiers de randonnée. Les industries clés sont les secteurs bancaire et financier, et les montres et le chocolat suisses sont mondialement célèbres.",
                "41 285 KM2", "8 603 900 HAB", "La domination française exercée après l'invasion de 1798, réforme la Suisse en la transformant en un État unitaire appelé République helvétique. En effet, devant les troubles intérieurs incessants.",
                R.drawable.swissflag, 0, "En Suisse, la consommation de ressources naturelles et la mise sous pression de l'environnement par le processus du développement des infrastructures et de la croissance économique concurrencent fortement les succès de la politique de protection de l'environnement et des progrès techniques. Le développement durable préconise d'assurer ce développement en limitant les atteintes environnementales qu'il engendre. L'objectif est une utilisation efficace, la préservation, la valorisation et la sauvegarde des ressources naturelles en minimisant les risques environnementaux, économiques et sociaux.", R.drawable.switzerlandmain),
            Country(82, "Corée du Sud", "La Corée du Sud, un pays d'Asie de l'Est, occupe la moitié sud de la péninsule de Corée. Elle partage l'une des frontières les plus fortement militarisées du monde avec la Corée du Nord. Elle est également connue pour sa campagne vallonnée et verdoyante parsemée de cerisiers et de temples bouddhistes datant de plusieurs siècles, ainsi que pour les villages de pêcheurs de sa côte, ses îles subtropicales et ses villes high-tech comme Séoul, sa capitale.",
                "100 210 KM2", "51 709 098 HAB", "1954 \n    À la fin de la Seconde Guerre mondiale , la Corée a été divisée en deux zones par les puissances mondiales, les États-Unis et l'URSS. \n \n 1948 \n   le Sud et le Nord se constituèrent chacun en un État indépendant, un Nord communiste, et un Sud sous influence américaine.",
                R.drawable.koreanflag, 0 , "Le développement de la Corée se fonde surtout, sur une ressource qui compense l'absence de ressources naturelles : c'est sa population, qui donne au travail et à l'éducation une place qui ne connaît guère d'équivalent dans les pays développés.", 0))


        return countries

    }
}

