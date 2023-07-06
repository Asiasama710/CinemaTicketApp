package com.asiasama.cinematicketapp.ui.screen.home

import androidx.lifecycle.ViewModel
import com.asiasama.cinematicketapp.R
import com.asiasama.cinematicketapp.data.Move
import com.asiasama.cinematicketapp.data.Ticket
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject


class HomeViewModel @Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(HomeUiState())
    val state = _state.asStateFlow()

    init {
        getNowShowingMove()
    }

    private fun getNowShowingMove() {
        _state.update {
            it.copy(
                nowShowing = listOf(
                    Move(
                        title = "fantastic beasts",
                        image = R.drawable.fantastic_beasts,
                        showTime = "2h 30m",
                        category = listOf("Dracula", "Fantasy", "Adventure")
                    ),

                    Move(
                        title = "Fantastic beasts the secret of dumbledore ",
                        image = R.drawable.fb3_poster_jude_law_full,
                        showTime = "2h 30m",
                        category = listOf("Action", "Adventure", "Drama")
                    ),
                    Move(
                        title = "forefather richard coyle scaled",
                        image = R.drawable.aberforth_richard_coyle_scaled,
                        showTime = "1h 45m",
                        category = listOf("Comedy", "Drama", "Romance")
                    )
                )
            )
        }
    }

}