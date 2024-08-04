package com.miraacclle.weatherappjetpackcomposekotlin.repositories

import com.miraacclle.weatherappjetpackcomposekotlin.models.BaseModel
import com.miraacclle.weatherappjetpackcomposekotlin.models.DailyForecasts
import com.miraacclle.weatherappjetpackcomposekotlin.models.HourlyForecast
import com.miraacclle.weatherappjetpackcomposekotlin.models.Location
import retrofit2.http.Query

interface WeatherRepo {
    suspend fun searchLocation(query: String): BaseModel<List<Location>>
    suspend fun getDailyForecasts(locationKey: String): BaseModel<DailyForecasts>
    suspend fun getHourlyForecasts(locationKey: String): BaseModel<List<HourlyForecast>>
}