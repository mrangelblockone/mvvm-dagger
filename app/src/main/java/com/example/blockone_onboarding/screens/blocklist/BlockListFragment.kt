package com.example.blockone_onboarding.screens.blocklist

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.AndroidSupportInjection
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class BlockListFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<BlocksViewModel> { viewModelFactory }

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
        viewModel.getBlockInfo()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                    Toast.makeText(context, it.headBlockId, Toast.LENGTH_LONG).show()
                }, {
                    Toast.makeText(context, it.message, Toast.LENGTH_LONG).show()
                }
            )
    }
}