package com.asiasama.cinematicketapp.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asiasama.cinematicketapp.R


@Composable
@Preview
fun RectShape() {
    Box(contentAlignment = Alignment.Center) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .shadow(
                    elevation = 12.dp,
                    ambientColor = colorResource(id = R.color.black),
                    spotColor = MaterialTheme.colorScheme.onBackground
                )
                .background(
                    color = MaterialTheme.colorScheme.onBackground,
                    shape = AbsoluteRoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp)
                )
        )

    }
}

