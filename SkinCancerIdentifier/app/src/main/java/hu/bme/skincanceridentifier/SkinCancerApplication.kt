package hu.bme.skincanceridentifier

import android.app.Application
import co.zsmb.rainbowcake.config.rainbowCake
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class SkinCancerApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        rainbowCake {
            isDebug = BuildConfig.DEBUG
        }
    }
}