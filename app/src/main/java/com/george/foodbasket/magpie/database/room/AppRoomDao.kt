package com.george.foodbasket.magpie.database.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.george.foodbasket.magpie.models.AppNote


@Dao
interface AppRoomDao {
    @Query("SELECT * FROM notes_table")
    fun getAllNotes():LiveData<List<AppNote>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert (note: AppNote)

    @Delete
    suspend fun delete(note: AppNote)
}