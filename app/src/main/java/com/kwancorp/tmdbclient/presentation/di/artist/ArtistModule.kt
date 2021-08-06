package com.kwancorp.tmdbclient.presentation.di.artist

import com.kwancorp.tmdbclient.domain.usecase.GetArtistsUseCase
import com.kwancorp.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.kwancorp.tmdbclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }
}