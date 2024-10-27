package com.misri.weather_compose_android_app.data.sources

import com.misri.weather_compose_android_app.data.models.WeatherResponse
import com.misri.weather_compose_android_app.data.remote.WeatherService
import javax.inject.Inject

class WeatherRemoteDataSource @Inject constructor(private val weatherService: WeatherService) {

    suspend fun getWeather(city: String): WeatherResponse {
        return weatherService.getWeather(city, "ecb9910ab4f38950d116480c9e91e60e")
    }
}
