package com.jcah.movieapp.repository

import com.jcah.movieapp.data.model.MovieList
import com.jcah.movieapp.data.remote.MovieDataSource

class MovieRepositoryImpl(private val dataSource: MovieDataSource) : MovieRepository {


    override suspend fun getUpcomingMovies(): MovieList = dataSource.getUpcomingMovies()

    override suspend fun getTopRatedMovies(): MovieList = dataSource.getTopRatedMovies()


    override suspend fun getPopularMovies(): MovieList = dataSource.getPopularMovies()


}