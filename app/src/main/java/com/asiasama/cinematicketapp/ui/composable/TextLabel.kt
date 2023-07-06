package com.asiasama.cinematicketapp.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Created by Asia sama on 7/2/2023.
 * sehunexo710@gmail.com
 */

@Composable
fun TextLabel(rate: String, label: String) {
    Column(
        modifier = Modifier.wrapContentSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = rate,
            style = MaterialTheme.typography.bodyMedium, color = Color.DarkGray)
        Text(text = label, style = MaterialTheme.typography.bodySmall,color = Color.DarkGray.copy(alpha = 0.5f))
    }
}

@Preview
@Composable
fun TicketState(
    modifier: Modifier = Modifier,
    color: Color = Color.Red,
    state: String = "",
){
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Box(modifier = Modifier
            .size(16.dp)
            .background(color = color, shape = CircleShape))
        Text(text = state,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}