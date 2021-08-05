package com.kwancorp.tmdbclient.data.repository.tvshow

import android.util.Log
import com.kwancorp.tmdbclient.data.model.artist.Artist
import com.kwancorp.tmdbclient.data.model.tvshow.TvShow
import com.kwancorp.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.kwancorp.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.kwancorp.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.kwancorp.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.kwancorp.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.kwancorp.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.kwancorp.tmdbclient.domain.repository.ArtistRepository
import com.kwancorp.tmdbclient.domain.repository.TvShowRepository

class TvShowRepositoryImpl(
    private val tvShowRemoteDataSource: TvShowRemoteDataSource,
    private val tvShowLocalDataSource: TvShowLocalDataSource,
    private val tvShowCacheDataSource: TvShowCacheDataSource
): TvShowRepository {
    override suspend fun getTvShows(): List<TvShow>? {
        return getTvShowsFromCache()
    }

    override suspend fun updateTvShows(): List<TvShow>? {
        val newListOfTvShows = getTvShowsFromAPI()
        tvShowLocalDataSource.clearAll()
        tvShowLocalDataSource.saveTvShowsToDB(newListOfTvShows)
        tvShowCacheDataSource.saveTvShowsToCache(newListOfTvShows)
        return newListOfTvShows
    }

    suspend fun getTvShowsFromAPI(): List<TvShow> {
        lateinit var tvShowList: List<TvShow>
        try {
            val response = tvShowRemoteDataSource.getTvShows()
            val body = response.body()
            if(body != null) {
                tvShowList = body.tvShows
            }
        } catch(exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return tvShowList
    }

    suspend fun getTvShowsFromDB(): List<TvShow> {
        lateinit var tvShowList: List<TvShow>
        try {
            tvShowList = tvShowLocalDataSource.getTvShowsFromDB()
        } catch(exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(tvShowList.isNotEmpty()) {
            return tvShowList
        } else {
            tvShowList = getTvShowsFromAPI()
            tvShowLocalDataSource.saveTvShowsToDB(tvShowList)
        }
        return tvShowList
    }

    suspend fun getTvShowsFromCache(): List<TvShow> {
        lateinit var tvShowList: List<TvShow>
        try {
            tvShowList = tvShowCacheDataSource.getTvShowsFromCache()
        } catch(exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(tvShowList.isNotEmpty()) {
            return tvShowList
        } else {
            tvShowList = getTvShowsFromDB()
            tvShowCacheDataSource.saveTvShowsToCache(tvShowList)
        }
        return tvShowList
    }
}