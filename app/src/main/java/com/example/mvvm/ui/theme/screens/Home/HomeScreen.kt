package com.example.mvvm.ui.theme.screens.Home

import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mvvm.R

@Composable
fun HomeScreen(navController: NavController){
        Column(modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Welcome !!",
                color = Color.White,
                fontSize = 45.sp,
                fontFamily = FontFamily.Serif
            )
            Spacer(modifier = Modifier.height(25.dp))

            Image(
                painter = painterResource(id = R.drawable.image1),
                contentDescription = "",
                modifier = Modifier.size(400.dp)
            )

            Spacer(modifier = Modifier.height(25.dp))
            Text(text = "We offer Android and WebDev services",
                color = Color.White,
                fontSize = 45.sp,
                fontFamily = FontFamily.Serif
            )
            Spacer(modifier = Modifier.height(25.dp))
//            Image(
//                painter = painterResource(id = R.drawable.balloon),
//                contentDescription = "",
//                modifier = Modifier.size(800.dp)
//            )
//            Spacer(modifier = Modifier.height(25.dp))
            Text(text = "Join us Today",
                color = Color.White,
                fontSize = 45.sp,
                fontFamily = FontFamily.Serif
            )
        }
}