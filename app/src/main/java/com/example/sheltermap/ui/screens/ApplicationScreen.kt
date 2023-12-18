package com.example.sheltermap.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sheltermap.navigation.NavigationTree
import com.example.sheltermap.ui.screens.map.MapScreen
import com.example.sheltermap.ui.screens.map.MapViewModel

@Composable
fun ApplicationScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationTree.Map.name) {
        composable(NavigationTree.Map.name) {
            val mainViewModel = MapViewModel()
            MapScreen(viewModel = mainViewModel)
        }

    }
}