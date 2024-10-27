package com.misri.weather_compose_android_app.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.misri.weather_compose_android_app.presentation.viewmodels.WeatherViewModel

@Composable
fun WeatherScreen(viewModel: WeatherViewModel, modifier: Modifier = Modifier) {
    val weatherState by viewModel.weatherState.collectAsState()

    Column {
        Text("Weather Info", modifier = modifier)
        Button(onClick = { viewModel.fetchWeather("London") }
        ) {
            Text("Get Weather", modifier = modifier)
        }
        weatherState?.let {
            WeatherCard(weather = it)
        }
    }
}
