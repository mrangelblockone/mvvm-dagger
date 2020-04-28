package com.example.blockone_onboarding.di

import com.example.blockone_onboarding.BlockOneApp
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        AndroidInjectionModule::class])
interface AppComponent : AndroidInjector<BlockOneApp> {

    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<BlockOneApp>
}