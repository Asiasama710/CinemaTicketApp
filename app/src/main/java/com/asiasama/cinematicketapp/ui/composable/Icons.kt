package com.asiasama.cinematicketapp.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex

/**
 * Created by Asia sama on 7/6/2023.
 * sehunexo710@gmail.com
 */


@Composable
fun IconWithCount(
    count: Int,
    icon: Int,
    isSelected: Boolean,
) {
    if (count > 0) {
        Box {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(color = MaterialTheme.colorScheme.primary)
                    .zIndex(1f)
                    .size(14.dp)
                    .align(alignment = Alignment.CenterEnd)
            ) {
                Text(
                    modifier = Modifier.fillMaxSize(),
                    text = count.toString(),
                    textAlign = TextAlign.Center,
                    color = Color.White.copy(alpha = 0.8f),
                    fontWeight = FontWeight.Bold,
                    fontSize = 8.sp
                )
            }
            Spacer(modifier = Modifier.padding(start = 4.dp))
            NavigationIcon(icon = icon, isSelected = isSelected)
        }
    } else {
        NavigationIcon(icon = icon, isSelected = isSelected)
    }

}
