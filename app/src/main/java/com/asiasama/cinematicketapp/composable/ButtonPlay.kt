package com.asiasama.cinematicketapp.composable

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ButtonPlay(modifier: Modifier = Modifier, onClickPlay: () -> Unit) {
    IconButton(
        onClick = onClickPlay,
        modifier = modifier.background(
                shape = MaterialTheme.shapes.extraLarge,
                color = MaterialTheme.colorScheme.primary
            )

    ) { Icon(Icons.Filled.PlayArrow, contentDescription = null, tint = Color.White) }

}