package com.kwancorp.tmdbclient.data.repository.tvshow.datasourceimpl

import com.kwancorp.tmdbclient.data.api.TMDBService
import com.kwancorp.tmdbclient.data.model.artist.ArtistList
import com.kwancorp.tmdbclient.data.model.tvshow.TvShowList
import com.kwancorp.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.kwancorp.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
): TvShowRemoteDataSource {
    override suspend fun getTvShows(): Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}