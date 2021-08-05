package com.kwancorp.tmdbclient.data.repository.artist.datasource

import com.kwancorp.tmdbclient.data.model.artist.ArtistList
import com.kwancorp.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists(): Response<ArtistList>
}