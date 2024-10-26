package com.misri.weather_compose_android_app.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.misri.weather_compose_android_app.domain.models.Weather

@Composable
fun WeatherCard(weather: Weather) {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = 4.dp as CardElevation
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Temperature: ${weather.temperature}°C")
            Text("Pressure: ${weather.pressure} hPa")
            Text("Humidity: ${weather.humidity}%")
            Text("Description: ${weather.description}")
            // Optionally, add the weather icon
        }
    }
}
