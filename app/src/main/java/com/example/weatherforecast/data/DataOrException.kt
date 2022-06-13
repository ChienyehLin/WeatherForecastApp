package com.example.weatherforecast.data

import com.example.weatherforecast.di.AppModule
import com.example.weatherforecast.model.WeatherResponse
import com.example.weatherforecast.network.WeatherApi

class DataOrException<T, Boolean, E : Exception> (
    var data: T? = null,
    var loading: kotlin.Boolean? = null,
    var e:E? = null){


}