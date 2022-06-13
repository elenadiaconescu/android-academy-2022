package com.strv.movies.network

import com.strv.movies.data.dao.MoviesDao
import com.strv.movies.data.entity.MovieEntity
import com.strv.movies.data.entity.toDomain
import com.strv.movies.database.MoviesDatabase
import com.strv.movies.extension.Either
import com.strv.movies.model.Movie
import com.strv.movies.model.MovieDTO
import com.strv.movies.model.MovieDetail
import com.strv.movies.model.MovieDetailDTO
import com.strv.movies.model.toEntity
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepository @Inject constructor(
    private val api: MovieApi,
    private val moviesDao: MoviesDao,
    private val moviesDatabase: MoviesDatabase
) {

    suspend fun fetchMovieDetail(movieId: Int): Either<String, String> {
        return try {
            val movie = api.getMovieDetail(movieId)
            storeMovieDetail(movie)
            Either.Value(movie.title)
        } catch (exception: Throwable) {
            Either.Error(exception.localizedMessage ?: "Network error")
        }
    }

    suspend fun fetchPopularMovies(): Either<String, Int> {
        return try {
            val popularMovies = api.getPopularMovies()

            moviesDao.insertPopularMovies(popularMovies.results.map(MovieDTO::toEntity))

            Either.Value(popularMovies.results.size)
        } catch (exception: Throwable) {
            Either.Error(exception.localizedMessage ?: "Network error")
        }
    }

    fun observePopularMovies(): Flow<List<Movie>> =
        moviesDao.observePopularMovies().map {
            it.map(MovieEntity::toDomain)
        }

    fun observeMovieDetail(movieId: Int): Flow<MovieDetail?> =
        moviesDao.observeMovieDetail(movieId).map {
            it?.toDomain()
        }

    private suspend fun storeMovieDetail(movie: MovieDetailDTO) {
        moviesDao.insertMovieDetail(movie.toEntity())
        moviesDao.insertGenres(movie.genres.map { it.toEntity() })
        moviesDao.insertGenres(movie.genres.map { it.toEntity() })
        moviesDao.insertMovieGenres(movie.genres.map { it.toEntity(movie.id) })
    }
}