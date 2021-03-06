package com.example.blockone_onboarding.screens.homeblock

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.blockone_onboarding.R
import com.example.blockone_onboarding.domain.DB_ERROR_TAG
import com.example.blockone_onboarding.util.MSG_ERROR_BTN_HOME
import dagger.android.support.AndroidSupportInjection
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class HomeBlockFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<HomeBlockViewModel> { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
        viewModel.getBlockInfo()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.home_block_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getHeadBlockNum()
    }

    @SuppressLint("CheckResult")
    private fun getHeadBlockNum() {
        viewModel.getHeadBlockNum()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                setButtonListener(it)
            }, {
                setButtonListener(null)
                it.message?.run { Log.e(DB_ERROR_TAG, this) }
            })
    }

    private fun setButtonListener(headBlockNum: Int?) {
        headBlockNum?.let {
            view?.findViewById<Button>(R.id.btn_fetch_blocks)?.setOnClickListener(
                Navigation
                    .createNavigateOnClickListener(HomeBlockFragmentDirections.actionFetchBlocks(it.toString()))
            )
            return
        }

        view?.findViewById<Button>(R.id.btn_fetch_blocks)?.setOnClickListener {
            Toast.makeText(context, MSG_ERROR_BTN_HOME, Toast.LENGTH_SHORT).show()
        }
    }
}