package com.example.blockone_onboarding.screens.homeblock

import androidx.lifecycle.ViewModel
import com.example.blockone_onboarding.di.ViewModelBuilderModule
import com.example.blockone_onboarding.domain.ViewModelKey
import com.example.blockone_onboarding.screens.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class HomeBlockModule {

    @ContributesAndroidInjector(modules = [ViewModelBuilderModule::class])
    internal abstract fun blockListFragment(): HomeBlockFragment

    @ContributesAndroidInjector(modules = [ViewModelBuilderModule::class])
    internal abstract fun mainActivity(): MainActivity

    @Binds
    @IntoMap
    @ViewModelKey(HomeBlockViewModel::class)
    abstract fun bindViewModel(viewModel: HomeBlockViewModel): ViewModel
}