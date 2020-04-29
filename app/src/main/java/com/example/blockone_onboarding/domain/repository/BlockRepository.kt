package com.example.blockone_onboarding.domain.repository

import com.example.blockone_onboarding.domain.model.Block
import com.example.blockone_onboarding.domain.model.BlockInfo
import io.reactivex.Single

interface BlockRepository {

    fun getBlockInfo(): Single<BlockInfo>
    fun getBlock(): Single<Block>
}