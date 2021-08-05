package com.animal.di.module

import android.app.Application
import androidx.room.Room
import com.animal.database.MyDatabase
import com.animal.utils.Constants
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomDatabaseModule(application: Application) {
    private var application = application
    private lateinit var myDatabase: MyDatabase

    @Singleton
    @Provides
    fun providesRoomDatabase(): MyDatabase {
        myDatabase =
            Room.databaseBuilder(application, MyDatabase::class.java, Constants.DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .build()
        return myDatabase
    }

    @Singleton
    @Provides
    fun providesPostDAO(myDatabase: MyDatabase) = myDatabase.getDao()
}