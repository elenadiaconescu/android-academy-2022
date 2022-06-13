package com.strv.movies.network

import com.strv.movies.data.dao.MoviesDao
import com.strv.movies.data.entity.toDomain
import com.strv.movies.data.mapper.MovieMapper
import com.strv.movies.extension.Either
import com.strv.movies.model.Movie
import com.strv.movies.model.MovieDetail
import com.strv.movies.model.MovieDetailDTO
import com.strv.movies.model.Trailer
import com.strv.movies.model.toEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepository @Inject constructor(
    private val api: MovieApi,
    private val moviesDao: MoviesDao,
    private val movieMapper: MovieMapper,
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

//    suspend fun getTrailers(movieId: Int): Either<String, List<Trailer>> {
//        return try {
//            val videos = api.getVideos(movieId)
//            Either.Value(videos.results?.map { trailerMapper.map(it) }
//                ?: emptyList()) // solving nullability from API nicely
//        } catch (exception: Throwable) {
//            Either.Error(exception.localizedMessage ?: "Network error")
//        }
//    }

    suspend fun getPopularMovies(): Either<String, List<Movie>> {
        return try {
            val popularMovies = api.getPopularMovies()
            Either.Value(popularMovies.results.map { movieMapper.map(it) })
        } catch (exception: Throwable) {
            Either.Error(exception.localizedMessage ?: "Network error")
        }
    }

    private suspend fun storeMovieDetail(movie: MovieDetailDTO) {
        moviesDao.insertMovieDetail(movie.toEntity())
        moviesDao.insertGenres(movie.genres.map { it.toEntity() })
        moviesDao.insertGenres(movie.genres.map { it.toEntity() })
        moviesDao.insertMovieGenres(movie.genres.map { it.toEntity(movie.id) })
    }

    fun observeMovieDetail(movieId: Int): Flow<MovieDetail?> =
        moviesDao.observeMovieDetail(movieId).map {
            it?.toDomain()
        }
}