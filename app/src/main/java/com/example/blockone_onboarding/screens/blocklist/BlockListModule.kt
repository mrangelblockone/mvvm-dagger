package com.example.blockone_onboarding.screens.blocklist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.blockone_onboarding.di.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class BlockListModule {

    @Module
    class InjectBlockListViewModel {

        @Provides
        fun provideViewModel(
            target: BlockListFragment,
            factory: ViewModelProvider.Factory
        ) = ViewModelProvider(
            target,
            factory
        ).get(BlocksViewModel::class.java)
    }

    @Module
    class ProvidesBlockListViewModel {

        @Provides
        @IntoMap
        @ViewModelKey(BlocksViewModel::class)
        fun providesViewModel() : ViewModel = BlocksViewModel()
    }
}