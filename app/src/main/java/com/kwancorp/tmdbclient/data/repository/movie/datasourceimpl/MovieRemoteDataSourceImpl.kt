package com.kwancorp.tmdbclient.data.repository.movie.datasourceimpl

import com.kwancorp.tmdbclient.data.api.TMDBService
import com.kwancorp.tmdbclient.data.model.movie.MovieList
import com.kwancorp.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
): MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}