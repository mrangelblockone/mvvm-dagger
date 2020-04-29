package com.example.blockone_onboarding.screens

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.blockone_onboarding.R
import com.example.blockone_onboarding.screens.blocklist.BlockListFragment
import dagger.android.DispatchingAndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListeners()
    }

    private fun initListeners() {
        main_screen_fetch_btn.setOnClickListener {
            block_list_container.visibility = View.VISIBLE
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.block_list_container, BlockListFragment())
                .commit()
        }
    }
}
