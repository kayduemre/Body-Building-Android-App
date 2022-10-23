package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Measure(
    @PrimaryKey(autoGenerate = true) val measureId: Long,
    val userId: Long

)
