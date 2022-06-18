package com.strv.movies.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.strv.movies.data.entity.GenreEntity
import com.strv.movies.data.entity.MovieDetailEntity
import com.strv.movies.data.entity.MovieDetailWithGenres
import com.strv.movies.data.entity.MovieGenreEntity
import com.strv.movies.data.entity.MovieEntity
import com.strv.movies.data.entity.TrailerEntity
import com.strv.movies.model.TrailersDTO
import kotlinx.coroutines.flow.Flow

@Dao
interface MoviesDao {

    //  Movies Details
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovieDetail(entity: MovieDetailEntity)


    //  TRAILER Details
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTrailerDetail(entity: TrailerEntity)

//    @Query("SELECT * FROM trailer WHERE id = :id")
//    fun observeTrailerDetail(id: Int): Flow<TrailersDTO>

    @Query("SELECT * FROM movie_detail WHERE movie_id = :id")
    fun observeMovieDetail(id: Int): Flow<MovieDetailWithGenres?>

    //  Genres Movies Details
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGenres(entities: List<GenreEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovieGenres(entities: List<MovieGenreEntity>)

    //  Popular Movies Details
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPopularMovies(movies: List<MovieEntity>)

    @Query("SELECT * FROM movie ORDER BY rating DESC")
    fun observePopularMovies(): Flow<List<MovieEntity>>

}