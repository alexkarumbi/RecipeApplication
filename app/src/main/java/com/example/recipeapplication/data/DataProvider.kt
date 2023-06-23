package com.example.recipeapplication.data

import com.example.recipeapplication.R

object DataProvider{
    val food =
        Food(
            id = 1,
            title = "StrawberryCake",
            category = "Dessert",
            cookingTime = "40 Minutes",
            ingredients = "Flour,Eggs,Salt,Yeast,",
            foodImageId = R.drawable.strawberrycake
        )

    val foodList = listOf(
        food,
        Food(
            id = 2,
            title = "StrawberryCake",
            category = "Dessert",
            cookingTime = "40 Minutes",
            ingredients = "Flour,Eggs,Salt,Yeast,",
            foodImageId = R.drawable.strawberrycake
        ),
        Food(
            id = 3,
            title = "StrawberryCake",
            category = "Dessert",
            cookingTime = "40 Minutes",
            ingredients = "Flour,Eggs,Salt,Yeast,",
            foodImageId = R.drawable.strawberrycake
        ),
        Food(
            id = 4,
            title = "StrawberryCake",
            category = "Dessert",
            cookingTime = "40 Minutes",
            ingredients = "Flour,Eggs,Salt,Yeast,",
            foodImageId = R.drawable.strawberrycake
        )
    )
}