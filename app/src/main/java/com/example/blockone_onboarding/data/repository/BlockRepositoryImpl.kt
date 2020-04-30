package com.example.blockone_onboarding.data.repository

import com.example.blockone_onboarding.domain.EMPTY_STRING
import com.example.blockone_onboarding.domain.datasource.BlockInfoLocalDataSource
import com.example.blockone_onboarding.domain.datasource.BlockInfoRemoteDataSource
import com.example.blockone_onboarding.domain.model.Block
import com.example.blockone_onboarding.domain.model.BlockInfo
import com.example.blockone_onboarding.domain.repository.BlockRepository
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class BlockRepositoryImpl @Inject constructor(
    private val dataSource: BlockInfoRemoteDataSource,
    private val localDataSource: BlockInfoLocalDataSource
) : BlockRepository {

    override fun getBlockInfo(): Single<BlockInfo> {
        return dataSource.getBlockInfo()
            .flatMap { blockInfo ->
                localDataSource.saveBlockInfo(blockInfo)
                Single.just(blockInfo)
            }
    }

    override fun getBlock(): Single<Block> {
        return Single.just(Block(EMPTY_STRING))
    }

    override fun getSavedBlockInfo(): Single<BlockInfo> {
        return Single.fromCallable {
            localDataSource.getBlockInfo()
        }
    }
}