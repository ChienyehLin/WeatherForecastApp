package com.example.weatherforecast.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weatherforecast.screens.WeatherMainScreen
import com.example.weatherforecast.screens.WeatherSplashScreen
import com.example.weatherforecast.screens.main.MainViewModel

@Composable
fun WeatherNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = WeatherScreens.SplashScreen.name) {
            composable(WeatherScreens.SplashScreen.name) {
                WeatherSplashScreen(navController = navController)
            }

        composable(WeatherScreens.MainScreen.name) {
            val mainViewModel = hiltViewModel<MainViewModel>()
            WeatherMainScreen(navController = navController, mainViewModel)
        }
        //新的页面只需要往下面加composable就好
       /* composable(WeatherScreens.SplashScreen.name) {
            WeatherSplashScreen(navController = navController)
        }*/
    }
}