package com.appcade.pixelweatherapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    // Endpoint URL for getting hourly forecast data for a location
    @GET("v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl")
    suspend fun getWeatherData(
        @Query("latitude") lat:Double, // Latitude coordinate of location
        @Query("longitude") long:Double // Longitude coordinate of location
    ):WeatherDto // Hourly forecast data for the specified location
}