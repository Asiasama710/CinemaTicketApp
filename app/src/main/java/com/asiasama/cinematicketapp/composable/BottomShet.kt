package com.asiasama.cinematicketapp.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Created by Asia sama on 7/2/2023.
 * sehunexo710@gmail.com
 */
@Preview
@Composable
fun BottomSheet(modifier: Modifier = Modifier) {
    Card(shape = AbsoluteRoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)


    ) {

    }

}