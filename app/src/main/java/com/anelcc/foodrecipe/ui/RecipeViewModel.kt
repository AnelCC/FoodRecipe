package com.anelcc.foodrecipe.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.anelcc.foodrecipe.data.DataSource
import com.anelcc.foodrecipe.data.Recipe

class RecipeViewModel : ViewModel() {
    var selectedRecipeData: Recipe? = null

    fun getData(): ArrayList<Recipe> {
        val data = DataSource.createDataSet()
        Log.d("anel", "getData: ${data.size} ")
        return data
    }

    fun setSelectedRecipe(recipe: Recipe) {
        selectedRecipeData = recipe
    }

    fun getRecipeSelected(): Recipe? {
        return selectedRecipeData
    }
}