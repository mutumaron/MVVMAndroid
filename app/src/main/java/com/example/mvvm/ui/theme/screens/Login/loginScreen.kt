package com.example.mvvm.ui.theme.screens.Login


import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mvvm.navigation.ROUT_LOGIN
import com.example.mvvm.navigation.ROUT_REGISTER

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun loginScreen(navController: NavHostController){
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember{ mutableStateOf(TextFieldValue("")) }
    var pass by remember{ mutableStateOf(TextFieldValue("")) }
    Column(modifier = Modifier
        .background(Color.DarkGray)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Login here",
            color = Color.White,
            fontSize = 45.sp,
            fontFamily = FontFamily.Serif
        )
        Spacer(modifier = Modifier.height(25.dp))
        OutlinedTextField(value = name,
            modifier = Modifier
//                .fillMaxWidth()
                .background(Color.DarkGray)
                .padding(16.dp),
            label = { Text(text = "Name",
                color = Color.White,
                fontSize = 30.sp
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange = {name=it})


        Spacer(modifier = Modifier.height(20.dp))


        OutlinedTextField(value = email,
            modifier = Modifier
//                .fillMaxWidth()
                .background(Color.DarkGray)
                .padding(16.dp),
            label = { Text(text = "Email",
                color = Color.White,
                fontSize = 30.sp
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            onValueChange = {email=it})


        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = pass,
            modifier = Modifier
//                .fillMaxWidth()
                .background(Color.DarkGray)
                .padding(16.dp),
            label = { Text(text = "Password",
                color = Color.White,
                fontSize = 30.sp
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = {pass=it})

//        Spacer(modifier = Modifier.height(30.dp))
//        Button(onClick = {
//                         navController.navigate(ROUT_LOGIN)
//        },
//            colors = ButtonDefaults.buttonColors(),
//            shape = CircleShape
//
//        ) {
//            Text(text = "Register",
//                fontSize = 28.sp,
//                fontFamily = FontFamily.Serif
//
//                )
//
//
//        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
                         navController.navigate(ROUT_REGISTER)
        },
            colors = ButtonDefaults.buttonColors(),
            shape = CircleShape

        ) {
            Text(text = "No Account? Register here",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif
                )


        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUT_LOGIN)
        },
            colors = ButtonDefaults.buttonColors(),
            shape = CircleShape

        ) {
            Text(text = "Have Account? Login here",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif
                )


        }

    }

}