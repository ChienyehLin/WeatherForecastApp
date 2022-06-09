package com.example.weatherforecast.model

data class Response(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<DayWeatherInfo>,
    val message: Double
)