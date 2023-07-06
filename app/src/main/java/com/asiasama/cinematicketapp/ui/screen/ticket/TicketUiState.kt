package com.asiasama.cinematicketapp.ui.screen.ticket

import com.asiasama.cinematicketapp.data.Ticket

/**
 * Created by Asia sama on 7/5/2023.
 * sehunexo710@gmail.com
 */
data class TicketUiState(
    val showTime: List<String> = emptyList(),
    val day: List<Ticket> = emptyList(),
    val selectedShowTime: Boolean = false,
    val selectedDay: Boolean = false,
)
