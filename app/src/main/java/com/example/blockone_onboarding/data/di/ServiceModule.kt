package com.example.blockone_onboarding.data.di

import com.example.blockone_onboarding.data.service.BlockApi
import com.example.blockone_onboarding.data.service.ServiceFactory
import dagger.Module
import dagger.Provides

@Module
internal class ServiceModule {

    @Provides
    fun providesGistApi(): BlockApi {
        return ServiceFactory.getService(BlockApi::class.java)
    }
}