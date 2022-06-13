package com.strv.movies.ui.login

import com.strv.movies.model.Movie

data class MoviesLoginViewState(
    val loading: Boolean = false,
    val error: String? = null,
    val movies: Int = 0 ,
)
