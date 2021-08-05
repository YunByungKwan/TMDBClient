package com.kwancorp.tmdbclient.data.repository.movie.datasource

import com.kwancorp.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}