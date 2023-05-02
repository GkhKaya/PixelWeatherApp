package com.appcade.pixelweatherapp.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.appcade.pixelweatherapp.data.mappers.toWeatherInfo
import com.appcade.pixelweatherapp.data.remote.WeatherApi
import com.appcade.pixelweatherapp.domain.repository.WeatherRepository
import com.appcade.pixelweatherapp.domain.util.Resource
import com.appcade.pixelweatherapp.domain.weather.WeatherInfo
import java.lang.Exception
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
):WeatherRepository{
    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat  =lat,
                    long = long
                ).toWeatherInfo()
            )
        }catch (e:Exception){
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}