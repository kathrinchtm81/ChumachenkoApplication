package com.chumachenkoapplication.ui.profile


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.chumachenkoapplication.R
import com.chumachenkoapplication.model.WildCat
import com.chumachenkoapplication.ui.theme.ChumachenkoApplicationTheme


@Composable
fun WildCatProfile(
    wildCat: WildCat,
    modifier: Modifier = Modifier,
) {
    Surface(modifier = modifier.fillMaxSize()) {
        LazyColumn() {
            item { RoundedHeader(photo = wildCat.photo) }
            item {
                Text(
                    text = wildCat.name,
                    style = MaterialTheme.typography.displayLarge.copy(fontWeight = FontWeight.Medium),
                    modifier = modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            item { Element("Breed", wildCat.type) }
            item { Element("Age(month)", wildCat.age.toString()) }
            item { Element("Sex", wildCat.sex) }
            item { Element("Personality", wildCat.personality) }
            item {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom,
                ) {
                    Button(onClick = { }) {
                        Text(text = "Help our Zoo",
                        style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Normal))
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun WildCatProfilePreview() {
    val wildCat = WildCat(
        id = "1",
        name = "Ollie",
        age = 6,
        sex = "female",
        type = "Ocelot",
        personality = "Spotted Beauty",
        photo = R.drawable.ocelot
    )
    ChumachenkoApplicationTheme() {
        WildCatProfile(wildCat = wildCat)
    }
}
