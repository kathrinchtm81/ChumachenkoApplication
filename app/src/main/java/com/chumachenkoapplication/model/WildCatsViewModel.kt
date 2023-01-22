package com.chumachenkoapplication.model

import androidx.lifecycle.ViewModel
import com.chumachenkoapplication.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class WildCatsViewModel: ViewModel() {
    val wildCats = MutableStateFlow<List<WildCat>>(emptyList())

    fun getById(id: String) = wildCats.value.first { wildCat -> wildCat.id ==id }

    init {
        wildCats.update {
            mutableListOf(
                WildCat(
                    id = "1",
                    name = "Ollie",
                    age = 3,
                    sex = "female",
                    type = "Ocelot",
                    personality = "Spotted Beauty",
                    photo = R.drawable.ocelot
                ),
                WildCat(
                    id = "2",
                    name = "Rex",
                    age = 2,
                    sex = "male",
                    type = "Black-Footed Cat",
                    personality = "Fierce Fighter",
                    photo = R.drawable.black_footed_cat
                ),
                WildCat(
                    id = "3",
                    name = "Tigger",
                    age = 11,
                    sex = "male",
                    type = "Snow Leopard",
                    personality = "Mountain Mystery",
                    photo = R.drawable.snow_leopard
                ),
                WildCat(
                    id = "4",
                    name = "Nala",
                    age = 4,
                    sex = "female",
                    type = "Fishing Cat",
                    personality = "Skilled Swimmer",
                    photo = R.drawable.fishing_cat
                ),
                WildCat(
                    id = "5",
                    name = "Morty",
                    age = 9,
                    sex = "male",
                    type = "Rusty-Spotted Cat",
                    personality = " Smallest of the Big Cat Breeds",
                    photo = R.drawable.rusty_spotted_cat
                ),
                WildCat(
                    id = "6",
                    name = "Timur",
                    age = 7,
                    sex = "male",
                    type = "Sand Cat",
                    personality = "Tiny Desert Dweller",
                    photo = R.drawable.sand_cat
                ),
                WildCat(
                    id = "7",
                    name = "Bob",
                    age = 2,
                    sex = "male",
                    type = "Caracal",
                    personality = "Exotic Beauty",
                    photo = R.drawable.caracal
                ),
                WildCat(
                    id = "8",
                    name = "Rick",
                    age = 16,
                    sex = "male",
                    type = "Pallas Cat",
                    personality = "Small and Fluffy",
                    photo = R.drawable.pallas_cat
                ),
                WildCat(
                    id = "9",
                    name = "Simba",
                    age = 10,
                    sex = "male",
                    type = "Jaguarundi",
                    personality = "Outstanding Jumper",
                    photo = R.drawable.jaguarundi
                ),
                WildCat(
                    id = "10",
                    name = "Lola",
                    age = 9,
                    sex = "female",
                    type = "Iberian Lynx",
                    personality = "Beautiful wild cat",
                    photo = R.drawable.iberian_lynx
                )
            )
        }
    }
}

