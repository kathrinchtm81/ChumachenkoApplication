package com.chumachenkoapplication.ui.profile


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chumachenkoapplication.R
import com.chumachenkoapplication.ui.theme.ChumachenkoApplicationTheme

@Composable
fun RoundedHeader(photo: Int) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp),
        shape = RoundedCornerShape(
            bottomEndPercent = 5,
            bottomStartPercent = 5
        )
    ) {
        Image(
            alignment = Alignment.TopCenter,
            contentDescription = "Photo",
            contentScale = ContentScale.Crop,
            painter = painterResource(id = photo),
        )
    }
}

@Preview
@Composable
fun RoundedHeaderPreview() {
    ChumachenkoApplicationTheme() {
        RoundedHeader(photo = R.drawable.caracal)
    }
}
