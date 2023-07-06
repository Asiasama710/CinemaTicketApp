package com.asiasama.cinematicketapp.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asiasama.cinematicketapp.R

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

@Preview
@Composable
fun ButtonClose(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .wrapContentSize()
            .background(shape = CircleShape, color = Color.White.copy(alpha = 0.3f))
            .padding(4.dp)

    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_close),
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = Color.White
        )
    }
}


@Composable
fun ButtonCustomise(icon: Int = 0,text:String,onClick: () -> Unit,modifier: Modifier=Modifier) {
    Button(
        onClick = onClick,
        modifier = modifier.wrapContentSize()

    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null
        )
        Text(text = text, modifier = Modifier.padding(start = 8.dp))
    }
}