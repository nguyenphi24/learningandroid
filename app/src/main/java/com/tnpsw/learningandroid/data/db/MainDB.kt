package com.tnpsw.learningandroid.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tnpsw.learningandroid.data.db.dao.TaskDao
import com.tnpsw.learningandroid.data.db.entity.Task

/**
 * Created by tnphi on 12/08/2023.
 */

@Database(entities = [Task::class], version = MainDB.DB_VERSION, exportSchema = false)
abstract class MainDB : RoomDatabase() {
    companion object {
        const val DB_NAME = "main_db"
        const val DB_VERSION = 1

        @Volatile
        private var INSTANCE: MainDB? = null
        fun getDatabase(context: Context): MainDB {
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDB::class.java,
                    DB_NAME
                )
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }

    abstract fun provideTaskDao(): TaskDao
}