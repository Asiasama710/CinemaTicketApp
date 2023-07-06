package com.asiasama.cinematicketapp.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.asiasama.cinematicketapp.R

/**
 * Created by Asia sama on 7/6/2023.
 * sehunexo710@gmail.com
 */
@Composable
fun LabelTime(modifier: Modifier = Modifier, time: String, textColor: Color, IconColor: Color) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_clock),
            contentDescription = null,
            modifier = Modifier.size(16.dp),
            tint = IconColor
        )
        Text(
            text = time,
            color =textColor,
            modifier = Modifier.padding(start = 4.dp)
        )
    }
}