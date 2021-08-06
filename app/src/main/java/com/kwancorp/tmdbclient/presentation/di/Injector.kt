package com.kwancorp.tmdbclient.presentation.di

import com.kwancorp.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.kwancorp.tmdbclient.presentation.di.movie.MovieSubComponent
import com.kwancorp.tmdbclient.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}