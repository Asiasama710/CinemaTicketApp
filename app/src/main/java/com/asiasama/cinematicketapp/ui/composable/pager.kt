package com.asiasama.cinematicketapp.ui.composable

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asiasama.cinematicketapp.data.Move
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlin.math.absoluteValue


@DelicateCoroutinesApi
@ExperimentalPagerApi
@Composable
fun MovePager(
    item: List<Move>,
    pagerState: PagerState,
    modifier: Modifier = Modifier,
) {
    HorizontalPager(
        state = pagerState,
        modifier = modifier
            .fillMaxWidth()
            .height(320.dp)
            .padding(top = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        itemSpacing = 16.dp
    ) { page ->
        val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
        val imageSize by animateFloatAsState(
            targetValue = if (pageOffset != 0.0f) 0.96f else 1.1f,
            animationSpec = tween(100),
        )
        Card(
            modifier = Modifier
                .width(220.dp)
                .graphicsLayer {
                      alpha = 0.8f + (1f - pageOffset.coerceIn(0f, 1f)) * 0.8f
                    scaleX = imageSize
                    scaleY = imageSize

                },
            shape = MaterialTheme.shapes.extraLarge,
        ) {
            Image(
                painter = painterResource(id = item[page].image),
                contentDescription = item[page].title,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
    }
}
