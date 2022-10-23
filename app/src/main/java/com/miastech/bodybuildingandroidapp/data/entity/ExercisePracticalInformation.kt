package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExercisePracticalInformation(
    @PrimaryKey(autoGenerate = true) val practicalInfoId: Long,
    val exerciseId: Long,

    val benefit: List<String>,
    val goal: List<String>,
    val notRecommended: List<String>
)
