package com.miraacclle.weatherappjetpackcomposekotlin.models
import com.google.gson.annotations.SerializedName



data class HourlyForecast(
    @SerializedName("DateTime")
    val dateTime: String,
    @SerializedName("EpochDateTime")
    val epochDateTime: Int,
    @SerializedName("WeatherIcon")
    val weatherIcon: Int,
    @SerializedName("IconPhrase")
    val iconPhrase: String,
    @SerializedName("IsDaylight")
    val isDaylight: Boolean,
    @SerializedName("HasPrecipitation")
    val hasPrecipitation: Boolean,
    @SerializedName("Temperature")
    val temperature: Temperature
)