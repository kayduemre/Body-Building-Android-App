package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Embedded
import androidx.room.Relation

data class ExerciseWithInstructionsList(

    @Embedded val exerciseInstructions: ExerciseInstructions,
    @Relation(
        parentColumn = "exerciseId",
        entityColumn = "exerciseId"
    )
    val exerciseWithInstructionsList: List<ExerciseWithInstructionsList>
)
