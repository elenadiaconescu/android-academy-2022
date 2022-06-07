package com.strv.movies.model

import com.squareup.moshi.Json
import kotlin.collections.List

data class Movie(
    val id: Int,
    val posterPath: String
)

data class MovieDTO(
    @Json(name = "id")
    val id: Int,
    @Json(name = "poster_path")
    val posterPath: String
)

// We get data in a way that pagination can be implemented later on :)
data class PopularMoviesDTO(
    @Json(name = "results")
    val results: List<MovieDTO>,
    @Json(name = "page")
    val page: Int,
)