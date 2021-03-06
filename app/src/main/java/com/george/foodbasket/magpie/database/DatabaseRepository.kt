package com.george.foodbasket.magpie.database

import androidx.lifecycle.LiveData
import com.george.foodbasket.magpie.models.AppNote

interface DatabaseRepository {
    val allNotes:LiveData<List<AppNote>>
    suspend fun insert(note: AppNote, onSuccess:()->Unit)
    suspend fun delete(note: AppNote, onSuccess:()->Unit)
}