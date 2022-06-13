package com.strv.movies.model

import com.squareup.moshi.Json
import com.strv.movies.data.entity.MovieDetailEntity

// Used for getting data from network
data class MovieDetailDTO(
    @Json(name = "id")
    val id: Int,
    @Json(name = "title")
    val title: String,
    @Json(name = "overview")
    val overview: String?,
    @Json(name = "release_date")
    val releaseDate: String,
    @Json(name = "poster_path")
    val posterPath: String,
//    @Json(name = "runtime")
//    val runtime: Int,
//    @Json(name = "genres")
//    val genres: Array<Movie>
)

// Used for UI
data class MovieDetail(
    val id: Int,
    val title: String,
    val overview: String?,
    val releaseYear: String,
    val posterPath: String,
//    val runtime: Int, // Not used for now - try to include it in UI if you want :)
//    val genre: Genre
)

fun MovieDetailDTO.toEntity() = MovieDetailEntity(
    id = id,
    title = title,
    overview = overview,
    releaseYear = releaseDate,
    posterPath = posterPath,
)
