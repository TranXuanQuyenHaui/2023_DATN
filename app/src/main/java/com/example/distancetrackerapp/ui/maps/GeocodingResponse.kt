package com.example.distancetrackerapp.ui.maps

data class GeocodingResponse(
    val results: List<GeocodingResult>,
    val status: String
)
data class GeocodingResult(
    val geometry: Geometry,
    val formattedAddress: String // Thêm thuộc tính mới
)



data class Geometry(
    val location: Location
)

data class Location(
    val lat: Double,
    val lng: Double
)