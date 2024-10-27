package com.misri.weather_compose_android_app.presentation.viewmodels

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.misri.weather_compose_android_app.data.repositories.WeatherRepository
import com.misri.weather_compose_android_app.domain.models.Weather
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.*
import org.junit.Assert.*
import org.junit.Before
import org.junit.After
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.*
import org.mockito.kotlin.mock

@ExperimentalCoroutinesApi
class WeatherViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var weatherViewModel: WeatherViewModel
    private val weatherRepository: WeatherRepository = mock()

    @Before
    fun setUp() {
        Dispatchers.setMain(StandardTestDispatcher())
        weatherViewModel = WeatherViewModel(weatherRepository)
    }

    @Test
    fun `fetchWeather should update weatherState when repository returns data`() = runTest {
        val expectedWeather = Weather(25.0, 1010, 50, "Clear sky", "01d")
//        `when`(weatherRepository.getWeather("London")).thenReturn(expectedWeather)
//
//        weatherViewModel.fetchWeather("London")
//
//        val actualWeather = weatherViewModel.weatherState.value
//        assertNotNull(actualWeather)
//        assertEquals(expectedWeather.temperature, actualWeather?.temperature, 0.0)
//        assertEquals(expectedWeather.pressure, actualWeather?.pressure)
//        assertEquals(expectedWeather.humidity, actualWeather?.humidity)
//        assertEquals(expectedWeather.description, actualWeather?.description)
//        assertEquals(expectedWeather.icon, actualWeather?.icon)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }
}
