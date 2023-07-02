package com.asiasama.cinematicketapp.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale

@Composable
fun ImageCover(painter: Painter){

    Image(
        modifier = Modifier
            .fillMaxWidth(),
        painter = painter,
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}