package com.miastech.bodybuildingandroidapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.miastech.bodybuildingandroidapp.data.dao.UserDao
import com.miastech.bodybuildingandroidapp.data.entity.Measure
import com.miastech.bodybuildingandroidapp.data.entity.User

@Database(entities = [
    User::class,
    Measure::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}