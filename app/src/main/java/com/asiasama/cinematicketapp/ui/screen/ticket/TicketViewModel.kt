package com.asiasama.cinematicketapp.ui.screen.ticket

import androidx.lifecycle.ViewModel
import com.asiasama.cinematicketapp.data.Ticket
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject


class TicketViewModel @Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(TicketUiState())
    val state = _state.asStateFlow()

    init {
        getShowTime()
        getDayCalendar()
    }
   private fun getShowTime() {
        _state.update {
            it.copy(
                showTime = listOf(
                    "10:00 AM",
                    "12:00 PM",
                    "02:00 PM",
                    "04:00 PM",
                    "06:00 PM",
                    "08:00 PM"
                )
            )
        }
    }

    private fun getDayCalendar() {
        _state.update {
            it.copy(
                day = listOf(
                    Ticket("Mon", "12"),
                    Ticket("Tue", "13"),
                    Ticket("Wed", "14"),
                    Ticket("Thu", "15"),
                    Ticket("Fri", "16"),
                    Ticket("Sat", "17"),
                    Ticket("Sun", "18"),
                    Ticket("Sun", "18"),
                    Ticket("Sun", "18"),
                )
            )
        }
    }

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