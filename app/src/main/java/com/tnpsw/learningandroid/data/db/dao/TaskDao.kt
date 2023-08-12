package com.tnpsw.learningandroid.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.tnpsw.learningandroid.data.db.entity.Task
import kotlinx.coroutines.flow.Flow

/**
 * Created by tnphi on 12/08/2023.
 */

@Dao
interface TaskDao {
    @Query("select * from task_table")
    fun getTask(): Flow<MutableList<Task>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(obj: Task)

    @Delete
    suspend fun remove(obj: Task)

    @Query("delete from task_table where id =:taskId")
    suspend fun removeById(taskId: Int)
}