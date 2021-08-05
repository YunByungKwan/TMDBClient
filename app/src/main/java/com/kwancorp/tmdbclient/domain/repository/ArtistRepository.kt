package com.kwancorp.tmdbclient.domain.repository

import com.kwancorp.tmdbclient.data.model.artist.Artist
import com.kwancorp.tmdbclient.data.model.movie.Movie

interface ArtistRepository {
    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}