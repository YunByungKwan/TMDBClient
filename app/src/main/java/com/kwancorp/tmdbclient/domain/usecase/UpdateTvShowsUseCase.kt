package com.kwancorp.tmdbclient.domain.usecase

import com.kwancorp.tmdbclient.data.model.tvshow.TvShow
import com.kwancorp.tmdbclient.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.updateTvShows()
}