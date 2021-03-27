package com.jcah.movieapp.data.remote

import com.jcah.movieapp.application.AppConstants
import com.jcah.movieapp.data.model.MovieList
import com.jcah.movieapp.repository.WebService

class MovieDataSource(private val webService: WebService) {

    suspend fun getUpcomingMovies(): MovieList = webService.getUpcomongMovies(AppConstants.API_KEY)


    suspend fun getTopRatedMovies(): MovieList = webService.getTopRatedMovies(AppConstants.API_KEY)


    suspend fun getPopularMovies(): MovieList = webService.getPopularMovies(AppConstants.API_KEY)
}
