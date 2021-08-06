package com.kwancorp.tmdbclient.presentation.di.movie

import com.kwancorp.tmdbclient.presentation.artist.ArtistActivity
import com.kwancorp.tmdbclient.presentation.di.artist.ArtistModule
import com.kwancorp.tmdbclient.presentation.movie.MovieActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): MovieSubComponent
    }
}