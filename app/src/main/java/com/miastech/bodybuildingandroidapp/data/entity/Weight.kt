package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Weight(
    @PrimaryKey(autoGenerate = true) val weightId: Long,
    val measureId: Long,

    val value: String,
    val updateDate: String

)
