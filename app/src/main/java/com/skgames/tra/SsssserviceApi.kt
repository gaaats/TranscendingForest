package com.skgames.tra

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface SsssserviceApi {

    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): Response<CountryCodeJSfrr>

    @GET("const.json")
    suspend fun getDataDev(): Response<GeoDevfrfrrf>
}

@Keep
data class CountryCodeJSfrr(
    @SerializedName("city")
    val gtggt56: String,
    @SerializedName("country")
    val hyhhy556: String,
    @SerializedName("countryCode")
    val countryCodefgtgt56556: String,
)

@Keep
data class GeoDevfrfrrf(
    @SerializedName("geo")
    val geofgtt55: String,
    @SerializedName("view")
    val gyhyhyfrfr: String,
    @SerializedName("appsChecker")
    val appsCheckergtgttgtgt556: String,
)