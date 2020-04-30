package com.example.blockone_onboarding.data.di

import android.content.Context
import androidx.room.Room
import com.example.blockone_onboarding.data.persistence.BlockOneDataBase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal object PersistenceModule {

    @JvmStatic
    @Singleton
    @Provides
    fun provideDataBase(context: Context): BlockOneDataBase {
        return Room.databaseBuilder(
            context.applicationContext,
            BlockOneDataBase::class.java,
            "blockone.db"
        ).build()
    }
}