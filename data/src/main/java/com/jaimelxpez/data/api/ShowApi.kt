package com.jaimelxpez.data.api

import com.jaimelxpez.data.model.ShowModel
import retrofit2.http.GET

interface ShowApi {

    @GET("shows")
    suspend fun getShows(): List<ShowModel>
}