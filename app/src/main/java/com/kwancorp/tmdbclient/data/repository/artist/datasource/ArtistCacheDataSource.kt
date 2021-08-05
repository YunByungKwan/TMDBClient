package com.kwancorp.tmdbclient.data.repository.artist.datasource

import com.kwancorp.tmdbclient.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache(): List<Artist>
    suspend fun saveArtistsToCache(artists: List<Artist>)
}