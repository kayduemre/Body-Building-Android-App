package com.miastech.bodybuildingandroidapp.data.entity.measureonetomany

import androidx.room.Embedded
import androidx.room.Relation
import com.miastech.bodybuildingandroidapp.data.entity.Measure

data class MeasureWithHeightList(
    @Embedded val measure: Measure,
    @Relation(parentColumn = "measureId",
    entityColumn = "measureId")

    val measureWithHeightList: List<MeasureWithHeightList>
)
