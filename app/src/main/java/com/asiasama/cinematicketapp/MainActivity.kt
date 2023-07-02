package com.asiasama.cinematicketapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asiasama.cinematicketapp.composable.ButtonPlay
import com.asiasama.cinematicketapp.composable.Chip
import com.asiasama.cinematicketapp.composable.CircleImage
import com.asiasama.cinematicketapp.composable.ImageCover
import com.asiasama.cinematicketapp.composable.TextLabel
import com.asiasama.cinematicketapp.composable.Title
import com.asiasama.cinematicketapp.ui.theme.CinemaTicketAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            CinemaTicketAppTheme {
                Scaffold(

                ) {
                    HomeContent()

                }
            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeContent() {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .height(340.dp)
        ) {

            ImageCover(painter = painterResource(id = R.drawable.film_cover))
            ButtonPlay(modifier = Modifier.align(Alignment.Center), onClickPlay = { /*TODO*/ })

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 24.dp)
                    .align(Alignment.TopEnd),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .wrapContentSize()
                        .background(
                            shape = CircleShape,
                            color = Color.White.copy(alpha = 0.3f)
                        )
                        .padding(4.dp)

                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_close),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                        tint = Color.White
                    )
                }
                Row(
                    modifier = Modifier
                        .wrapContentSize()
                        .background(
                            shape = MaterialTheme.shapes.large,
                            color = Color.White.copy(alpha = 0.4f)
                        )
                        .padding(4.dp),
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_clock),
                        contentDescription = null,
                        modifier = Modifier.size(16.dp),
                        tint = Color.White.copy(alpha = 0.5f)
                    )
                    Text(text = "2h 45m", color = Color.White, modifier = Modifier.padding(start = 4.dp))

                }
            }
        }
        Box(modifier = Modifier.align(Alignment.BottomCenter)) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp)
                    .background(
                        shape = AbsoluteRoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp),
                        color = Color.White
                    )
            ) {
                Column(modifier = Modifier.wrapContentSize()) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 24.dp, bottom = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        TextLabel(rate = "6.8/10", label = "IMDB")
                        TextLabel(rate = "63%", label = "Rotten Tomatoes")
                        TextLabel(rate = "4/10", label = "IGN")
                    }

                    Title(
                        text = "Fantastic Beasts :The Secret of Dumbledore",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Chip({ /*TODO*/ }, label = "Action")
                        Chip({ /*TODO*/ }, label = "Action")
                        Chip({ /*TODO*/ }, label = "Action")

                    }

                    val actor = listOf(
                        R.drawable.film_cover,
                        R.drawable.film_cover,
                        R.drawable.film_cover,
                        R.drawable.film_cover,
                        R.drawable.film_cover,
                        R.drawable.film_cover,
                        R.drawable.film_cover,
                        R.drawable.film_cover,
                        R.drawable.film_cover,
                        R.drawable.film_cover,
                        R.drawable.film_cover,
                    )
                    LazyRow(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        contentPadding = PaddingValues(
                            start = 16.dp,
                            end = 16.dp,
                        ),
                        horizontalArrangement = Arrangement.spacedBy(4.dp)

                    ) {

                        items(actor) {
                            CircleImage(painter = painterResource(id = it))
                        }

                    }
                    Text(
                        text = "Professor Albus Dumbledore knows the powerful. dark wizard Gellert Grindelwald is moving to selze control of the wizarding world. Unable to stop him…",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp, start = 24.dp, end = 24.dp),
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .wrapContentSize()
                            .weight(1f)
                            .align(Alignment.CenterHorizontally),
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_bookinng),
                            contentDescription = null
                        )
                        Text(text = "Booking", modifier = Modifier.padding(start = 8.dp))
                    }

                }
            }

        }
    }
}
