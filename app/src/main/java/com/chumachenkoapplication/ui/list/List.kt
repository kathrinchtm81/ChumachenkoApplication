package com.chumachenkoapplication.ui.list


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.items
import com.chumachenkoapplication.R
import com.chumachenkoapplication.model.WildCat
import com.chumachenkoapplication.ui.theme.ChumachenkoApplicationTheme
import com.chumachenkoapplication.ui.wildCat.WildCatCard

@Composable
fun List(
    wildCats: List<WildCat>,
    onSelected: (WildCat) -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier.fillMaxSize()) {
        LazyColumn() {
            item { ListHeader() }
            items(wildCats) { wildCat ->
                WildCatCard(wildCat = wildCat, onClick = { onSelected(wildCat) })
            }
        }
    }
}

@Preview
@Composable
fun ListPreview() {
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
        List(wildCats = listOf(wildCat), onSelected = {})
    }
}
