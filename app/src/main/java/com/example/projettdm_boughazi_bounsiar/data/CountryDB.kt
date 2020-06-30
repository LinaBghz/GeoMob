package com.example.projettdm_boughazi_bounsiar.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Country::class), version = 1)
abstract class CountryDB() : RoomDatabase(){
    abstract fun CountryDAO() : CountryDAO
    companion object {
        private var instance: CountryDB? = null

        fun getInstance(context: Context): CountryDB? {
            if (instance == null) {

                instance = Room.databaseBuilder(context.getApplicationContext(),
                    CountryDB::class.java, "country.db")
                    .build()

            }
            return instance
        }

        fun destroyInstance() {
            instance = null
        }

    }}