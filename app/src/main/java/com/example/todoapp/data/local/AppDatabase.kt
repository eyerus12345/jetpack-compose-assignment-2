package com.example.todoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [TodoEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}