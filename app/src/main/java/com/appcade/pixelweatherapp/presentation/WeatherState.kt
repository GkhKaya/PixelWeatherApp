package com.appcade.pixelweatherapp.presentation

import com.appcade.pixelweatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo : WeatherInfo? = null,
    val isLoading:Boolean = false,
    val error: String? = null
)
