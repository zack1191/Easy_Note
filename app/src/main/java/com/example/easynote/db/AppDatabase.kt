package com.example.easynote.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.easynote.db.daos.NoteDao
import com.example.easynote.db.entities.NoteEntities

@Database(entities = [NoteEntities::class],version =1)
abstract class AppDatabase : RoomDatabase(){

    abstract fun noteDao(): NoteDao


}