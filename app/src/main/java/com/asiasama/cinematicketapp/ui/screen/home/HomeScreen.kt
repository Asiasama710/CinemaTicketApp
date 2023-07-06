package com.asiasama.cinematicketapp.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asiasama.cinematicketapp.R
import com.asiasama.cinematicketapp.data.Move
import com.asiasama.cinematicketapp.ui.composable.BottomNavigation
import com.asiasama.cinematicketapp.ui.composable.Chip
import com.asiasama.cinematicketapp.ui.composable.ImageCoverBackground
import com.asiasama.cinematicketapp.ui.composable.MoveDetails
import com.asiasama.cinematicketapp.ui.composable.MovePager
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Preview(showSystemUi = true)
@Composable
fun HomeContent() {

    val item = listOf(
        Move(
            title = "fantastic beasts",
            image = R.drawable.fantastic_beasts,
            showTime = "2h 30m",
            category = listOf("Dracula", "Fantasy", "Adventure")
        ),

        Move(
            title = "Fantastic beasts the secret of dumbledore ",
            image = R.drawable.fb3_poster_jude_law_full,
            showTime = "2h 30m",
            category = listOf("Action", "Adventure", "Drama")
        ),
        Move(
            title = "forefather richard coyle scaled",
            image = R.drawable.aberforth_richard_coyle_scaled,
            showTime = "1h 45m",
            category = listOf("Comedy", "Drama", "Romance")
        )
    )
    val pagerState = rememberPagerState(
        pageCount = item.size,
        initialOffscreenLimit = 2,
        infiniteLoop = true,
        initialPage = 1,
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            ImageCoverBackground(
                painter = painterResource(id = item[pagerState.currentPage].image),
                modifier = Modifier.blur(50.dp),
                color = Color.White
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Chip(
                        selectedColor = MaterialTheme.colorScheme.primary,
                        notSelectedColor = Transparent,
                        textOnUnselected = White,
                        text = stringResource(R.string.now_showing),
                        isSelected = true
                    )
                    Chip(
                        selectedColor = MaterialTheme.colorScheme.primary,
                        notSelectedColor = Transparent,
                        textOnUnselected = White,
                        text = stringResource(R.string.coming_soon),
                        isSelected = false
                    )
                }

                MovePager(
                    item = item,
                    pagerState = pagerState
                )
            }

        }
        Spacer(modifier = Modifier.height(24.dp))
        MoveDetails(
            showTime = item[pagerState.currentPage].showTime,
            title = item[pagerState.currentPage].title,
            category = item[pagerState.currentPage].category,
        )
        Spacer(modifier = Modifier.height(24.dp))
        BottomNavigation()
    }
}

