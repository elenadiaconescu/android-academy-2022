package com.strv.movies.ui.login

data class MoviesLoginViewState(
    val loading: Boolean = false,
    val error: String? = null,
    val movies: Int = 0,
)
