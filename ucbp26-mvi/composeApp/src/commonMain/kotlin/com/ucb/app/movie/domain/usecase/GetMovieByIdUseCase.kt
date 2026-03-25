package com.ucb.app.movie.domain.usecase

import com.ucb.app.movie.domain.model.MovieModel
import com.ucb.app.movie.domain.repository.MovieRepository

class GetMovieByIdUseCase(
    private val repository: MovieRepository
) {
    suspend operator fun invoke(id: Int): MovieModel = repository.getMovieById(id)
}