package com.misri.weather_compose_android_app.data.repositories

import com.misri.weather_compose_android_app.data.models.WeatherResponse
import com.misri.weather_compose_android_app.data.sources.WeatherRemoteDataSource
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val remoteDataSource: WeatherRemoteDataSource) {

    suspend fun getWeather(city: String): WeatherResponse {
        return remoteDataSource.getWeather(city)
    }
}
