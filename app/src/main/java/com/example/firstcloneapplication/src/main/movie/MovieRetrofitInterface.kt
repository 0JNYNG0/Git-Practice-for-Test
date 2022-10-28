package com.example.firstcloneapplication.src.main.movie

import com.example.firstcloneapplication.src.main.movie.models.NowPlayingMovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieRetrofitInterface {
    @GET("movie/now_playing")
    fun getNowPlayingMovie(@Query("api_key") api_key: String,
                           @Query("language") language: String
    ) : Call<NowPlayingMovieResponse>
}