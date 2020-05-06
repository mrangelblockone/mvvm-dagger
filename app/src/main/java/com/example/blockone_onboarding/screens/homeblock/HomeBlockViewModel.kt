package com.example.blockone_onboarding.screens.homeblock

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.blockone_onboarding.domain.API_ERROR_MESSAGE_TAG
import com.example.blockone_onboarding.domain.repository.BlockRepository
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class HomeBlockViewModel @Inject constructor(
    private val repository: BlockRepository
) : ViewModel() {

    @SuppressLint("CheckResult")
    fun getBlockInfo() {
        repository.getBlockInfo()
            .subscribeOn(Schedulers.io())
            .subscribe({ }, {
                it.message?.run { Log.e(API_ERROR_MESSAGE_TAG, this)  }
            })
    }

    fun getHeadBlockNum(): Single<Int> {
        return repository.getSavedBlockInfo()
            .subscribeOn(Schedulers.io())
            .map { it.headBlockNum }
    }
}