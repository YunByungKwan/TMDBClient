package com.kwancorp.tmdbclient.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kwancorp.tmdbclient.domain.usecase.GetMoviesUseCase
import com.kwancorp.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.kwancorp.tmdbclient.domain.usecase.UpdateMoviesUseCase
import com.kwancorp.tmdbclient.domain.usecase.UpdateTvShowsUseCase
import com.kwancorp.tmdbclient.presentation.movie.MovieViewModel

class TvShowViewModelFactory(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TvShowViewModel(getTvShowsUseCase, updateTvShowsUseCase) as T
    }
}