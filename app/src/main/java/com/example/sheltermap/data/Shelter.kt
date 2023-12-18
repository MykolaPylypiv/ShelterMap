package com.example.sheltermap.data

import com.google.android.gms.maps.model.LatLng

data class Shelter(
    val address: String, val latLng: LatLng
)

val sh = listOf(
    Shelter(
        address = "Айвазовського?. 11", latLng = LatLng(49.813132449776205, 23.998370545605027)
    ),
    Shelter(
        address = "Айвазовського?. 22", latLng = LatLng(49.813131901120244, 23.997797936655385)
    ),
    Shelter(address = "Алмазна 19а", latLng = LatLng(49.85004263379889, 23.98296868938529)),
    Shelter(address = "Алмазна 21б", latLng = LatLng(49.849479177449815, 23.9842268168213))
)