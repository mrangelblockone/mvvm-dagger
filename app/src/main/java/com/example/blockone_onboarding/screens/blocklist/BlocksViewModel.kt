package com.example.blockone_onboarding.screens.blocklist

import androidx.lifecycle.ViewModel
import com.example.blockone_onboarding.domain.model.BlockInfo
import com.example.blockone_onboarding.domain.repository.BlockRepository
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class BlocksViewModel @Inject constructor(
    private val repository: BlockRepository
) : ViewModel() {

    fun getBlockInfo(): Single<BlockInfo> {
        return repository.getBlockInfo()
            .subscribeOn(Schedulers.io())
    }

    fun getSavedBlockInfo(): Single<BlockInfo> {
        return repository.getSavedBlockInfo()
            .subscribeOn(Schedulers.io())
    }
}