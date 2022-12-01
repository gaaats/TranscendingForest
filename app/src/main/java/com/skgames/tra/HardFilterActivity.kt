package com.skgames.tra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skgames.tra.DataClassMain.Companion.DEEPLfrfrfrfr
import com.skgames.tra.DataClassMain.Companion.appsCheckfrr6
import com.skgames.tra.DataClassMain.Companion.countryCodefrrfrfrfrrf
import com.skgames.tra.DataClassMain.Companion.geomeogtgt
import com.skgames.tra.databinding.ActivityHardFilterBinding
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.orhanobut.hawk.Hawk
import com.skgames.tra.DataClassMain.Companion.C1gttggtgt


class HardFilterActivity : AppCompatActivity() {
    lateinit var bbbbbbb: ActivityHardFilterBinding

    private fun lllllll() {
        val gtggtgtggggg5 = Intent(this@HardFilterActivity, GameStartActivity::class.java)
        Hawk.put(geomeogtgt, null)
        Hawk.put(countryCodefrrfrfrfrrf, null)
        Hawk.put(appsCheckfrr6, null)
        startActivity(gtggtgtggggg5)
        finish()
    }

    private fun intWEdrfrrfiiii() {
        val bhnhnhhnnnbnb = Intent(this@HardFilterActivity, BrovvserActivity::class.java)
        Hawk.put(geomeogtgt, null)
        Hawk.put(countryCodefrrfrfrfrrf, null)
        Hawk.put(appsCheckfrr6, null)
        startActivity(bhnhnhhnnnbnb)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bbbbbbb = ActivityHardFilterBinding.inflate(layoutInflater)
        setContentView(bbbbbbb.root)

        val vbvbvvbv: String? = Hawk.get(appsCheckfrr6, "null")

        if (vbvbvvbv == "1") {
            AppsFlyerLib.getInstance()
                .init("SjFheGxVHFjjyhDyjsTQZe", ggggg, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        vbvvbbv()

    }

    private val ggggg = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(C1gttggtgt, dataGotten)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }


    private fun vbvvbbv() {

        val mjmkkmkkm: String = Hawk.get(geomeogtgt)
        val cvcvcv: String = Hawk.get(countryCodefrrfrfrfrrf, "null")
        val vffvfgggg: String? = Hawk.get(appsCheckfrr6, "null")
        var cxvccx: String? = Hawk.get(C1gttggtgt)
        val fdfdfdfd: String? = Hawk.get(DEEPLfrfrfrfr, "null")


        if (vffvfgggg == "1") {


            val gfgfgfgf = Executors.newSingleThreadScheduledExecutor()
            gfgfgfgf.scheduleAtFixedRate({
                if (cxvccx != null) {

                    if (cxvccx!!.contains("tdb2") || mjmkkmkkm.contains(cvcvcv) || fdfdfdfd!!.contains("tdb2")) {
                        gfgfgfgf.shutdown()
                        intWEdrfrrfiiii()
                    } else {
                        gfgfgfgf.shutdown()
                        lllllll()

                    }
                } else {
                    cxvccx = Hawk.get(C1gttggtgt)

                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (mjmkkmkkm.contains(cvcvcv)) {

            intWEdrfrrfiiii()
        } else {

            lllllll()
        }

    }


}