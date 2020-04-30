package com.example.blockone_onboarding.data.datasource

import com.example.blockone_onboarding.data.mapper.BlockInfoLocalMapper
import com.example.blockone_onboarding.data.persistence.dao.BlockInfoDao
import com.example.blockone_onboarding.domain.datasource.BlockInfoLocalDataSource
import com.example.blockone_onboarding.domain.model.BlockInfo
import javax.inject.Inject

class BlockInfoLocalDataSourceImpl @Inject constructor(
    private val dao: BlockInfoDao,
    private val mapper: BlockInfoLocalMapper
) : BlockInfoLocalDataSource {

    override fun getBlockInfo(): BlockInfo {
        return mapper.transform(dao.getBlockInfo())
    }

    override fun saveBlockInfo(blockInfo: BlockInfo) {
        dao.insert(mapper.transformToEntity(blockInfo))
    }
}