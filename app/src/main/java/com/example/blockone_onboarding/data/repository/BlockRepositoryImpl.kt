package com.example.blockone_onboarding.data.repository

import com.example.blockone_onboarding.domain.EMPTY_STRING
import com.example.blockone_onboarding.domain.datasource.BlockInfoRemoteDataSource
import com.example.blockone_onboarding.domain.model.Block
import com.example.blockone_onboarding.domain.model.BlockInfo
import com.example.blockone_onboarding.domain.repository.BlockRepository
import io.reactivex.Single
import javax.inject.Inject

class BlockRepositoryImpl @Inject constructor(
    private val dataSource: BlockInfoRemoteDataSource
) : BlockRepository {

    override fun getBlockInfo(): Single<BlockInfo> {
        return dataSource.getBlockInfo()
    }

    override fun getBlock(): Single<Block> {
        return Single.just(Block(EMPTY_STRING))
    }
}