package com.asiasama.cinematicketapp.ui.screen.ticket

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * Created by Asia sama on 7/5/2023.
 * sehunexo710@gmail.com
 */
class TicketViewModel  :ViewModel() {

    private val _state = MutableStateFlow(TicketUiState())
    val state = _state.asStateFlow()

    fun onClickShowTime(time: String) {
        _state.update {
            it.copy(selectedShowTime = !it.selectedShowTime)
        }
    }
    fun onClickDay(day: String) {
        _state.update {
            it.copy(selectedDay = !it.selectedDay)
        }
    }
}