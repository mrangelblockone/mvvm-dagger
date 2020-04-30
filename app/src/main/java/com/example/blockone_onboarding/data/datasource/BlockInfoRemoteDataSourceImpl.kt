package com.example.blockone_onboarding.data.datasource

import com.example.blockone_onboarding.data.mapper.BaseRemoteMapper
import com.example.blockone_onboarding.data.model.remote.BlockInfoRemote
import com.example.blockone_onboarding.data.service.BlockApi
import com.example.blockone_onboarding.domain.datasource.BlockInfoRemoteDataSource
import com.example.blockone_onboarding.domain.model.BlockInfo
import io.reactivex.Single
import javax.inject.Inject

class BlockInfoRemoteDataSourceImpl @Inject constructor(
    private val blockApi: BlockApi,
    private val mapper: BaseRemoteMapper<BlockInfoRemote, BlockInfo>
) : BlockInfoRemoteDataSource {

    override fun getBlockInfo(): Single<BlockInfo> {
        return blockApi.getBlockInfo()
            .map { input -> mapper.transform(input) }
    }
}