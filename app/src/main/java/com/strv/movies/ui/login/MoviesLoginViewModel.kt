package com.strv.movies.ui.login

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.strv.movies.extension.fold
import com.strv.movies.network.MovieRepository
import com.strv.movies.ui.movieslist.MoviesListViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MoviesLoginViewModel @Inject constructor(
    private val movieRepository: MovieRepository
    ) : ViewModel() {

    private val _viewState = MutableStateFlow(MoviesLoginViewState(loading = true))
    val viewState = _viewState.asStateFlow()

    init {
        viewModelScope.launch {
            fetchPopularMovies()
        }
    }

    private suspend fun fetchPopularMovies() {
        Log.e("TAG", "MovieList - Start fetching data.")
        movieRepository.getPopularMovies().fold(
            { error ->
                Log.d("TAG", "MovieListLoadingError: $error")
                _viewState.update {
                    MoviesLoginViewState(
                        error = error
                    )
                }
            },
            { movieList ->
                Log.e("TAG", "MovieListSuccess: ${movieList.size}")
                _viewState.update {
                    MoviesLoginViewState(
                        movies = movieList
                    )
                }
            }
        )
    }
}