package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Embedded
import androidx.room.Relation


data class ExerciseWithWorkingMassList(
    @Embedded val exercise: Exercise,
    @Relation(
        parentColumn = "exerciseId",
        entityColumn = "exerciseId"
    )
    val exerciseWithWorkingMassList: List<ExerciseWithWorkingMassList>
)
