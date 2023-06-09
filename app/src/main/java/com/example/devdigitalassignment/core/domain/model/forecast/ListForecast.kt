package com.kathayat.testWeather.core.domain.model.forecast

import com.kathayat.testWeather.core.domain.model.*


data class ListForecast(

    val date: Long?,
    val main: MainWeather?,
    val weather: List<WeatherItem>?,
    val clouds: Clouds?,
    val wind: Wind?,
    val visibility: Int?,
    val pop: Double?,
    val rain: Rain?,
    val sys: Sys?,
    val dateText: String?,
)
