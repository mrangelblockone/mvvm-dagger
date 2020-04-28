package com.example.blockone_onboarding.data

import android.app.Application
import io.realm.Realm

// Improve: extract this to a different module
open class DataApp : Application() {

    override fun onCreate() {
        super.onCreate()
        super.onCreate()
        // Improve: Start using Room
        Realm.init(this)
    }
}