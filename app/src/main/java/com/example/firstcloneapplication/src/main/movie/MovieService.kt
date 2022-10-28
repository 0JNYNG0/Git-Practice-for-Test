package com.example.firstcloneapplication.src.main.movie

import com.example.firstcloneapplication.config.ApplicationClass
import com.example.firstcloneapplication.src.main.movie.models.NowPlayingMovieResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieService(val movieFragmentInterface: MovieFragmentInterface, private val api_key: String, private val language: String) {

    fun tryGetNowPlayingMovie(){
        val movieRetrofitInterface = ApplicationClass.sRetrofit.create(MovieRetrofitInterface::class.java)
        movieRetrofitInterface.getNowPlayingMovie(api_key, language).enqueue(object: Callback<NowPlayingMovieResponse> {
            override fun onResponse(call: Call<NowPlayingMovieResponse>, response: Response<NowPlayingMovieResponse>) {
                movieFragmentInterface.onGetNowPlayingMovieSuccess(response.body() as NowPlayingMovieResponse)
            }
            override fun onFailure(call: Call<NowPlayingMovieResponse>, t: Throwable) {
                movieFragmentInterface.onGetNowPlayingMovieFailure(t.message ?: "통신 오류")
            }

        })
    }

}