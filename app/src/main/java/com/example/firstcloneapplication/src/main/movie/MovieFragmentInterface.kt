package com.example.firstcloneapplication.src.main.movie

import com.example.firstcloneapplication.src.main.movie.models.NowPlayingMovieResponse
import java.security.MessageDigest

interface MovieFragmentInterface {

    fun onGetNowPlayingMovieSuccess(response: NowPlayingMovieResponse)

    fun onGetNowPlayingMovieFailure(message: String)
}