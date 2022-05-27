package com.strv.movies.ui.movieslist

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.strv.movies.data.OfflineMoviesProvider
import com.strv.movies.model.Movie
import com.strv.movies.ui.navigation.MoviesNavArguments
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class MoviesListViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {


    private val _viewState = MutableStateFlow(MoviesListViewState(loading = true))
    val viewState = _viewState.asStateFlow()

    init {
        viewModelScope.launch {
            delay(2000)
            _viewState.update {
                val randomNumber = Random.nextInt(10)
                if (randomNumber < 3) {
                    MoviesListViewState(error = "Something went wrong on Movies List")
                } else {
                    MoviesListViewState(
                        movies = OfflineMoviesProvider.getMovies()
                    )
                }
            }
        }
    }
}