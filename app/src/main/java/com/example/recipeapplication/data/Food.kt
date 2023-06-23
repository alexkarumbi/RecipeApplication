package com.example.recipeapplication.data


data class Food(
    val id: Int,
    val title: String ,
    val category : String ,
    val cookingTime : String,
    val ingredients: String,
    val foodImageId:Int=0
    )