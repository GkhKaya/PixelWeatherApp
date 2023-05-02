package com.appcade.pixelweatherapp.domain.repository

import com.appcade.pixelweatherapp.domain.util.Resource
import com.appcade.pixelweatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}