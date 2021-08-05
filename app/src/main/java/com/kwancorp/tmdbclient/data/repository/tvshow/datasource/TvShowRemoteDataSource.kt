package com.kwancorp.tmdbclient.data.repository.tvshow.datasource

import com.kwancorp.tmdbclient.data.model.artist.ArtistList
import com.kwancorp.tmdbclient.data.model.movie.MovieList
import com.kwancorp.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getTvShows(): Response<TvShowList>
}