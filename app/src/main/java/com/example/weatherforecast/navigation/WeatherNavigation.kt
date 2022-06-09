package com.example.weatherforecast.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weatherforecast.screens.WeatherMainScreen
import com.example.weatherforecast.screens.WeatherSplashScreen

@Composable
fun WeatherNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = WeatherScreens.SplashScreen.name) {
            composable(WeatherScreens.SplashScreen.name) {
                WeatherSplashScreen(navController = navController)
            }

        composable(WeatherScreens.MainScreen.name) {
            WeatherMainScreen(navController = navController)
        }
        //新的页面只需要往下面加composable就好
       /* composable(WeatherScreens.SplashScreen.name) {
            WeatherSplashScreen(navController = navController)
        }*/
    }
}