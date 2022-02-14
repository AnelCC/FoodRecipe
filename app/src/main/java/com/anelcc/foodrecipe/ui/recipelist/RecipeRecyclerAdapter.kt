package com.anelcc.foodrecipe.ui.recipelist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.anelcc.foodrecipe.R
import com.anelcc.foodrecipe.data.Recipe
import com.anelcc.foodrecipe.ui.SelectedRecipe
import com.bumptech.glide.Glide

class RecipeRecyclerAdapter(val recipeList: List<Recipe>, val selectedRecipe: SelectedRecipe) : RecyclerView.Adapter<RecipeRecyclerAdapter.ViewHolder>() {
    private val TAG: String = "RecipeRecyclerAdapter"


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recipe_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recipe = recipeList[position]
        with(holder) {
            recipeTitle?.let {
                it.text = recipe.title
            }
            recipeAuthor?.let {
                it.text = recipe.description
            }

            Glide.with(itemView.context).load(recipe.url_image).into(recipeImage)
            holder.recipeImage.setOnClickListener {
                selectedRecipe.onSelectedRecipe(recipe)
            }
        }
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }


    inner class ViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val recipeImage = itemView.findViewById<ImageView>(R.id.recipe_image)
        val recipeTitle =  itemView.findViewById<TextView>(R.id.recipe_title)
        val recipeAuthor =  itemView.findViewById<TextView>(R.id.recipe_author)
    }
}
