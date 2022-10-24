package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BodyMassIndex(
    @PrimaryKey(autoGenerate = true) val bodyMassIndexId: Long,
    val measureId: Long
)
