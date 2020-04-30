package com.example.blockone_onboarding.data.di

import com.example.blockone_onboarding.data.mapper.BaseMapper
import com.example.blockone_onboarding.data.mapper.BaseRemoteMapper
import com.example.blockone_onboarding.data.mapper.BlockInfoLocalMapper
import com.example.blockone_onboarding.data.mapper.BlockInfoRemoteMapper
import com.example.blockone_onboarding.data.model.local.BlockInfoLocal
import com.example.blockone_onboarding.data.model.remote.BlockInfoRemote
import com.example.blockone_onboarding.domain.model.BlockInfo
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
internal abstract class MappersModule {

    @Binds
    @Singleton
    abstract fun provideBlockInfoRemoteMapper(
        blockInfoRemoteMapper: BlockInfoRemoteMapper
    ): BaseRemoteMapper<BlockInfoRemote, BlockInfo>

    @Binds
    @Singleton
    abstract fun providesBlockInfoLocalMapper(
        blockInfoLocalMapper: BlockInfoLocalMapper
    ): BaseMapper<BlockInfoLocal, BlockInfo>
}
