package com.strv.movies.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.strv.movies.model.GenreDTO

@Entity(tableName = "genre_entity")
data class GenreEntity(
    @PrimaryKey
    @ColumnInfo(name = "genre_id") val genreId: Int,
    @ColumnInfo(name = "name") val name: String
)

fun GenreEntity.toDomain() = GenreDTO(
    id = genreId,
    name = name
)