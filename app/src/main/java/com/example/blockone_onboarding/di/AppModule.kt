package com.example.blockone_onboarding.di

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.blockone_onboarding.BlockOneApp
import dagger.Module
import dagger.Provides
import javax.inject.Provider

@Module(includes = [ScreenInjectorsModule::class])
class AppModule {

    @Provides
    internal fun provideContext(application: BlockOneApp): Context = application

    @Provides
    internal fun provideApplication(application: BlockOneApp): Application = application

    @Provides
    fun provideViewModelFactory(
        providers: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
    ) = object : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return requireNotNull(providers[modelClass as Class<out ViewModel>]).get() as T
        }
    }
}