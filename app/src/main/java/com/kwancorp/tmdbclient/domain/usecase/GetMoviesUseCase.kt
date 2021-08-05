package com.kwancorp.tmdbclient.domain.usecase

import com.kwancorp.tmdbclient.data.model.movie.Movie
import com.kwancorp.tmdbclient.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}