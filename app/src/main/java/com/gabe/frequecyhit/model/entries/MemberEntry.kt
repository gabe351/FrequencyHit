package com.gabe.frequecyhit.model.entries

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MemberEntry (
    @PrimaryKey(autoGenerate = true)
    val uid: Long,
    val name: String = "",
    val role: String = "",
    val isThere: Boolean = false
)