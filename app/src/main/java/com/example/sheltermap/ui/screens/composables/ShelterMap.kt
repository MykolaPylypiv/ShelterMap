package com.example.sheltermap.ui.screens.composables

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.example.sheltermap.R
import com.example.sheltermap.core.state
import com.example.sheltermap.data.sh
import com.example.sheltermap.ui.screens.map.MapViewModel
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.MarkerOptions
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapEffect
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapsComposeExperimentalApi
import com.google.maps.android.compose.Polyline
import com.google.maps.android.compose.rememberCameraPositionState
import kotlinx.coroutines.launch


@OptIn(MapsComposeExperimentalApi::class)
@Composable
fun ShelterMap(viewModel: MapViewModel) {
    val bounds = LatLngBounds(LatLng(44.149105, 22.139876), LatLng(52.301089, 40.114203))

    val mapProperties = MapProperties(
        isMyLocationEnabled = state.value != null,
        mapStyleOptions = MapStyleOptions.loadRawResourceStyle(
            LocalContext.current, R.raw.map_style
        ),
        latLngBoundsForCameraTarget = bounds
    )

    val cameraPositionState = rememberCameraPositionState()

    GoogleMap(
        properties = mapProperties, cameraPositionState = cameraPositionState
    ) {
        val scope = rememberCoroutineScope()

        MapEffect { map ->
            map.setOnMapLoadedCallback {
                scope.launch {
                    cameraPositionState.animate(
                        update = CameraUpdateFactory.newLatLngZoom(
                            LatLng(state.value!!.latitude, state.value!!.longitude), 14f
                        ),
                    )

                    sh.map { shelter ->

                        map.addMarker(
                            MarkerOptions().flat(false).position(shelter.latLng)
                        )
                    }
                }
            }

            map.uiSettings.apply {
                isMyLocationButtonEnabled = false
                isCompassEnabled = false
            }

            viewModel.map = map
        }

        UkraineBorder(viewModel = viewModel)
    }
}

@Composable
fun UkraineBorder(viewModel: MapViewModel) {
    Region(viewModel.kherson)
    Region(viewModel.volyn)
    Region(viewModel.rivne)
    Region(viewModel.zhytomyr)
    Region(viewModel.kyiv)
    Region(viewModel.chernihiv)
    Region(viewModel.sumy)
    Region(viewModel.kharkiv)
    Region(viewModel.luhansk)
    Region(viewModel.donetsk)
    Region(viewModel.zaporizhia)
    Region(viewModel.lviv)
    Region(viewModel.ivanoFrankivsk)
    Region(viewModel.zakarpattia)
    Region(viewModel.ternopil)
    Region(viewModel.chernivtsi)
    Region(viewModel.odessa)
    Region(viewModel.vinnytsia)
    Region(viewModel.khmelnytskyi)
    Region(viewModel.cherkasy)
    Region(viewModel.poltava)
    Region(viewModel.dnipropetrovsk)
    Region(viewModel.kirovohrad)
    Region(viewModel.crimea)
    Region(viewModel.kyivTown)
    Region(viewModel.sevastopolTown)
}

@Composable
fun Region(points: List<LatLng>) {
    val color = Color.Gray
    val width = 5F
    Polyline(points = points, color = color, width = width)
}

