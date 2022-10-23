package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Embedded
import androidx.room.Relation

data class ExerciseWithPracticalInformationList(
    @Embedded val exercise: Exercise,
    @Relation(
        parentColumn = "exerciseId",
        entityColumn = "exerciseId"
    )
    val exercisePracticalInformation: List<ExercisePracticalInformation>
)
