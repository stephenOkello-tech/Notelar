package com.notelar.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.notelar.data.daos.LabelDao
import com.notelar.data.entities.Label

@Database(entities = [
    Label::class
], version = 1)
abstract class AppDataBase : RoomDatabase(){

    abstract fun labelDao() : LabelDao?

    companion object{
        private var instance : AppDataBase? = null

        @Synchronized
        fun getInstance(context : Context) : AppDataBase? {
            if(instance == null){
                instance = Room.databaseBuilder(context.applicationContext, AppDataBase::class.java, "app_db")
                        .fallbackToDestructiveMigration()
                        .addCallback(callback)
                        .build()
            }
            return instance
        }

        private val callback : Callback = object : Callback(){
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
            }
        }
    }
}