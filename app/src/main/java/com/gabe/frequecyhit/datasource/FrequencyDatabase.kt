package com.gabe.frequecyhit.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gabe.frequecyhit.model.entries.MemberEntry

@Database(entities = [MemberEntry::class], version = 1)
abstract class FrequencyDatabase : RoomDatabase() {
    abstract fun personDao(): MembersDao
}