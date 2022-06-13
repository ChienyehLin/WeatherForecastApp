package com.example.weatherforecast.model

data class WeatherResponse(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<DayWeatherInfo>,
    val message: Double
)