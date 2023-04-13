package com.example.libraryretrofitpro

import com.example.libraryretrofitpro.data.Library
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

// http://openapi.seoul.go.kr:8088/46754b58526a656f35304c4b67754d/json/SeoulPublicLibraryInfo/1/5/

class SeoulOpenApi {
    companion object {
        val DOMAIN = "http://openapi.seoul.go.kr:8088/"
        val API_KEY = "46754b58526a656f35304c4b67754d"
        val LIST_TOTAL_COUNT = 203
    }
}

interface SeoulOpenService {
    @GET("{api_key}/json/SeoulPublicLibraryInfo/1/{end}")
    fun getLibrarys(@Path("api_key") key: String, @Path("end") limit: Int): Call<Library>
}