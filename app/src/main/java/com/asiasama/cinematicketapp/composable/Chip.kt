package com.asiasama.cinematicketapp.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Created by Asia sama on 7/2/2023.
 * sehunexo710@gmail.com
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Chip(onClick: () -> Unit, label: String, modifier: Modifier = Modifier) {
    AssistChip(
        onClick = onClick,
        label = { Text(text = label) },
        modifier = modifier.padding(horizontal = 4.dp),
        shape = ShapeDefaults.Large,
        border = AssistChipDefaults.assistChipBorder(
            borderColor =MaterialTheme.colorScheme.outlineVariant,
        ),
    )

}
