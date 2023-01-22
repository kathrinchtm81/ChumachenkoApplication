package com.chumachenkoapplication.ui.profile


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chumachenkoapplication.R
import com.chumachenkoapplication.model.WildCat
import com.chumachenkoapplication.ui.theme.ChumachenkoApplicationTheme

@Composable
fun Element(
    fieldName: String,
    fieldValue: String,
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier.fillMaxWidth()) {
        val padding = 20.dp
        Column(
            modifier
                .fillMaxWidth()
                .padding(
                    top = padding / 2,
                    start = padding,
                    end = padding,
                    bottom = padding / 2
                )
        ) {
            Text(
                text = fieldName,
                style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Light)
            )
            Text(
                text = fieldValue,
                style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.SemiBold)
            )
            Divider(
                color = Color.LightGray,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 1.dp,
                        end = 5.dp,
                        top = 1.dp,
                        bottom = 3.dp
                    )
            )
        }
    }
}

@Preview
@Composable
fun ElementPreview() {
    val wildCat = WildCat(
        id = "9",
        name = "Simba",
        age = 10,
        sex = "male",
        type = "Jaguarundi",
        personality = "Outstanding Jumper",
        photo = R.drawable.jaguarundi
    )

    ChumachenkoApplicationTheme {
        Surface {
            Element("Age(years)", wildCat.age.toString())
        }
    }
}