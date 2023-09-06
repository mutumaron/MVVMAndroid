package com.example.mvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm.ui.theme.screen.login.loginScreen
import com.example.mvvm.ui.theme.screen.register.registerScreen
import com.example.mvvm.ui.theme.screens.home.HomeScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),startDestination:String= ROUTE_LOGIN) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            loginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            registerScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
    }}

