package com.example.blockone_onboarding.di

import com.example.blockone_onboarding.screens.blocklist.BlockListFragment
import com.example.blockone_onboarding.screens.blocklist.BlockListModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [
    // Include here dependencies
])
abstract class ScreenInjectorsModule {

    @ContributesAndroidInjector(modules = [
        BlockListModule.InjectBlockListViewModel::class])
    abstract fun bindBlockListFragment(): BlockListFragment
}