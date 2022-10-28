package com.example.firstcloneapplication.src.main.movie.models

import com.google.gson.annotations.SerializedName

data class NowPlayingMovieResponse(
    @SerializedName("dates") val dates: MovieDates,
    @SerializedName("page") val page: Int,
    @SerializedName("results") val results: ArrayList<MovieResults>
)
data class MovieDates(
    @SerializedName("maximum") val maximum: String,
    @SerializedName("minimum") val minimum: String
)
data class MovieResults(
    @SerializedName("adult") val adult: Boolean,
    @SerializedName("backdrop_path") val backdrop_path: String,
    @SerializedName("genre_ids") val genre_ids: ArrayList<Int>,
    @SerializedName("id") val id: Int,
    @SerializedName("original_language") val original_language: String,
    @SerializedName("original_title") val original_title: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("popularity") val popularity: Double,
    @SerializedName("poster_path") val poster_path: String,
    @SerializedName("release_date") val release_date: String,
    @SerializedName("title") val title: String,
    @SerializedName("video") val video: Boolean,
    @SerializedName("vote_average") val vote_average: Double,
    @SerializedName("vote_count") val vote_count: Int
)