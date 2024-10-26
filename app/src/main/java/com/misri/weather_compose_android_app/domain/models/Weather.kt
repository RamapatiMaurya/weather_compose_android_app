package com.misri.weather_compose_android_app.domain.models

data class Weather(
    val temperature: Double,
    val pressure: Int,
    val humidity: Int,
    val description: String,
    val icon: String
)
