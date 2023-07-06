package com.asiasama.cinematicketapp.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asiasama.cinematicketapp.R

@Preview
@Composable
fun SeatChip(
    seatLeft:Int = 0,
    seatCenter:Int = 0,
    seatRight:Int = 0,
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        SeatState(
            isSelected = seatLeft,
            onChecked = {},
            seatAvailableIcon = R.drawable.left_seat,
            seatSelectedIcon = R.drawable.left_seat_selected,
            seatNotAvailableIcon = R.drawable.left_seat_not_avia,
        )
        SeatState(
            isSelected = seatCenter,
            onChecked = {},
            seatAvailableIcon = R.drawable.center_seat_avail,
            seatSelectedIcon = R.drawable.center_seat_selected,
            seatNotAvailableIcon = R.drawable.center_seat_not_avia,
            modifier = Modifier.size(90.dp).padding(top = 16.dp)

        )
        SeatState(
            isSelected = seatRight,
            onChecked = {},
            seatAvailableIcon = R.drawable.right_seat_avail,
            seatSelectedIcon = R.drawable.right_seat_selected,
            seatNotAvailableIcon = R.drawable.right_seat_not_avia,

        )
    }
}


@Composable
fun SeatState(
    isSelected: Int,
    onChecked: () -> Unit,
    seatAvailableIcon: Int,
    seatSelectedIcon: Int,
    seatNotAvailableIcon: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = when (isSelected) {
            0 -> painterResource(id = seatAvailableIcon)
            1 -> painterResource(id = seatSelectedIcon)
            else -> painterResource(id = seatNotAvailableIcon)
        } ,
        contentDescription = null,
        modifier = modifier.size(90.dp)
            .clickable { onChecked() },
    )
}