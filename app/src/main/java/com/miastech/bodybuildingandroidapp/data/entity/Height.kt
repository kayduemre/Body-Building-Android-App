package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Height(
    @PrimaryKey(autoGenerate = true) val heightId: Long,
    val measureId: Long,

    val value: String,
    val updatedDate: String

)
