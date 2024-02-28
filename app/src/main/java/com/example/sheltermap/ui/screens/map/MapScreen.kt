@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.sheltermap.ui.screens.map

import android.annotation.SuppressLint
import android.location.Location
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.sheltermap.R
import com.example.sheltermap.ui.screens.composables.SearchLayer
import com.example.sheltermap.ui.screens.composables.ShelterMap


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MapScreen(
    viewModel: MapViewModel, state: MutableState<Location?>
) {
    Scaffold(containerColor = MaterialTheme.colorScheme.primary, topBar = { }, content = {
        MapBody(
            viewModel = viewModel, state = state
        )
    })
}

@Composable
fun MapBody(
    viewModel: MapViewModel, state: MutableState<Location?>
) {
    Box(modifier = Modifier.fillMaxSize()) {
        ShelterMap(viewModel = viewModel, state = state)
        SearchLayer(viewModel = viewModel)
    }
}

