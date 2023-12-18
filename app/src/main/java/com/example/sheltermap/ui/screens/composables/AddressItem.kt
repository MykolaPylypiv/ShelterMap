package com.example.sheltermap.ui.screens.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AddressItem(clickable: () -> Unit, address: String) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .clickable(enabled = true, onClick = clickable)
        .drawBehind {

            val strokeWidth = density
            val y = size.height - strokeWidth / 2

            drawLine(
                Color.Gray, Offset(0f, y), Offset(size.width, y), strokeWidth
            )
        }) {

        Text(
            text = "м.Львів вул.$address",
            color = Color.LightGray,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .height(36.dp)
        )
    }
}