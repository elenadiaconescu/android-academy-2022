package com.strv.movies.data.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.strv.movies.model.Trailer

@Entity(tableName = "trailer")
class TrailerEntity(
    @PrimaryKey
    @ColumnInfo(name = "id") val id: Int,

    )

// data class Movietrailers(
//    @Embedded
//    val trailer: TrailerEntity
// )

fun TrailerEntity.toDomain() = Trailer(
    id = id
)