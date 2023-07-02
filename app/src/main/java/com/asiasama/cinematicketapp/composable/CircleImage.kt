package com.asiasama.cinematicketapp.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp


@Composable
fun CircleImage(painter: Painter, modifier: Modifier = Modifier) {
    Image(
        modifier = modifier
            .wrapContentSize()
            .size(60.dp)
            .clip(shape = CircleShape),
        painter = painter,
        contentDescription = null,
        contentScale = ContentScale.Crop
    )

}
