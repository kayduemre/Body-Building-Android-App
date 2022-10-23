package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExerciseCategory(
    @PrimaryKey(autoGenerate = true) val exerciseCategoryId: Long,
    val exerciseId:Long,

    val categoryName: String
)
