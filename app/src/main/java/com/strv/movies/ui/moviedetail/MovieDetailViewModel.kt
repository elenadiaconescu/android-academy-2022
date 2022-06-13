package com.strv.movies.ui.moviedetail

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.strv.movies.extension.Either
import com.strv.movies.extension.fold
import com.strv.movies.model.Genre
import com.strv.movies.model.MovieDetail
import com.strv.movies.network.MovieRepository
import com.strv.movies.ui.navigation.MoviesNavArguments
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val movieRepository: MovieRepository
) : ViewModel() {

    private val movieId =
        requireNotNull(savedStateHandle.get<Int>(MoviesNavArguments.MOVIE_ID_KEY)) {
            "Movie id is missing..."
        }

    private val _movieDetail = MutableStateFlow<MovieDetail?>(null)
    private val _viewState = MutableStateFlow(MovieDetailViewState(loading = true))
    val viewState = combine(_viewState, _movieDetail) { state, detail ->
        when {
            detail != null -> MovieDetailViewState(movie = detail)
            else -> state
        }
    }

    init {
        observeMovieDetail()

        viewModelScope.launch {
            movieRepository.fetchMovieDetail(movieId).fold(
                { error ->
                    Log.d("TAG", "MovieDetailLoadingError: $error")
                    _viewState.update {
                        MovieDetailViewState(
                            error = error
                        )
                    }
                },
                { movieTitle ->
                    Log.d("TAG", "MovieDetailLoaded: $movieTitle")
                }
            )
        }
    }

    fun updateVideoProgress(progress: Float) {
        _viewState.update { it.copy(videoProgress = progress) }
    }

    private fun observeMovieDetail() {
        viewModelScope.launch {
            movieRepository.observeMovieDetail(movieId).collect {
                _movieDetail.value = it
            }
        }
    }

}