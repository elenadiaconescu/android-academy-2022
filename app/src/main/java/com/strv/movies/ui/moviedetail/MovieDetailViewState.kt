package com.strv.movies.ui.moviedetail

import com.strv.movies.model.MovieDetail
import com.strv.movies.model.Trailer

data class MovieDetailViewState(
    val movie: MovieDetail? = null,
    val trailers: Trailer? = null,
    val loading: Boolean = false,
    val error: String? = null,
//    it's 0f because we want to start from begin
    val videoProgress: Float = 0f
)