package com.miraacclle.weatherappjetpackcomposekotlin.models
import com.google.gson.annotations.SerializedName


data class DailyForecast(
    @SerializedName("Date")
    val date: String,
    @SerializedName("EpochDate")
    val epochDate: Long,
    @SerializedName("Temperature")
    val temperature: Temperature,
    @SerializedName("Day")
    val day: WeatherState,
    @SerializedName("Night")
    val night: WeatherState,
//    @SerializedName("Link")
//    val link: String?,
//    @SerializedName("MobileLink")
//    val mobileLink: String?,

//    @SerializedName("Sources")
//    val sources: List<String?>?,

)
data class WeatherState(
    @SerializedName("HasPrecipitation")
    val hasPrecipitation: Boolean,
    @SerializedName("Icon")
    val icon: Int,
    @SerializedName("IconPhrase")
    val iconPhrase: String
)

data class Temperature(
    @SerializedName("Maximum")
    val maximum: Value,
    @SerializedName("Minimum")
    val minimum: Value
)

//
