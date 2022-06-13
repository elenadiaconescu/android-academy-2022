package com.strv.movies.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.strv.movies.model.Genre
import com.strv.movies.model.GenreDTO
import com.strv.movies.model.MovieDetail

@Entity(tableName = "movie_detail")
data class MovieDetailEntity(
    @PrimaryKey
    @ColumnInfo(name = "movie_id") val id: Int,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "overview") val overview: String?,
    @ColumnInfo(name = "release_date") val releaseDate: String,
    @ColumnInfo(name = "poster_path") val posterPath: String,
//    @ColumnInfo(name = "runtime") val runtime: Int,
//    @ColumnInfo(name = "revenue") val revenue: Int
)

fun MovieDetailWithGenres.toDomain() = MovieDetail(
    id = movie.id,
    title = movie.title,
    overview = movie.overview,
    posterPath = movie.posterPath,
    releaseDate = movie.releaseDate,
    genres = genres.map { it.toDomain() }
)
