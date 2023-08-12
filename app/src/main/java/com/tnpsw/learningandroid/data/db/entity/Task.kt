package com.tnpsw.learningandroid.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by tnphi on 12/08/2023.
 */

@Entity(tableName = "task_table")
class Task(
 @PrimaryKey(autoGenerate = true) val id: Int,
 @ColumnInfo(name = "task_name") val taskName: String
)