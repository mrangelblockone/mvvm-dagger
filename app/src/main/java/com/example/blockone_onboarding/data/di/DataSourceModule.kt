package com.example.blockone_onboarding.data.di

import com.example.blockone_onboarding.data.datasource.BlockInfoLocalDataSourceImpl
import com.example.blockone_onboarding.data.datasource.BlockInfoRemoteDataSourceImpl
import com.example.blockone_onboarding.domain.datasource.BlockInfoLocalDataSource
import com.example.blockone_onboarding.domain.datasource.BlockInfoRemoteDataSource
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [MappersModule::class, ServiceModule::class, PersistenceModule::class])
internal abstract class DataSourceModule {

    @Binds
    @Singleton
    abstract fun providesBlockInfoRemoteDataSource(
        blockInfoRemoteDataSourceImpl: BlockInfoRemoteDataSourceImpl
    ): BlockInfoRemoteDataSource

    @Binds
    @Singleton
    abstract fun providesBlockInfoLocalDataSource(
        blockInfoLocalDataSourceImpl: BlockInfoLocalDataSourceImpl
    ): BlockInfoLocalDataSource
}