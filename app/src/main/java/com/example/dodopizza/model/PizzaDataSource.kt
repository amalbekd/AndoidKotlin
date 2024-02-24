package com.example.dodopizza.model

import com.example.dodopizza.R

object PizzaDataSource {
    val pizzaList = arrayListOf<Pizza>(
        Pizza(
            imageRes = R.drawable.img_peperoni,
            title = "Пепперони с грибами",
            description = "Пикантная пепперони, моцарелла, шампиньоны, соус альфредо",
            price = 2000
        ),
        Pizza(
            imageRes = R.drawable.wowkebab_pizza,
            title = "Вау! Кебаб",
            description = "Мясо говядины, соус ранч, сыр моцарелла, сладкий перец, томаты, красный лук и фирменный томатный соус",
            price = 2900
        ),
        Pizza(
            imageRes = R.drawable.naruto_pizza,
            title = "Наруто Пицца",
            description = "Куриные кусочки, соус терияки, ананасы, моцарелла, фирменный соус альфредо",
            price = 3900
        ),
        Pizza(
            imageRes = R.drawable.chesee_pizza,
            title = "Сырная",
            description = "Моцарелла, сыры чеддер и пармезан, соус альфредо",
            price = 1900
        )
    )
}