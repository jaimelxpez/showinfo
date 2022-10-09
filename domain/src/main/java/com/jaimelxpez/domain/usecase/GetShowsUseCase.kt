package com.jaimelxpez.domain.usecase

import com.jaimelxpez.domain.common.DataState
import com.jaimelxpez.domain.model.Show
import com.jaimelxpez.domain.repository.ShowRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class GetShowsUseCase @Inject constructor(
    private val showRepository: ShowRepository
) {

    operator fun invoke(): Flow<DataState<List<Show>>> = flow {
        try {
            emit(DataState.Loading())
            emit(DataState.Success(showRepository.getShows()))
        }
        catch (e: IOException){
            emit(DataState.Error("Error obtaining shows"))
        }

    }
}