package com.skgames.tra

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class DataClassMain : Application() {
    companion object {
        const val oneSfrgtftrgt = "54e4b59a-1979-43ff-bad9-6a46f7a851a8"
        var appsCheckfrr6 = "appsChecker"
        var linkfrrrfrffr = "link"
        var MAIN_IDffrrfrrf: String? = "mainid"
        var DEEPLfrfrfrfr: String? = "d11"
        var countryCodefrrfrfrfrrf: String? = "countryCode"
        var geomeogtgt = "geo"
        var C1gttggtgt: String? = "c11"

    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        OneSignal.initWithContext(this)
        OneSignal.setAppId(oneSfrgtftrgt)
        Hawk.init(this).build()
    }
}
