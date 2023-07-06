package com.asiasama.cinematicketapp.ui.screen.ticket

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.asiasama.cinematicketapp.R
import com.asiasama.cinematicketapp.ui.composable.ButtonClose
import com.asiasama.cinematicketapp.ui.composable.ButtonCustomise
import com.asiasama.cinematicketapp.ui.composable.Chip
import com.asiasama.cinematicketapp.ui.composable.DateChip
import com.asiasama.cinematicketapp.ui.composable.ImageTicket
import com.asiasama.cinematicketapp.ui.composable.SeatChip
import com.asiasama.cinematicketapp.ui.composable.TicketState


@Composable
fun TicketScreen(
    viewModel: TicketViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()

    TicketContent(
        state = state,
        onSelectTime = viewModel::onClickShowTime,
        onSelectDate = viewModel::onClickDay
    )

}


@Preview(showSystemUi = true)
@Composable
private fun TicketContent(
    state: TicketUiState = TicketUiState(),
    onSelectTime: (String) -> Unit = {},
    onSelectDate: (String) -> Unit = {},
) {


    Column(
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.secondary)
            .fillMaxSize()
            .padding(top = 16.dp),

        ) {
        ButtonClose(modifier = Modifier.padding(start = 16.dp))
        ImageTicket(
            color = MaterialTheme.colorScheme.background,
            painter = painterResource(id = R.drawable.tickets_cover),
        )
        SeatChip(seatLeft = 2, seatRight = 2, seatCenter = 0)
        SeatChip(seatLeft = 3, seatRight = 0, seatCenter = 0)
        SeatChip(seatLeft = 1, seatRight = 0, seatCenter = 1)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            TicketState(state = stringResource(R.string.available), color = Color.White)
            TicketState(
                state = stringResource(R.string.taken),
                color = MaterialTheme.colorScheme.tertiary
            )
            TicketState(
                state = stringResource(R.string.selected),
                color = MaterialTheme.colorScheme.primary
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    shape = AbsoluteRoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp),
                    color = Color.White
                )
        ) {
            Column(
                modifier = Modifier.wrapContentSize()
            ) {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    items(state.day) { ticket ->
                        DateChip(
                            isSelected = ticket == state.day[3],
                            onClick = { /*TODO*/ },
                            ticketsDay = ticket
                        )
                    }
                }
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    itemsIndexed(state.showTime) { position, time ->
                        Chip(
                            text = time,
                            isSelected = position == 0,
                        )
                    }
                }


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(horizontal = 16.dp)
                        .padding(bottom = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Bottom
                ) {

                    Column {
                        Text(
                            text = stringResource(R.string._100_00),
                            style = MaterialTheme.typography.titleLarge,
                            color = Color.Black
                        )
                        Text(
                            text = stringResource(R.string._4_tickets),
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Gray
                        )
                    }
                    ButtonCustomise(
                        onClick = {},
                        text = stringResource(R.string.buy_tickets),
                        icon = R.drawable.ic_bookinng
                    )

                }

            }
        }
    }
}

