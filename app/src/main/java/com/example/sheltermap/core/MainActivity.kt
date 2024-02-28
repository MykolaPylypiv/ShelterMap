package com.example.sheltermap.core

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.sheltermap.ui.screens.ApplicationScreen
import com.example.sheltermap.ui.screens.splash.SplashScreen
import com.example.sheltermap.ui.theme.ShelterMapTheme
import com.google.android.gms.location.LocationServices

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<MainViewModel>()

    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        viewModel.fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(this)

        viewModel.requestPermissionLauncher = registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                viewModel.getDeviceLocation(viewModel.fusedLocationProviderClient)
            }
        }

        viewModel.askPermissions(viewModel.fusedLocationProviderClient, this)

        super.onCreate(savedInstanceState)
        setContent {
            ShelterMapTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    if (viewModel.state.value == null) SplashScreen(
                        viewModel.fusedLocationProviderClient, viewModel.state
                    )
                    else ApplicationScreen(viewModel.state)
                }
            }
        }

    }
}