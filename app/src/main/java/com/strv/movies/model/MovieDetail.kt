package com.strv.movies.model

import com.squareup.moshi.Json
import com.strv.movies.data.entity.GenreEntity
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
    @Json(name = "genres")
    val genres: List<GenreDTO>
)

// Used for UI
data class MovieDetail(
    val id: Int,
    val title: String,
    val overview: String?,
    val releaseDate: String,
    val posterPath: String,
    val genres: List<Genre>
)

fun MovieDetailDTO.toEntity() = MovieDetailEntity(
    id = id,
    title = title,
    overview = overview,
    releaseDate = releaseDate,
    posterPath = posterPath
)
