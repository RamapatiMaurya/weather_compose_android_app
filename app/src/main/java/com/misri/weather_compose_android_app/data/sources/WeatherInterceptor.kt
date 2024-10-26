package com.misri.weather_compose_android_app.data.sources

import okhttp3.Interceptor
import okhttp3.Response

class WeatherInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        // Log request details or modify request
        return chain.proceed(request)
    }
}
