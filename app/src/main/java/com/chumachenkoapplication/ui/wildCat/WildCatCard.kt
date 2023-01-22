package com.chumachenkoapplication.ui.wildCat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chumachenkoapplication.model.WildCat
import com.chumachenkoapplication.ui.theme.ChumachenkoApplicationTheme
import com.chumachenkoapplication.R

@Composable
fun WildCatCard(
    wildCat: WildCat,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val padding = 12.dp
    val color = Color(red = 240, green = 239, blue = 150, alpha = 191)
    Column(
        modifier
            .clickable(onClick = onClick)
            .padding(
                top = padding / 2,
                start = padding ,
                end = padding ,
                bottom = padding / 2
            )
            .fillMaxWidth()
            .background(
                color,
                shape = RoundedCornerShape(10.dp)
            )
            .border(
                width = 1.dp,
                color,
                shape = RoundedCornerShape(10.dp)
            )

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .fillMaxWidth(10f)
                .height(100.dp)
        ) {
            Image(
                painter = painterResource(id = wildCat.photo),
                contentDescription = "Photo",
                modifier
                    .size(90.dp)
                    .padding(
                        top = 2.dp,
                        start = 6.dp,
                        end = 0.dp,
                        bottom = 2.dp
                    )
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.size(padding))
            Column {
                Text(
                    text = wildCat.name,
                    style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Medium)
                )
                Text(
                    text = wildCat.type,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.Light,
                        color = Color.DarkGray
                    ),
                    modifier = Modifier.padding(2.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun WildCatCardPreview() {
    val wildCat = WildCat(
        id = "1",
        name = "Ollie",
        age = 6,
        sex = "female",
        type = "Ocelot",
        personality = "Spotted Beauty",
        photo = R.drawable.ocelot
    )

    ChumachenkoApplicationTheme {
        Surface {
            WildCatCard(wildCat, {})
        }
    }
}
