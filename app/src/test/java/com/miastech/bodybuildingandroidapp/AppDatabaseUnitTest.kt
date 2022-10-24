package com.miastech.bodybuildingandroidapp

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.miastech.bodybuildingandroidapp.data.dao.UserDao
import com.miastech.bodybuildingandroidapp.data.database.AppDatabase
import com.miastech.bodybuildingandroidapp.data.entity.User
import org.hamcrest.CoreMatchers.equalTo
import org.junit.After
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException
import java.security.AccessController.getContext
import java.time.LocalDateTime


@RunWith(AndroidJUnit4::class)
class AppDatabaseUnitTest {

    lateinit var db : AppDatabase
    lateinit var userDao: UserDao

    @Before
    fun createDb() {

        db = Room.inMemoryDatabaseBuilder(
            InstrumentationRegistry.getInstrumentation().context,
            AppDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        db.clearAllTables()
        userDao = db.userDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.clearAllTables()
        db.close()
    }

    @Test
    fun deleteUser() {
        val user: User = User(
            email = "emre@gmail.com",
            firstName = "Emre",
            lastName = "Kaydu",
            password = "123456",
            age = "21",
            createdDate = LocalDateTime.now().toString(),
            updatedData = LocalDateTime.now().toString()
        )

        userDao.insertUser(user)
        var byName = userDao.findByName("Emre", "Kaydu")
        userDao.delete(byName[0])
        byName = userDao.findByName("Emre", "Kaydu")
        assert(byName.isEmpty())

    }

    @Test
    fun update() {
        val user: User = User(
            email = "emre@gmail.com",
            firstName = "Emre",
            lastName = "Kaydu",
            password = "123456",
            age = "21",
            createdDate = LocalDateTime.now().toString(),
            updatedData = LocalDateTime.now().toString()
        )
        userDao.insertUser(user)
        val byName = userDao.findByName("Emre", "Kaydu")
        val updatedUser = User(
            userId = byName[0].userId,
            lastName = byName[0].lastName,
            firstName = byName[0].firstName,
            age = byName[0].age,
            updatedData = LocalDateTime.now().toString(),
            createdDate = byName[0].createdDate,
            password = byName[0].password,
            email = byName[0].email)

        userDao.updateUser(updatedUser)
        val lastUpdatedUser = userDao.findByName("Emre", "Kaydu")
        assert(lastUpdatedUser.size == 1)
    }

    @Test
    fun insertData() {
        val user: User = User(
            email = "emre@gmail.com",
            firstName = "Emre",
            lastName = "Kaydu",
            password = "123456",
            age = "21",
            createdDate = LocalDateTime.now().toString(),
            updatedData = LocalDateTime.now().toString()
        )
        userDao.insertUser(user)
        val byName = userDao.findByName("Emre", "Kaydu");
        assert(byName.isNotEmpty())
    }

}