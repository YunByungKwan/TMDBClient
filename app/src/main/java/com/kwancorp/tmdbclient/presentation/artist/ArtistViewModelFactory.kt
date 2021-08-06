package com.kwancorp.tmdbclient.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kwancorp.tmdbclient.domain.usecase.*
import com.kwancorp.tmdbclient.presentation.movie.MovieViewModel
import com.kwancorp.tmdbclient.presentation.tv.TvShowViewModel

class ArtistViewModelFactory(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ArtistViewModel(getArtistsUseCase, updateArtistsUseCase) as T
    }
}