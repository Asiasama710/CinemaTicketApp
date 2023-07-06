package com.asiasama.cinematicketapp.ui.composable

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asiasama.cinematicketapp.data.Ticket
import com.asiasama.cinematicketapp.ui.theme.Tirtry

/**
 * Created by Asia sama on 7/2/2023.
 * sehunexo710@gmail.com
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Chip(
    text: String = "",
    isSelected: Boolean = false,
    selectedColor: Color = Tirtry,
    notSelectedColor: Color = White,
    textOnSelected: Color = White,
    textOnUnselected: Color = DarkGray,
    onChecked: () -> Unit = {},
    modifier: Modifier = Modifier,
) {
    AssistChip(
        onClick = {
            onChecked()
            isSelected.not()
            Log.e("Chip", "Chip: ${isSelected}")
        },
        label = { Text(text = text, color = if (isSelected) textOnSelected else textOnUnselected) },
        modifier = modifier.padding(horizontal = 4.dp),
        shape = ShapeDefaults.Large,
        border = AssistChipDefaults.assistChipBorder(
            borderColor = if (isSelected) Transparent else MaterialTheme.colorScheme.outlineVariant
        ),
        colors = AssistChipDefaults.assistChipColors(
            containerColor = if (isSelected) selectedColor else notSelectedColor,
            labelColor = if (isSelected) textOnSelected else textOnUnselected,
        )
    )
}


@Preview
@Composable
fun DateChip(
    onClick: () -> Unit = {},
    isSelected: Boolean = false,
    ticketsDay: Ticket = Ticket("Mon","14" ),
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .background(
                color = if (isSelected) Tirtry else White,
                shape = MaterialTheme.shapes.large
            )
            .border(
                width = 1.dp,
                color = if (isSelected) Transparent else MaterialTheme.colorScheme.outlineVariant,
                shape = MaterialTheme.shapes.large
            )
            .padding(12.dp)
            .clickable(onClick = onClick)
            .wrapContentSize()
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = ticketsDay.date,
                style = MaterialTheme.typography.titleMedium,
                color = if (isSelected) White else DarkGray
            )
            Text(
                text = ticketsDay.day,
                style = MaterialTheme.typography.bodySmall,
                color = if (isSelected) White else DarkGray,
            )
        }

    }
}
