package com.example.blockone_onboarding.data.di

import com.example.blockone_onboarding.data.repository.BlockRepositoryImpl
import com.example.blockone_onboarding.domain.repository.BlockRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [DataSourceModule::class])
abstract class BlockRepositoryModule {

    @Singleton
    @Binds
    abstract fun providesBlockRepository(blockRepository: BlockRepositoryImpl): BlockRepository
}