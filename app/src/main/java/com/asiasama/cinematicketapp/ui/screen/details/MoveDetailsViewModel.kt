package com.asiasama.cinematicketapp.ui.screen.details

import androidx.lifecycle.ViewModel
import com.asiasama.cinematicketapp.R
import com.asiasama.cinematicketapp.data.Move
import com.asiasama.cinematicketapp.data.Ticket
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject


class MoveDetailsViewModel @Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(MoveDetailsUiState())
    val state = _state.asStateFlow()

    init {
        getNowShowingMove()
    }

    private fun getNowShowingMove() {
        _state.update {
            it.copy(
                actor = listOf(
                    R.drawable.film_cover,
                    R.drawable.film_cover,
                    R.drawable.film_cover,
                    R.drawable.film_cover,
                    R.drawable.film_cover,
                    R.drawable.film_cover,
                    R.drawable.film_cover,
                    R.drawable.film_cover,
                    R.drawable.film_cover,
                    R.drawable.film_cover,
                    R.drawable.film_cover,
                )
            )
        }
    }

}