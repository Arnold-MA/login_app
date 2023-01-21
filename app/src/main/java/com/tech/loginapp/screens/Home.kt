package com.tech.loginapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.tech.loginapp.components.BorderButton
import com.tech.loginapp.components.GradientButton
import com.tech.loginapp.navigation.AppScreens

@Composable
fun Home(navController: NavHostController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier.height(60.dp)
        ) {
            GradientButton(
                text = "LOGIN",
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) { navController.navigate(AppScreens.LoginScreen.route) }
        }
        Box(
            modifier = Modifier.height(60.dp)
        ) {
            BorderButton(
                text = "SIGNUP",
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) { navController.navigate(AppScreens.SignUpScreen.route) }
        }
    }

}