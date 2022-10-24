package com.miastech.bodybuildingandroidapp.data.dao

import androidx.room.*
import com.miastech.bodybuildingandroidapp.data.entity.User
import com.miastech.bodybuildingandroidapp.data.entity.useronetomany.UserWithMeasureLists

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE userId IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): List<User>

    @Delete
    fun delete(user: User)

    @Update
    fun updateUser(user: User)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(vararg users: User)

    @Transaction
    @Query("SELECT * FROM User")
    fun getUserWithMeasureList(): List<UserWithMeasureLists>
}