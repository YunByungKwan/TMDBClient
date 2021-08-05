package com.kwancorp.tmdbclient.data.repository.tvshow.datasource

import com.kwancorp.tmdbclient.data.model.artist.Artist
import com.kwancorp.tmdbclient.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache(): List<TvShow>
    suspend fun saveTvShowsToCache(artists: List<TvShow>)
}