package com.jemutai.retrofit_jetpack

import retrofit2.http.GET

interface WizardApiService {
    @GET("/House")
    suspend fun  getHouses():List<House>
}