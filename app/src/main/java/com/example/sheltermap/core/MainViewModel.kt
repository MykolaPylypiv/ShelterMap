package com.example.sheltermap.core

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import com.google.android.gms.location.FusedLocationProviderClient
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    var requestPermissionLauncher: ActivityResultLauncher<String?>? = null

    lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    val state: MutableState<Location?> = mutableStateOf(null)

    @SuppressLint("MissingPermission")
    fun getDeviceLocation(
        fusedLocationProviderClient: FusedLocationProviderClient
    ) {
        try {
            val locationResult = fusedLocationProviderClient.lastLocation
            locationResult.addOnCompleteListener { task ->
                if (task.isSuccessful) state.value = task.result
                if (task.isComplete) state.value = task.result
            }
        } catch (e: SecurityException) {
            throw IllegalArgumentException("Location not found")
        }
    }

    fun askPermissions(fusedLocationProviderClient: FusedLocationProviderClient, context: Context) = when (PackageManager.PERMISSION_GRANTED) {
        ContextCompat.checkSelfPermission(
            context, Manifest.permission.ACCESS_FINE_LOCATION
        ) -> {
            getDeviceLocation(fusedLocationProviderClient)
        }

        else -> {
            requestPermissionLauncher?.launch(Manifest.permission.ACCESS_FINE_LOCATION)
        }
    }
}