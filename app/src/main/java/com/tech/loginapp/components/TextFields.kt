package com.tech.loginapp.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation

@Composable
fun MyTextField(
    initText: String = ""
) {
    var text by rememberSaveable { mutableStateOf(initText) }
    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent
        )
    )
}

@Composable
fun MyPasswordField(
    initText: String = ""
) {
    var text by rememberSaveable { mutableStateOf(initText) }
    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent
        ),
        visualTransformation = PasswordVisualTransformation()
    )
}