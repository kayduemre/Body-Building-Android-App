package com.miastech.bodybuildingandroidapp.data.entity

import android.util.Log
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExerciseInstructions(
    @PrimaryKey(autoGenerate = true) val instructionId: Long,
    val exerciseId: Log,

    val description: String,
    val createdDate: String
)
