package com.kwancorp.tmdbclient.data.repository.tvshow.datasource

import com.kwancorp.tmdbclient.data.model.artist.Artist
import com.kwancorp.tmdbclient.data.model.movie.Movie
import com.kwancorp.tmdbclient.data.model.tvshow.TvShow

interface TvShowLocalDataSource {
    suspend fun getTvShowsFromDB(): List<TvShow>
    suspend fun saveTvShowsToDB(artists: List<TvShow>)
    suspend fun clearAll()
}