package com.asiasama.cinematicketapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.asiasama.cinematicketapp.ui.composable.BottomNavigation
import com.asiasama.cinematicketapp.ui.screen.home.HomeContent
import com.asiasama.cinematicketapp.ui.screen.ticket.TicketContent
import com.asiasama.cinematicketapp.ui.theme.CinemaTicketAppTheme
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class, ExperimentalPagerApi::class)
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

