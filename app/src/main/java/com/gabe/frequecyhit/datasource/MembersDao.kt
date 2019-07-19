package com.gabe.frequecyhit.datasource

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.gabe.frequecyhit.model.entities.Member
import io.reactivex.Flowable

@Dao
interface MembersDao {

    @Query("SELECT * FROM MemberEntry")
    fun getAllPeople(): Flowable<List<Member>>

    @Insert
    fun insert(person: Member)
}