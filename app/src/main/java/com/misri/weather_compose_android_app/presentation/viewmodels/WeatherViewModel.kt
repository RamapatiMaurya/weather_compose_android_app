package com.misri.weather_compose_android_app.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.misri.weather_compose_android_app.data.repositories.WeatherRepository
import com.misri.weather_compose_android_app.domain.models.Weather
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(private val weatherRepository: WeatherRepository) : ViewModel() {

    private val _weatherState = MutableStateFlow<Weather?>(null)
    val weatherState: StateFlow<Weather?> get() = _weatherState

    fun fetchWeather(city: String) {
        viewModelScope.launch {
            val response = weatherRepository.getWeather(city)
            _weatherState.value = Weather(response.main.temp, response.main.pressure, response.main.humidity, response.weather[0].description, response.weather[0].icon)
        }
    }
}
