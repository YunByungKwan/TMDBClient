package com.kwancorp.tmdbclient.presentation.di.core

import com.kwancorp.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.kwancorp.tmdbclient.data.repository.artist.datasourceimpl.ArtistCacheDataSourceImpl
import com.kwancorp.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.kwancorp.tmdbclient.data.repository.movie.datasourceimpl.MovieCacheDataSourceImpl
import com.kwancorp.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.kwancorp.tmdbclient.data.repository.tvshow.datasourceimpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }
}