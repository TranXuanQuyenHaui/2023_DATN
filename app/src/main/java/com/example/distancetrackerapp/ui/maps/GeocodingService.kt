package com.example.distancetrackerapp.ui.maps;
import android.util.Log
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
interface GeocodingService {
    companion object {
        private const val BASE_URL = "https://maps.googleapis.com/"

        fun create(): GeocodingService {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(GeocodingService::class.java)
        }
    }

    interface GeocodingService {
        @GET("maps/api/geocode/json")
        fun getLocationByAddress(
            @Query("address") address: String,
            @Query("@string/google_maps_key") apiKey: String
        ): Call<GeocodingResponse?> {
            Log.d("GeocodingService", "Calling API with address: $address")

            return TODO("Provide the return value")
        }
    }
}