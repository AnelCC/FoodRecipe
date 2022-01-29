package com.anelcc.foodrecipe.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.anelcc.foodrecipe.data.DataSource

class RecipeViewModel : ViewModel() {



    fun getData(){
        val data = DataSource.createDataSet()
        Log.d("anel", "getData: ${data.size} ")
    }

}