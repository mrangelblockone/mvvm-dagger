package com.example.blockone_onboarding.data.service

import com.example.blockone_onboarding.data.model.BlockInfoRemote
import com.example.blockone_onboarding.data.utils.API_PATH_BLOCK
import com.example.blockone_onboarding.data.utils.API_PATH_BLOCK_INFO
import com.example.blockone_onboarding.data.utils.BLOCK_ID
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface BlockApi {

    @GET(API_PATH_BLOCK_INFO)
    fun getBlockInfo(): Single<BlockInfoRemote>

    @GET(API_PATH_BLOCK)
    fun getBlock(@Query(BLOCK_ID) blockId: String)
}