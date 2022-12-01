package com.skgames.tra

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import com.skgames.tra.DataClassMain.Companion.C1gttggtgt
import com.skgames.tra.DataClassMain.Companion.DEEPLfrfrfrfr
import com.skgames.tra.DataClassMain.Companion.MAIN_IDffrrfrrf
import com.skgames.tra.DataClassMain.Companion.linkfrrrfrffr
import com.skgames.tra.databinding.ActivityBrovvserBinding
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class BrovvserActivity : AppCompatActivity() {
    private val gggg = 1

    override fun onBackPressed() {
        if (cdccdcd.canGoBack()) {
            if (gttggtgt) {
                cdccdcd.stopLoading()
                cdccdcd.loadUrl(ccdcdcdcdf)
            }
            this.gttggtgt = true
            cdccdcd.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                gttggtgt = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private fun bvbvvb() {
        val vfvfvf = cdccdcd.settings
        vfvfvf.javaScriptEnabled = true

        vfvfvf.useWideViewPort = true

        vfvfvf.loadWithOverviewMode = true
        vfvfvf.allowFileAccess = true
        vfvfvf.domStorageEnabled = true
        vfvfvf.userAgentString = vfvfvf.userAgentString.replace("; wv", "")

        vfvfvf.javaScriptCanOpenWindowsAutomatically = true
        vfvfvf.setSupportMultipleWindows(false)

        vfvfvf.displayZoomControls = false
        vfvfvf.builtInZoomControls = true
        vfvfvf.setSupportZoom(true)

        vfvfvf.pluginState = WebSettings.PluginState.ON
        vfvfvf.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        vfvfvf.setAppCacheEnabled(true)

        vfvfvf.allowContentAccess = true
    }

    var jjkkjk: ValueCallback<Array<Uri>>? = null
    lateinit var cdccdcd: WebView

    var ccdcdcdcdf = ""
    fun saaave(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (ccdcdcdcdf == "") {
                ccdcdcdcdf = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val nnhnhhn =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val kjjkjk = nnhnhhn.edit()
                kjjkjk.putString("SAVED_URL", lurlurlurlurlur)
                kjjkjk.apply()
            }
        }
    }

    lateinit var klpip: ActivityBrovvserBinding
    var kgjfhdkxfjujuuj: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        klpip = ActivityBrovvserBinding.inflate(layoutInflater)
        setContentView(klpip.root)

        cdccdcd = klpip.vviinii
        Snackbar.make(
            klpip.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val nhnhnh = CookieManager.getInstance()
        nhnhnh.setAcceptCookie(true)
        nhnhnh.setAcceptThirdPartyCookies(cdccdcd, true)
        bvbvvb()
        val nhnhnhnhj: Activity = this
        cdccdcd.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (gtgtgtgt(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                saaave(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(nhnhnhnhj, description, Toast.LENGTH_SHORT).show()
            }


        }
        cdccdcd.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                jjkkjk?.onReceiveValue(null)
                jjkkjk = filePathCallback
                var ggtgtgttg: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (ggtgtgttg!!.resolveActivity(packageManager) != null) {

                    var vvvv: File? = null
                    try {
                        vvvv = jujujiii()
                        ggtgtgttg.putExtra("PhotoPath", kgjfhdkxfjujuuj)
                    } catch (ex: IOException) {
                    }

                    if (vvvv != null) {
                        kgjfhdkxfjujuuj = "file:" + vvvv.absolutePath
                        ggtgtgttg.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(vvvv)
                        )
                    } else {
                        ggtgtgttg = null
                    }
                }
                val klklklk = Intent(Intent.ACTION_GET_CONTENT)
                klklklk.addCategory(Intent.CATEGORY_OPENABLE)
                klklklk.type = "image/*"
                val gtgtgtt: Array<Intent?> =
                    ggtgtgttg?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val opopopop = Intent(Intent.ACTION_CHOOSER)
                opopopop.putExtra(Intent.EXTRA_INTENT, klklklk)
                opopopop.putExtra(Intent.EXTRA_TITLE, getString(R.string.take_imag6656))
                opopopop.putExtra(Intent.EXTRA_INITIAL_INTENTS, gtgtgtt)
                startActivityForResult(
                    opopopop, gggg
                )
                return true
            }

            @Throws(IOException::class)
            private fun jujujiii(): File {
                var frfrrfr = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!frfrrfr.exists()) {
                    frfrrfr.mkdirs()
                }

                frfrrfr =
                    File(frfrrfr.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return frfrrfr
            }

        }

        cdccdcd.loadUrl(saaacfff())
    }


    private fun opopopo(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val frrfrfrrf = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $frrfrfrrf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val vvvvv =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $vvvvv"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val kiikik = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $kiikik"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }


    private fun saaacfff(): String {

        val bgbg = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val pppop = "com.skgames.tra"

        val vfvf: String? = Hawk.get(C1gttggtgt, "null")
        val vffvvf: String? = Hawk.get(MAIN_IDffrrfrrf, "null")
        val nhnhnh: String? = Hawk.get(DEEPLfrfrfrfr, "null")

        val bgbbggb = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)


        val bbgbgbg = "deviceID="
        val kjjkjk = "sub_id_1="
        val adidddddd = "ad_id="
        val sub4frfrr = "sub_id_4="
        val bgbggbbg = "sub_id_5="
        val sub6frfr = "sub_id_6="


        val mmnnhnh = "naming"
        val deppfrfrf = "deeporg"


        val jhjhjhj = Build.VERSION.RELEASE

        val ggttgtg = Hawk.get(linkfrrrfrffr, "null")

        var kikikik = ""
        if (vfvf != "null") {
            kikikik =
                "$ggttgtg$kjjkjk$vfvf&$bbgbgbg$bgbbggb&$adidddddd$vffvvf&$sub4frfrr$pppop&$bgbggbbg$jhjhjhj&$sub6frfr$mmnnhnh"
            opopopo(bgbbggb.toString())
        } else {
            kikikik =
                "$ggttgtg$kjjkjk$nhnhnh&$bbgbgbg$bgbbggb&$adidddddd$vffvvf&$sub4frfrr$pppop&$bgbggbbg$jhjhjhj&$sub6frfr$deppfrfrf"
            opopopo(bgbbggb.toString())
        }
        return bgbg.getString("SAVED_URL", kikikik).toString()
    }


    private fun gtgtgtgt(uri: String): Boolean {

        val kiikikik = packageManager
        try {

            kiikikik.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != gggg || jjkkjk == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var fnrnfnrf: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                fnrnfnrf = arrayOf(Uri.parse(kgjfhdkxfjujuuj))
            } else {
                val vfvddsser = data.dataString
                if (vfvddsser != null) {
                    fnrnfnrf = arrayOf(Uri.parse(vfvddsser))
                }
            }
        }
        jjkkjk?.onReceiveValue(fnrnfnrf)
        jjkkjk = null
    }


    private var gttggtgt = false


}