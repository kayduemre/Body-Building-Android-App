package com.miastech.bodybuildingandroidapp.data.entity.measureonetomany

import androidx.room.Embedded
import androidx.room.Relation
import com.miastech.bodybuildingandroidapp.data.entity.BodyMassIndex

data class MeasureWithBodyMassIndexList(
    @Embedded val bodyMassIndex: BodyMassIndex,
    @Relation(
        parentColumn = "measureId",
        entityColumn = "measureId"

    )
    val bodyMassIndexList: List<MeasureWithBodyMassIndexList>
)