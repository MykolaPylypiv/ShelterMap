@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.sheltermap.ui.screens.map

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MapScreen(viewModel: MapViewModel) {
    Scaffold(containerColor = MaterialTheme.colorScheme.primary,
        topBar = { },
        content = { MapBody(viewModel = viewModel) })
}

@Composable
fun MapBody(viewModel: MapViewModel) {
    Box(modifier = Modifier.fillMaxSize()) {}
}

