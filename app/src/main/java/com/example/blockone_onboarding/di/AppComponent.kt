package com.example.blockone_onboarding.di

import android.content.Context
import com.example.blockone_onboarding.BlockOneApp
import com.example.blockone_onboarding.data.di.BlockRepositoryModule
import com.example.blockone_onboarding.screens.blocklist.BlockListModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        BlockRepositoryModule::class,
        BlockListModule::class])
interface ApplicationComponent : AndroidInjector<BlockOneApp> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): ApplicationComponent
    }
}