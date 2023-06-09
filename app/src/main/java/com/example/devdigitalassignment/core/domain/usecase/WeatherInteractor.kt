package com.kathayat.testWeather.core.domain.usecase

import com.kathayat.testWeather.core.domain.repository.IWeatherRepository
import javax.inject.Inject

class WeatherInteractor @Inject constructor(private val weatherRepository: IWeatherRepository): WeatherUseCase {

    override fun getForecast(lat: Double, lon: Double) = weatherRepository.getForecast(lat, lon)

    override fun getCurrentForecast(lat: Double, lon: Double) = weatherRepository.getCurrentForecast(lat, lon)

}