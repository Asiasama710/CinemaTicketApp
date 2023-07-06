package com.asiasama.cinematicketapp.ui.screen.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.asiasama.cinematicketapp.R
import com.asiasama.cinematicketapp.ui.composable.ButtonClose
import com.asiasama.cinematicketapp.ui.composable.ButtonCustomise
import com.asiasama.cinematicketapp.ui.composable.ButtonPlay
import com.asiasama.cinematicketapp.ui.composable.Chip
import com.asiasama.cinematicketapp.ui.composable.CircleImage
import com.asiasama.cinematicketapp.ui.composable.ImageCover
import com.asiasama.cinematicketapp.ui.composable.LabelTime
import com.asiasama.cinematicketapp.ui.composable.TextLabel
import com.asiasama.cinematicketapp.ui.composable.Title


@Preview(showSystemUi = true)
@Composable
fun MoveDetailsScreen(
    viewModel: MoveDetailsViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()

    DetailsContent(state = state)

}

@Composable
private fun DetailsContent(
    state: MoveDetailsUiState ,
) {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .height(340.dp)
        ) {

            ImageCover(painter = painterResource(id = R.drawable.fantastic_beasts))
            ButtonPlay(modifier = Modifier.align(Alignment.Center), onClickPlay = { /*TODO*/ })

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 24.dp)
                    .align(Alignment.TopEnd),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                ButtonClose()
                LabelTime(
                    modifier = Modifier
                        .wrapContentSize()
                        .background(
                            shape = MaterialTheme.shapes.large,
                            color = White.copy(alpha = 0.4f)
                        )
                        .padding(4.dp),
                    time = stringResource(R.string._2h_45m),
                    textColor = White,
                    IconColor = White.copy(alpha = 0.5f)
                )
            }
        }
        Box(modifier = Modifier.align(Alignment.BottomCenter)) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp)
                    .background(
                        shape = AbsoluteRoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp),
                        color = Color.White
                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp, bottom = 8.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextLabel(rate = stringResource(R.string._6_8_10)   , label = stringResource(R.string.imdb))
                    TextLabel(rate = stringResource(R.string._63), label = stringResource(R.string.rotten_tomatoes))
                    TextLabel(rate = stringResource(R.string._4_10), label = stringResource(R.string.ign))
                }

                Title(
                    text = stringResource(R.string.fantastic_beasts_the_secret_of_dumbledore),
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Chip(text = stringResource(R.string.action))
                    Chip(text = stringResource(R.string.action))
                    Chip(text = stringResource(R.string.action))
                }

                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    contentPadding = PaddingValues(horizontal = 16.dp,),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)

                ) {

                    items(state.actor) {
                        CircleImage(painter = painterResource(id = it))
                    }
                }
                Text(
                    text = stringResource(R.string.descption_of_film),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                        .padding(horizontal = 24.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.DarkGray
                )

                ButtonCustomise(text = stringResource(R.string.booking),
                    onClick = { /*TODO*/ },
                    icon = R.drawable.ic_bookinng,
                    modifier = Modifier
                        .wrapContentSize()
                        .weight(1f)
                        .align(Alignment.CenterHorizontally)
                )

            }
        }


    }
}

