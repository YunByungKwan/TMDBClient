package com.kwancorp.tmdbclient.data.repository.artist.datasourceimpl

import com.kwancorp.tmdbclient.data.api.TMDBService
import com.kwancorp.tmdbclient.data.model.artist.ArtistList
import com.kwancorp.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
): ArtistRemoteDataSource {
    override suspend fun getArtists(): Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}