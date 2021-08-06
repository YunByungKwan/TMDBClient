package com.kwancorp.tmdbclient.presentation.di.tvshow

import com.kwancorp.tmdbclient.presentation.artist.ArtistActivity
import com.kwancorp.tmdbclient.presentation.di.artist.ArtistModule
import com.kwancorp.tmdbclient.presentation.tv.TvShowActivity
import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {
    fun inject(tvShowActivity: TvShowActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): TvShowSubComponent
    }
}