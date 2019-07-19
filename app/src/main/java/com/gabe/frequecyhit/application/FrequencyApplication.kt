package com.gabe.frequecyhit.application

import android.app.Application
import androidx.room.Room
import com.gabe.frequecyhit.datasource.FrequencyDatabase

class FrequencyApplication : Application() {

    companion object {
        var database: FrequencyDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this, FrequencyDatabase::class.java, "we-need-db").build()
    }
}