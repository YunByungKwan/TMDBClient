package com.kwancorp.tmdbclient.presentation.di.movie

import com.kwancorp.tmdbclient.domain.usecase.GetArtistsUseCase
import com.kwancorp.tmdbclient.domain.usecase.GetMoviesUseCase
import com.kwancorp.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.kwancorp.tmdbclient.domain.usecase.UpdateMoviesUseCase
import com.kwancorp.tmdbclient.presentation.artist.ArtistViewModelFactory
import com.kwancorp.tmdbclient.presentation.di.artist.ArtistScope
import com.kwancorp.tmdbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUseCase
        )
    }
}