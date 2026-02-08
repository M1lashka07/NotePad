package com.example.notes.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [NoteDbModel::class],
    version = 2,
    exportSchema = false
)
abstract class NotesDataBase : RoomDatabase() {
    abstract fun notesDao(): NotesDAO
}