package com.strv.movies.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movie_detail")
data class MovieDetailEntity(
    @PrimaryKey
    @ColumnInfo(name = "movie_id") val id: Int,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "overview") val overview: String?,
    // some bug here with year - date - check it out later
    @ColumnInfo(name = "release_year") val releaseYear: String,
    @ColumnInfo(name = "poster_path") val posterPath: String
//    @ColumnInfo(name = "runtime") val runtime: Int,
)