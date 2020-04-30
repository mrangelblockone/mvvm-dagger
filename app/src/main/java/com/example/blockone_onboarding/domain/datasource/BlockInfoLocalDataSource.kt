package com.example.blockone_onboarding.domain.datasource

import com.example.blockone_onboarding.domain.model.BlockInfo

interface BlockInfoLocalDataSource {

    fun getBlockInfo(): BlockInfo
    fun saveBlockInfo(blockInfo: BlockInfo)
}