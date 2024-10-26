package com.misri.weather_compose_android_app.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.misri.weather_compose_android_app.presentation.viewmodels.WeatherViewModel

@Composable
fun WeatherScreen(viewModel: WeatherViewModel) {
    val weatherState by viewModel.weatherState.collectAsState()

    Column {
        Text("Weather Info")
        Button(onClick = { viewModel.fetchWeather("London") }) {
            Text("Get Weather")
        }
        weatherState?.let {
            WeatherCard(weather = it)
        }
    }
}
