package com.chumachenkoapplication.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chumachenkoapplication.model.WildCatsViewModel
import com.chumachenkoapplication.ui.theme.ChumachenkoApplicationTheme
import com.chumachenkoapplication.ui.list.List
import com.chumachenkoapplication.ui.profile.WildCatProfile

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: WildCatsViewModel by viewModels()
        setContent {
            ChumachenkoApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen(viewModel)
                }
            }
        }
    }
}

@Composable
fun MainScreen(viewModel: WildCatsViewModel) {
    val state by viewModel.wildCats.collectAsState()
    var selectedId by remember {
        mutableStateOf<String?>(value = null)
    }
    Crossfade(targetState = selectedId) { id ->
        if (id == null) {
            List(wildCats = state, onSelected = { wildCat ->
                selectedId = wildCat.id
            })
        } else {
            WildCatProfile(
                wildCat = viewModel.getById(id),
            )
            BackHandler() {
                selectedId = null
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ChumachenkoApplicationTheme {
        MainScreen(WildCatsViewModel())
    }
}
