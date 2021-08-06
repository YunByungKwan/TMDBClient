package com.kwancorp.tmdbclient.presentation.di.tvshow

import com.kwancorp.tmdbclient.domain.usecase.GetArtistsUseCase
import com.kwancorp.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.kwancorp.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.kwancorp.tmdbclient.domain.usecase.UpdateTvShowsUseCase
import com.kwancorp.tmdbclient.presentation.artist.ArtistViewModelFactory
import com.kwancorp.tmdbclient.presentation.di.artist.ArtistScope
import com.kwancorp.tmdbclient.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }
}