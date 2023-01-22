package com.chumachenkoapplication.ui.list

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.chumachenkoapplication.ui.theme.ChumachenkoApplicationTheme

@Composable
fun ListHeader() {
    Surface(
        color = MaterialTheme.colorScheme.onSurface,
        contentColor = MaterialTheme.colorScheme.surface
    ) {
        Column {
            RoundedHeader(title = "Wild Cats in our Zoo")
        }
    }
}

@Preview
@Composable
fun ListHeaderPreview() {
    ChumachenkoApplicationTheme() {
        ListHeader()
    }
}

