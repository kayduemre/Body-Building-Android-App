package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Embedded
import androidx.room.Relation

data class ExerciseWithImageList(
    @Embedded val exercise: Exercise,
    @Relation(
        parentColumn = "exerciseId",
        entityColumn = "exerciseId"
    )
    val exerciseWithImageList: List<ExerciseWithImageList>
)
