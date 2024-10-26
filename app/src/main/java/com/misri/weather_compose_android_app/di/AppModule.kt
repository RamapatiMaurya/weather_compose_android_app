package com.misri.weather_compose_android_app.di

import com.misri.weather_compose_android_app.data.repositories.WeatherRepository
import com.misri.weather_compose_android_app.data.sources.WeatherRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideWeatherRepository(weatherRemoteDataSource: WeatherRemoteDataSource): WeatherRepository {
        return WeatherRepository(weatherRemoteDataSource)
    }
}
