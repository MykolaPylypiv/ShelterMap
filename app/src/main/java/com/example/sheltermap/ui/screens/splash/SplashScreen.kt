package com.example.sheltermap.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.sheltermap.R
import com.example.sheltermap.core.state
import com.google.android.gms.location.FusedLocationProviderClient

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(
    fusedLocationProviderClient: FusedLocationProviderClient) {
    val infiniteTransition = rememberInfiniteTransition(label = "")

    val infiniteAlpha by infiniteTransition.animateFloat(
        initialValue = 0.6f, targetValue = 1f, animationSpec = infiniteRepeatable(
            animation = tween(3000, easing = LinearEasing), repeatMode = RepeatMode.Reverse
        ), label = ""
    )

    val loading by remember { mutableStateOf(true) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(Color.Black)
    ) {
        Spacer(modifier = Modifier.weight(1F))

        Image(
            painter = painterResource(R.mipmap.sm_icon),
            contentDescription = "Icon",
            modifier = Modifier.alpha(infiniteAlpha)
        )

        Spacer(modifier = Modifier.height(36.dp))

        if (loading) {
            getDeviceLocation(fusedLocationProviderClient)
        }

        Spacer(modifier = Modifier.height(48.dp))

        Spacer(modifier = Modifier.weight(1F))

        Text(
            text = "Перевірте чи на пристрої включене місцезнаходження і є доступ до Wi-Fi",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            textAlign = TextAlign.Center,
            color = Color.LightGray
        )
    }

}

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