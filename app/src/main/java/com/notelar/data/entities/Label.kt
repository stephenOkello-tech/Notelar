package com.notelar.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "labels")
data class Label (

        @ColumnInfo(name = "label_id")
        @PrimaryKey(autoGenerate = true)
        val id : Long,

        @ColumnInfo(name = "label")
        val label : String


)