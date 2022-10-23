package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Exercise(
    @PrimaryKey(autoGenerate = true) val exerciseId: Long,

    val exerciseName: String,
    val void: String,
    val warning: String

)