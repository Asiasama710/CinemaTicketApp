package com.asiasama.cinematicketapp.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun ImageCover(painter: Painter, modifier: Modifier = Modifier) {

    Image(
        modifier = modifier
            .fillMaxWidth(),
        painter = painter,
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}

@Composable
fun ImageCoverBackground(
    painter: Painter, modifier: Modifier = Modifier,color: Color
) {

    Box(modifier = Modifier.background(Color.White),) {
        Image(
            modifier = modifier
                .height(400.dp)
                .fillMaxWidth(),
            painter =painter,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .height(400.dp)
                .fillMaxWidth()
                .zIndex(1f)
                .background(
                    Brush.verticalGradient(
                        listOf(Color.Transparent, color),
                        tileMode = TileMode.Mirror
                    )
                )
        )


    }
}


@Composable
fun ImageTicket(
    modifier: Modifier = Modifier,
    color: Color,
    painter: Painter,
) {
    Box {
        Image(
            modifier = modifier
                .fillMaxWidth()
                .height(100.dp),
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Box(modifier = Modifier.backgroundHorizontalGradient(color, Modifier.height(100.dp)))
    }
}


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

@Stable
fun Modifier.backgroundHorizontalGradient(
    color: Color = Color.White.copy(alpha = 0.8f),
    modifier: Modifier = Modifier,
) = then(
    modifier
        .fillMaxWidth()
        .zIndex(1f)
        .background(
            Brush.horizontalGradient(
                listOf(color, Color.Transparent, color),
            )
        )
)
