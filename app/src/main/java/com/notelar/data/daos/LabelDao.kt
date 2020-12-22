package com.notelar.data.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.notelar.data.entities.Label

@Dao
interface LabelDao {
    @Query("SELECT * FROM labels where label_id = :id")
    fun getLabelById(id : Long) : LiveData<Label>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLabel(label : Label) : Long

    @Query("SELECT * FROM labels")
    fun getAllLabels() : LiveData<List<Label>>
}