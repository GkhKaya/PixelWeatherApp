package com.appcade.pixelweatherapp.data.remote

import com.squareup.moshi.Json

data class WeatherDataDto (
    // Time information for each data point
    val time: List<String>,
    // List of temperature values in Celsius for each data point
    @field:Json(name = "temperature_2m")
    val temperatures: List<Double>,
    // List of weather code values for each data point
    @field:Json(name = "weathercode")
    val weatherCodes: List<Int>,
    // List of mean sea level pressure values in hPa for each data point
    @field:Json(name = "pressure_msl")
    val pressures: List<Double>,
    // List of 10 meter wind speed values in m/s for each data point
    @field:Json(name = "windspeed_10m")
    val windSpeeds: List<Double>,
    // List of 2 meter relative humidity values in percentage for each data point
    @field:Json(name = "relativehumidity_2m")
    val humidities: List<Double>
)