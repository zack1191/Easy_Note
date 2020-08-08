package com.example.easynote.db.daos


import androidx.room.*
import com.example.easynote.db.entities.NoteEntities

@Dao
interface NoteDao {
    @Query("SELECT * FROM noteList")
    fun getNote(): List<NoteEntities>

    @Insert
    fun insertNote(noteEntities: NoteEntities)




}