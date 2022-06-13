package com.strv.movies.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.strv.movies.model.GenreDTO

@Entity(tableName = "movie_genre", primaryKeys = ["genre_id", "movie_id"])
data class MovieGenreEntity(
    @ColumnInfo(name = "movie_id") val movieId: Int,
    @ColumnInfo(name = "genre_id") val genreId: Int
)

fun GenreDTO.toEntity(movieId: Int) = MovieGenreEntity(
    genreId = id,
    movieId = movieId
)