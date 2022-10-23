package com.miastech.bodybuildingandroidapp.data.entity.useronetomany

import androidx.room.Embedded
import androidx.room.Relation
import com.miastech.bodybuildingandroidapp.data.entity.Measure
import com.miastech.bodybuildingandroidapp.data.entity.User

data class UserWithMeasureLists(
    @Embedded val user: User,
    @Relation(
        parentColumn = "userId",
        entityColumn = "userId"
    )
    val measureList: List<Measure>
)
