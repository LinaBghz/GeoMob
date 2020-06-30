package com.example.projettdm_boughazi_bounsiar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projettdm_boughazi_bounsiar.data.Country
import com.example.projettdm_boughazi_bounsiar.data.Figure
import com.example.projettdm_boughazi_bounsiar.data.Tweet
import com.example.projettdm_boughazi_bounsiar.data.Video

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val perso1 = Figure(0,"Obama","Barak","Ex US president",R.drawable.placeholder)
        val perso2 = Figure(0,"Justing","Trudeau","Canada PM",R.drawable.placeholder)

        val videoList = arrayListOf(Video("https://www.youtube.com/watch?v=Atvsg_zogxo","Noice MV",R.drawable.placeholder),Video("https://www.youtube.com/watch?v=Atvsg_zogxo","Another one",R.drawable.placeholder))

        val tweetList = arrayListOf<Tweet>()

        val country = Country(0,
            "Canada",
            "Lores ipsum ez bff azef zafhaze faz fze fzafhza fze fzae faz fzaef hzaf erfhfovhoeg ","9,99"
            ,"Lorem ipsum zrzaer erzae r zear zear za raze rzae rz aer"
            , R.drawable.placeholder
            , arrayListOf(R.drawable.placeholder,R.drawable.placeholder)
            ,R.raw.idir
            ,"Lorem ipsum bla bla bla bla eazer azer aztaz zer azer az azer"
            ,arrayListOf(perso1,perso2)
            ,videoList
            ,tweetList)

        val intent: Intent = Intent(this, CountryDetailActivity::class.java)
        intent.putExtra("Country",country)
        startActivity(intent)

    }
}
