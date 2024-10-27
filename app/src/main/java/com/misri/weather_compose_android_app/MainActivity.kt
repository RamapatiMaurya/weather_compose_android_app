package com.misri.weather_compose_android_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.misri.weather_compose_android_app.presentation.ui.WeatherScreen
import com.misri.weather_compose_android_app.presentation.viewmodels.WeatherViewModel
import com.misri.weather_compose_android_app.ui.theme.WeathercomposeandroidappTheme
import dagger.hilt.android.AndroidEntryPoint
import androidx.hilt.navigation.compose.hiltViewModel


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeathercomposeandroidappTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    val viewModel: WeatherViewModel = hiltViewModel()
                    WeatherScreen(viewModel, modifier = Modifier.padding(innerPadding))
                }
            }
        }
//        setContent {
//            val viewModel: WeatherViewModel = hiltViewModel()
//            WeatherScreen(viewModel)
//        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeathercomposeandroidappTheme {
        Greeting("Android")
    }
}