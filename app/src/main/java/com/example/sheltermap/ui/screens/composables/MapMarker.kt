package com.example.sheltermap.ui.screens.composables

import android.graphics.Bitmap
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.clustering.ClusterItem

data  class  MapMarker (
    val location: LatLng,
) : ClusterItem {

    override  fun  getPosition () : LatLng = location

    override  fun  getTitle () : String? = null

    override  fun  getSnippet () : String? = null
}