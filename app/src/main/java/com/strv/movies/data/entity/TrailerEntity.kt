package com.strv.movies.data.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.strv.movies.model.Movie
import com.strv.movies.model.Trailer
import com.strv.movies.model.TrailerDTO

@Entity(tableName = "trailer")
class TrailerEntity(
    @PrimaryKey
    @ColumnInfo(name = "id") val id: Int,

)

data class Movietrailers(
    @Embedded
    val trailer: TrailerEntity



)
fun TrailerEntity.toDomain() = Trailer(
    id = id
)