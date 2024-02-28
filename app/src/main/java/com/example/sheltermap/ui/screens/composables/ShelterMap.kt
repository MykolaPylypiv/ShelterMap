package com.example.sheltermap.ui.screens.composables

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.sheltermap.R
import com.example.sheltermap.data.sh
import com.example.sheltermap.ui.screens.map.MapViewModel
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.MarkerOptions
import com.google.maps.android.clustering.ClusterManager
import com.google.maps.android.clustering.view.DefaultClusterRenderer
import com.google.maps.android.collections.MarkerManager
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapEffect
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapsComposeExperimentalApi
import com.google.maps.android.compose.MarkerInfoWindow
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.Polyline
import com.google.maps.android.compose.rememberCameraPositionState
import kotlinx.coroutines.launch

@SuppressLint("PotentialBehaviorOverride")
@OptIn(MapsComposeExperimentalApi::class)
@Composable
fun ShelterMap(
    viewModel: MapViewModel, state: MutableState<Location?>
) {
    val bounds = LatLngBounds(LatLng(44.149105, 22.139876), LatLng(52.301089, 40.114203))

    val mapProperties = MapProperties(
        isMyLocationEnabled = state.value != null,
        mapStyleOptions = MapStyleOptions.loadRawResourceStyle(
            LocalContext.current, R.raw.map_style
        ),
        latLngBoundsForCameraTarget = bounds
    )

    val cameraPositionState = rememberCameraPositionState()

    val context = LocalContext.current

    GoogleMap(
        properties = mapProperties, cameraPositionState = cameraPositionState,
    ) {
        val scope = rememberCoroutineScope()

        MapEffect { map ->

            val clusterManager = ClusterManager<MapMarker>(context, map)

            val mapRenderer = ShelterClusterRendered(context, map, clusterManager)

            clusterManager.renderer = mapRenderer

            map.setOnCameraIdleListener(clusterManager)
            map.setOnMarkerClickListener(clusterManager)

            map.setOnMapLoadedCallback {
                scope.launch {
                    cameraPositionState.animate(
                        update = CameraUpdateFactory.newLatLngZoom(
                            LatLng(state.value!!.latitude, state.value!!.longitude), 14f
                        ),
                    )

                    clusterManager.clearItems()

                    sh.map { shelter ->
                        val marker = MapMarker(shelter.latLng)

                        clusterManager.addItem(marker)
                    }

                    clusterManager.cluster()
                }
            }

            map.uiSettings.apply {
                isCompassEnabled = false
                isZoomControlsEnabled = false
                isMyLocationButtonEnabled = false
            }

            map.setOnMarkerClickListener { marker ->
                scope.launch {
                    cameraPositionState.animate(
                        update = CameraUpdateFactory.newLatLngZoom(
                            marker.position, 18f
                        ),
                    )
                }
                false
            }

            viewModel.map = map
        }



        UkraineBorder(viewModel = viewModel)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 70.dp, end = 8.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Bottom
    ) {
        val scope = rememberCoroutineScope()

        IconButton(
            onClick = {
                scope.launch {
                    cameraPositionState.animate(
                        update = CameraUpdateFactory.newLatLngZoom(
                            LatLng(state.value!!.latitude, state.value!!.longitude), 14f
                        ),
                    )
                }
            },
            modifier = Modifier
                .border(1.dp, Color(0xffE37938), CircleShape)
                .background(Color(0xFF202c38).copy(0.9F))
        ) {
            Image(
                painter = painterResource(id = R.mipmap.location),
                contentDescription = "Location",
            )
        }
    }
}

class ShelterClusterRendered(
    context: Context,
    map: GoogleMap,
    clusterManager: ClusterManager<MapMarker>
) : DefaultClusterRenderer<MapMarker>(context, map, clusterManager) {

    override fun getColor(clusterSize: Int): Int {
        return Color.Black.toArgb()
    }

    override fun onBeforeClusterItemRendered(item: MapMarker, markerOptions: MarkerOptions) {
        val markerDescriptor = BitmapDescriptorFactory.fromResource(R.mipmap.shelter_marker_icon);
        markerOptions.icon(markerDescriptor)
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

