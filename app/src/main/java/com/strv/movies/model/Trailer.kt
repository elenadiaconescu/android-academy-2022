package com.strv.movies.model

import com.squareup.moshi.Json
import com.strv.movies.data.entity.TrailerEntity

data class TrailersDTO(
    val id: Int,
    val results: List<TrailerDTO>?
)

// You can actually not use annotations in DTOs if your naming matches the server name.
// Here it is only used in case of publishedAt, because it is not camelcased in the response we get.
// I would generally recommend using it everywhere, simple name refactor could break things otherwise.
data class TrailerDTO(
    val name: String?,
    val key: String?,
    val site: String?,
    @Json(name = "published_at")
    val publishedAt: String?,
    val id: String?
)

// You can actually not use annotations in DTOs if your naming matches the server name.
// Here it is only used in case of publishedAt, because it is not camelcased in the response we get.
// I would generally recommend using it everywhere, simple name refactor could break things otherwise.
data class TrailerOnlyDTO(
    val name: String?,
    val key: String?,
    val site: String?,
    @Json(name = "published_at")
    val publishedAt: String?,
    val id: String?
)

data class Trailer(
    val id: Int
)

fun TrailersDTO.toEntity() = TrailerEntity(
    id = id
)