package com.example.blockone_onboarding.data.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.blockone_onboarding.data.model.local.BlockInfoLocal
import com.example.blockone_onboarding.data.persistence.dao.BlockInfoDao

@Database(entities = [BlockInfoLocal::class], version = 1, exportSchema = false)
abstract class BlockOneDataBase : RoomDatabase() {

    abstract fun blockInfoDao(): BlockInfoDao
}