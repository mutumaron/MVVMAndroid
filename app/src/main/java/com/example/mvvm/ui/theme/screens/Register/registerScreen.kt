package com.example.mvvm.ui.theme.screens.Register

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun registerScreen(navController: NavHostController){
    var register by remember{ mutableStateOf(TextFieldValue("")) }
    var pass by remember{ mutableStateOf(TextFieldValue("")) }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Login here",
            color = Color.DarkGray,
            fontSize = 45.sp,
            fontFamily = FontFamily.Cursive
        )

        OutlinedTextField(value =register, onValueChange = {register=it})
        OutlinedTextField(value = pass, onValueChange = {pass=it})

        Button(onClick = { /*TODO*/},
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = CircleShape

        ) {
            Text(text = "Register Here")


        }
        Button(onClick = { /*TODO*/},
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = CircleShape

        ) {
            Text(text = "You are now registered Redirected to the first page")


        }

    }

}