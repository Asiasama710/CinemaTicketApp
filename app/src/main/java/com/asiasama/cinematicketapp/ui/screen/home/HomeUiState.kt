package com.asiasama.cinematicketapp.ui.screen.home

import com.asiasama.cinematicketapp.data.Move

data class HomeUiState(
    val nowShowing: List<Move> = emptyList(),
)
