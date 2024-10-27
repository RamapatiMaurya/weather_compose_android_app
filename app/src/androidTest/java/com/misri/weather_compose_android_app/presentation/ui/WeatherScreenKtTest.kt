//package com.misri.weather_compose_android_app.presentation.ui
//
//import androidx.compose.ui.test.*
//import androidx.compose.ui.test.junit4.createComposeRule
//import com.misri.weather_compose_android_app.domain.models.Weather
//import com.misri.weather_compose_android_app.presentation.viewmodels.WeatherViewModel
//import dagger.hilt.android.testing.HiltAndroidRule
//import dagger.hilt.android.testing.HiltAndroidTest
//import org.junit.Before
//import org.junit.Rule
//import org.junit.Test
//
//@HiltAndroidTest
//class WeatherScreenTest {
//
//    @get:Rule
//    val hiltRule = HiltAndroidRule(this)
//
//    @get:Rule
//    val composeTestRule = createComposeRule()
//
//    private lateinit var viewModel: WeatherViewModel
//
//    @Before
//    fun setUp() {
//        viewModel = mock()
//        composeTestRule.setContent {
//            WeatherScreen(viewModel)
//        }
//    }
//
//    @Test
//    fun testWeatherScreenShowsWeatherData() {
//        val weather = Weather(25.0, 1010, 50, "Clear sky", "01d")
//        whenever(viewModel.weatherState.value).thenReturn(weather)
//
//        composeTestRule.onNodeWithText("Weather Info").assertIsDisplayed()
//        composeTestRule.onNodeWithText("Temperature: 25.0°C").assertIsDisplayed()
//        composeTestRule.onNodeWithText("Pressure: 1010 hPa").assertIsDisplayed()
//        composeTestRule.onNodeWithText("Humidity: 50%").assertIsDisplayed()
//        composeTestRule.onNodeWithText("Description: Clear sky").assertIsDisplayed()
//    }
//
//    @Test
//    fun testWeatherButtonClicks() {
//        composeTestRule.onNodeWithText("Get Weather").performClick()
//
//        // Verify that the fetchWeather method was called
//        // Assuming you have a way to verify it with the mock ViewModel
//    }
//}
