package com.strv.movies.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.strv.movies.data.entity.GenreEntity
import com.strv.movies.data.entity.MovieDetailEntity
import com.strv.movies.data.entity.MovieDetailWithGenres
import com.strv.movies.data.entity.MovieEntity
import com.strv.movies.data.entity.MovieGenreEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MoviesDao {

    //  Movies Details
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovieDetail(entity: MovieDetailEntity)

    @Query("SELECT * FROM movie_detail WHERE movie_id=:movieId ")
    fun observeMovieDetail(movieId: Int): Flow<MovieDetailEntity?>

    //  Popular Movies Details
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertPopularMovies(movies: List<MovieEntity>)
//
//    @Query("SELECT * FROM movie ORDER BY rating DESC")
//    fun observePopularMovies(): Flow<List<MovieEntity>>
//
//    //  Genre Movies Details
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertGenres(enities: List<GenreEntity>)
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertMovieGenres(enities: List<MovieGenreEntity>)
//
//    @Query("SELECT * FROM movie_detail WHERE movie_id = :id")
//    fun observeMovieDetailWithGenre(id: Int): Flow<MovieDetailWithGenres?>

}