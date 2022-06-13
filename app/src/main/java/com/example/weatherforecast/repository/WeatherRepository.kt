package com.example.weatherforecast.repository

import android.util.Log
import com.example.weatherforecast.data.DataOrException
import com.example.weatherforecast.model.WeatherResponse
import com.example.weatherforecast.network.WeatherApi
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val api:WeatherApi){

    suspend fun getWeather(cityQuery:String) : DataOrException<WeatherResponse,Boolean,Exception> {

        val response = try {
            api.getWeather(query = cityQuery)
        } catch (e: Exception) {
            Log.e("Loading", "getWeather: ${e}", )
            return DataOrException(e= e)
        }

        return DataOrException(data = response)
    }

}