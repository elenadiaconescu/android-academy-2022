package com.strv.movies.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.strv.movies.model.Movie

@Entity(tableName = "movie")
class MovieEntity(
    @PrimaryKey
    @ColumnInfo(name = "movie_id") val id: Int,
    @ColumnInfo(name = "poster_path") val posterPath: String,
)

fun MovieEntity.toDomain() = Movie(
    id = id,
    posterPath = posterPath,
)