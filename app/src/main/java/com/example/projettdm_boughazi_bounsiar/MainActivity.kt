package com.example.projettdm_boughazi_bounsiar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent: Intent = Intent(this, CountryDetailActivity::class.java)
        startActivity(intent)

    }
}
