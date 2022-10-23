package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExerciseImage(
    @PrimaryKey(autoGenerate = true) val imageId: Long,
    val exerciseId: Long,

    val imageUrl: String

)
