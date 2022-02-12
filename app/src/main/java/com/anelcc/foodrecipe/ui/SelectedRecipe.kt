package com.anelcc.foodrecipe.ui

import com.anelcc.foodrecipe.data.Recipe

interface SelectedRecipe {
    fun onSelectedRecipe(recipe: Recipe)
}