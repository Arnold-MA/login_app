package com.tech.loginapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.tech.loginapp.R
import com.tech.loginapp.components.GradientButton
import com.tech.loginapp.components.MyPasswordField
import com.tech.loginapp.components.MyTextField
import com.tech.loginapp.navigation.AppScreens

@Composable
fun Login(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxHeight(0.5f)
        ) {
            IconButton(
                onClick = {
                    navController.popBackStack()
                }
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "back",
                    modifier = Modifier.size(35.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Box(
                modifier = Modifier.padding(start = 40.dp)
            ) {
                Text(
                    text = "Welcome!",
                    style = TextStyle(
                        color = Color(0xFF02004E),
                        fontSize = 48.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
                    ),
                )
            }
            Box(
                modifier = Modifier.padding(start = 40.dp)
            ) {
                Text(
                    text = "Sign in to continue",
                    style = TextStyle(
                        color = Color(0xFF9290C7),
                        fontSize = 26.sp,
                        //fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
                    ),
                )
            }
            Spacer(modifier = Modifier.height(60.dp))
            Box(
                modifier = Modifier.padding(start = 40.dp)
            ) {
                MyTextField()
            }
            Spacer(modifier = Modifier.height(50.dp))
            Box(
                modifier = Modifier.padding(start = 40.dp)
            ) {
                MyPasswordField()
            }
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
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
            TextButton(
                onClick = {

                },
            ) {
                Text(
                    text = "Forgot Password?",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace,
                        color = Color(0xFF3D477E)
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 40.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(0.47f)
                ) {
                    Divider(
                        color = Color(0xFF3D477E),
                        thickness = 2.dp
                    )
                }
                Box(
                    modifier = Modifier.width(30.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "or",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace,
                            color = Color(0xFF3D477E)
                        )
                    )
                }
                Box(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Divider(
                        color = Color(0xFF3D477E),
                        thickness = 2.dp
                    )
                }
            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Social Media Login",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    color = Color(0xFF7674B8),
                    fontSize = 15.sp
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier.size(40.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_google),
                        contentDescription = "google"
                    )
                }
                Spacer(modifier = Modifier.width(20.dp))
                Box(
                    modifier = Modifier.size(40.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_facebook),
                        contentDescription = "facebook"
                    )
                }
                Spacer(modifier = Modifier.width(20.dp))
                Box(
                    modifier = Modifier.size(40.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_apple),
                        contentDescription = "apple"
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp)
            ) {
                Text(
                    text = "Don't have an account?",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace,
                        color = Color(0xFF7674B8)
                    )
                )

                TextButton(
                    onClick = {
                        navController.navigate(AppScreens.SignUpScreen.route)
                    },
                ) {
                    Text(
                        text = "Sign up",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace,
                            color = Color(0xFF012BFE)
                        )
                    )
                }

            }
        }

    }



}