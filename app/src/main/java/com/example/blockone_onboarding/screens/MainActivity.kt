package com.example.blockone_onboarding.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.blockone_onboarding.R
import com.example.blockone_onboarding.screens.blocklist.BlockListFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
