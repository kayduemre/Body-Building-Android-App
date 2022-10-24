package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WorkingMass(
    @PrimaryKey val massId:Long,

    val massName: String,
    val massImage: String,
    val createdDate: String
)
