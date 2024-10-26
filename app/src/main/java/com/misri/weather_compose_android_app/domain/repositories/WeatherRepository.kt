package com.misri.weather_compose_android_app.domain.repositories

import com.misri.weather_compose_android_app.domain.models.Weather

interface WeatherRepository {
    suspend fun getWeather(city: String): Weather
}
