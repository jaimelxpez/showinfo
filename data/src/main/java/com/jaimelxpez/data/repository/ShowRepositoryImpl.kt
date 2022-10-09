package com.jaimelxpez.data.repository

import com.jaimelxpez.data.api.ShowApi
import com.jaimelxpez.data.extensions.toDomain
import com.jaimelxpez.domain.model.Show
import com.jaimelxpez.domain.repository.ShowRepository
import javax.inject.Inject

class ShowRepositoryImpl @Inject constructor(
    private val api: ShowApi
): ShowRepository {

    override suspend fun getShows(): List<Show> {
        return api.getShows().map {
            it.toDomain()
        }
    }
}