package com.example.projettdm_boughazi_bounsiar.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import java.util.concurrent.Executors

@Database(entities = arrayOf(Country::class, Figure::class, Image::class, Tweet::class, Video::class), version = 2, exportSchema = false)
abstract class CountryDB() : RoomDatabase(){
    abstract fun CountryDAO() : CountryDAO
    companion object {
        private var instance: CountryDB? = null

        fun getInstance(context: Context): CountryDB? {
            if (instance == null) {

                instance = buildDatabase(context)

            }
            return instance
        }

        private fun buildDatabase(context: Context): CountryDB? {
            return Room.databaseBuilder<CountryDB>(
                context,
                CountryDB::class.java,
                "my-database"
            )
                .addCallback(object : Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        Executors.newSingleThreadScheduledExecutor()
                            .execute(Runnable {
                                getInstance(context)?.CountryDAO()?.insertAllCountries(Country().prepopulateCountry())
                                getInstance(context)?.CountryDAO()?.insertAllFigures(Figure().prepopulateFigure())
                                getInstance(context)?.CountryDAO()?.insertAllImages(Image().prepopulateImage())
                                getInstance(context)?.CountryDAO()?.insertAllTweets(Tweet().prepopulateTweet())
                                getInstance(context)?.CountryDAO()?.insertAllVideos(Video().prepopulateVideo())

                            })
                    }
                })
                .build()
        }

        fun destroyInstance() {
            instance = null
        }

    }}