package com.example.blockone_onboarding.domain.datasource

import com.example.blockone_onboarding.domain.model.BlockInfo
import io.reactivex.Single

interface BlockInfoRemoteDataSource {

    fun getBlockInfo(): Single<BlockInfo>
}