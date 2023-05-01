package com.appcade.pixelweatherapp.data.remote

import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto // Hourly forecast data for the specified location
)
