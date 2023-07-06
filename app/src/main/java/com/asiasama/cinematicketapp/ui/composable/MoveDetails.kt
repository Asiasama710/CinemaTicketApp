package com.asiasama.cinematicketapp.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MoveDetails(
    showTime: String,
    title: String,
    category: List<String>,
    modifier: Modifier = Modifier
) {

    LabelTime(
        time = showTime,
        textColor = Color.DarkGray,
        IconColor = Color.DarkGray.copy(alpha = 0.5f),
        modifier = Modifier
            .wrapContentSize()
            .padding(4.dp)
    )
    Text(
        text = title,
        color = Color.Black,
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier
            .width(300.dp)
            .padding(top = 8.dp),
        maxLines = 3
    )

    LazyRow(
        modifier = modifier
            .wrapContentWidth()
            .padding(top = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        items(category) { category ->
            Chip(text = category)
        }
    }
}