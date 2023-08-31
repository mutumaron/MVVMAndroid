package com.example.mvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm.ui.theme.screens.Home.HomeScreen
import com.example.mvvm.ui.theme.screens.Login.loginScreen
import com.example.mvvm.ui.theme.screens.Register.registerScreen

@Composable
fun AppNavHost (modifier: Modifier= Modifier, navController: NavHostController = rememberNavController(), startDestination:String= ROUT_LOGIN){

    NavHost(navController = navController, modifier = modifier, startDestination = startDestination) {
     composable(ROUT_HOME){
         HomeScreen(navController)
     }
     composable(ROUT_LOGIN){
         loginScreen(navController)
     }
     composable(ROUT_REGISTER){
         registerScreen(navController)
     }
    }
}