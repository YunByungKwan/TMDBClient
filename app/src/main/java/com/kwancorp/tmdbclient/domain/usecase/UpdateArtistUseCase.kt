package com.kwancorp.tmdbclient.domain.usecase

import com.kwancorp.tmdbclient.data.model.artist.Artist
import com.kwancorp.tmdbclient.domain.repository.ArtistRepository

class UpdateArtistUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()
}