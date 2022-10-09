package com.jaimelxpez.domain.repository

import com.jaimelxpez.domain.model.Show

interface ShowRepository {

    suspend fun getShows(): List<Show>

}