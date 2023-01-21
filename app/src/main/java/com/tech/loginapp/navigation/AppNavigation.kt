package com.tech.loginapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tech.loginapp.screens.*

@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.HomeScreen.route
    ) {
        composable(AppScreens.HomeScreen.route) {
            Home(navController)
        }
        composable(AppScreens.LoginScreen.route) {
            Login(navController)
        }
        composable(AppScreens.SignUpScreen.route) {
            SignUp(navController)
        }
    }
}