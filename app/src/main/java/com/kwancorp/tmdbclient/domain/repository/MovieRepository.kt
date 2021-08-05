package com.kwancorp.tmdbclient.domain.repository

import com.kwancorp.tmdbclient.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}