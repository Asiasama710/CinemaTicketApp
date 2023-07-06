package com.asiasama.cinematicketapp.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.asiasama.cinematicketapp.R


@Composable
fun NavigationIcon(icon: Int, isSelected: Boolean, modifier: Modifier = Modifier) {
    IconButton(
        onClick = {},
        modifier = modifier.background(
            shape = MaterialTheme.shapes.extraLarge,
            color = if (isSelected) MaterialTheme.colorScheme.primary else Color.White
        )

    ) {
        Icon(
            painter= painterResource(id =icon),
            contentDescription = null,
            tint = if (isSelected) Color.White else Color.DarkGray
        )
    }
}

@Preview
@Composable
fun BottomNavigation() {
    Box(
        modifier = Modifier
            .background(color = Color.White)
            .wrapContentSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            NavigationIcon(
                icon = R.drawable.ic_home,
                isSelected = true,
            )
            NavigationIcon(
                icon = R.drawable.ic_search,
                isSelected = false,
            )
            IconWithCount(
                icon = R.drawable.ic_ticket,
                count = 2,
                isSelected = false,
            )
            NavigationIcon(
                icon = R.drawable.ic_profile,
                isSelected = false,
            )
        }
    }
}