package com.anelcc.foodrecipe.ui.recipelist

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.anelcc.foodrecipe.R
import com.anelcc.foodrecipe.data.Recipe
import com.anelcc.foodrecipe.databinding.RecipeFragmentBinding
import com.anelcc.foodrecipe.ui.RecipeViewModel
import com.anelcc.foodrecipe.ui.SelectedRecipe

class RecipeFragment : Fragment(), SelectedRecipe {

    private var _binding: RecipeFragmentBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!
    private lateinit var recipeAdapter: RecipeRecyclerAdapter
    private lateinit var viewModel: RecipeViewModel
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RecipeFragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(RecipeViewModel::class.java)
        viewModel.getData()

        navController = Navigation.findNavController(requireActivity(), R.id.nav_host)
        binding.recipeList.apply {
            layoutManager = LinearLayoutManager(context)
            recipeAdapter = RecipeRecyclerAdapter(viewModel.getData(), this@RecipeFragment)
            adapter = recipeAdapter
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onSelectedRecipe(recipe: Recipe) {
        viewModel.setSelectedRecipe(recipe)
        navController.navigate(R.id.goFromMainFragmentToRecipeDetails)
    }
}