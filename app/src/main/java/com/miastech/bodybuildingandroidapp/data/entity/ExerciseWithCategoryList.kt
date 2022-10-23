package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Embedded
import androidx.room.PrimaryKey
import androidx.room.Relation


data class ExerciseWithCategoryList(
    @Embedded val exercise: Exercise,
    @Relation(
        parentColumn = "exerciseId",
        entityColumn = "exerciseId"
    )
    val exerciseWithCategoryList: List<ExerciseWithCategoryList>
)
