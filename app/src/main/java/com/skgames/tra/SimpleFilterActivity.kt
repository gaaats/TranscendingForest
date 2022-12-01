package com.skgames.tra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import com.skgames.tra.DataClassMain.Companion.MAIN_IDffrrfrrf
import com.skgames.tra.DataClassMain.Companion.appsCheckfrr6
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SimpleFilterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_filter)
        checkCountryfrfrfrr()
    }



    private fun ftgthyggt(): String? {
        val restCheckftgtgtgtt: String? = Hawk.get(appsCheckfrr6)
        return restCheckftgtgtgtt
    }

    private fun checkCountryfrfrfrr() {

        val checkfrrrf = ftgthyggt()

        if (checkfrrrf == "0") {
            intALonehyhyyfrrf()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                gfgtgtt()
            }
            intAfbftgttgtgtttgtgt()
        }
    }

    private fun intALonehyhyyfrrf() {
        val ddede = Intent(this@SimpleFilterActivity, GameStartActivity::class.java)
        Hawk.put(DataClassMain.geomeogtgt, null)
        Hawk.put(DataClassMain.countryCodefrrfrfrfrrf, null)
        Hawk.put(DataClassMain.appsCheckfrr6, null)
        startActivity(ddede)
        finish()
    }

    private fun gfgtgtt() {
        val gtgttadInfo = AdvertisingIdClient(applicationContext)
        gtgttadInfo.start()
        val adIdInfofrrrf = gtgttadInfo.info.id
        Hawk.put(MAIN_IDffrrfrrf, adIdInfofrrrf)
    }

    private fun intAfbftgttgtgtttgtgt() {
        val hyhyyhyhy = Intent(this@SimpleFilterActivity, HardFilterActivity::class.java)
        startActivity(hyhyyhyhy)
        finish()
    }

}