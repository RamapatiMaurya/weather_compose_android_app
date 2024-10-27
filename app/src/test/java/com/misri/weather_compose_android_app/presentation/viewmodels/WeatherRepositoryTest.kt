package com.misri.weather_compose_android_app.presentation.viewmodels

import com.misri.weather_compose_android_app.data.models.Main
import com.misri.weather_compose_android_app.data.models.Weather
import com.misri.weather_compose_android_app.data.models.WeatherResponse
import com.misri.weather_compose_android_app.data.repositories.WeatherRepository
import com.misri.weather_compose_android_app.data.sources.WeatherRemoteDataSource
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class WeatherRepositoryTest {

    private val weatherRemoteDataSource: WeatherRemoteDataSource = mock()
    private val weatherRepository = WeatherRepository(weatherRemoteDataSource)

    @Test
    fun `getWeather should return weather data from remote data source`() = runBlocking {
        val expectedResponse = WeatherResponse(
            Main(temp = 25.0, pressure = 1010, humidity = 50),
            listOf(Weather(description = "Clear sky", icon = "01d"))
        )
        whenever(weatherRemoteDataSource.getWeather("London")).thenReturn(expectedResponse)

        val actualWeatherResponse = weatherRepository.getWeather("London")

        assertEquals(expectedResponse.main.temp, actualWeatherResponse.main.temp, 0.0)
        assertEquals(expectedResponse.main.pressure, actualWeatherResponse.main.pressure)
        assertEquals(expectedResponse.main.humidity, actualWeatherResponse.main.humidity)
        assertEquals(expectedResponse.weather[0].description, actualWeatherResponse.weather[0].description)
        assertEquals(expectedResponse.weather[0].icon, actualWeatherResponse.weather[0].icon)
    }
}
