package com.chumachenkoapplication.ui.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chumachenkoapplication.ui.theme.ChumachenkoApplicationTheme

@Composable
fun RoundedHeader(title: String) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color(red = 185, green = 173, blue = 85, alpha = 255)),
        tonalElevation = 0.dp,
        shape = RoundedCornerShape(
            topStartPercent = 50,
            topEndPercent = 50,
            bottomEndPercent = 0,
            bottomStartPercent = 0
        )
    ) {
        val paddingValues = 16.dp
        Text(
            text = title,
            modifier = Modifier
                .padding(
                start = paddingValues,
                top = paddingValues,
                end = paddingValues
            )
                .fillMaxWidth(),
            style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Medium)
        )
    }
}

@Preview
@Composable
fun RoundedHeaderPreview() {
    ChumachenkoApplicationTheme() {
        RoundedHeader(title = "Header")
    }
}