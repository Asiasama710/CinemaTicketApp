package com.asiasama.cinematicketapp.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Created by Asia sama on 7/2/2023.
 * sehunexo710@gmail.com
 */
@Composable
fun Title(modifier: Modifier = Modifier, text: String) {
    Text(
        text = text,
        modifier = modifier.padding(vertical = 8.dp)
            .width(240.dp),
        color = Color.Black,
        style = MaterialTheme.typography.titleLarge
    )
}