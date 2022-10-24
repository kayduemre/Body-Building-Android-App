package com.miastech.bodybuildingandroidapp.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) val userId: Int?=null,
    @ColumnInfo(name = "email") val email: String,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?,
    @ColumnInfo(name = "password") val password: String,
    @ColumnInfo(name = "age") val age: String,

    @ColumnInfo(name = "createdDate") val createdDate: String,
    @ColumnInfo(name = "updatedData") val updatedData: String,

)