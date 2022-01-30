package com.anelcc.foodrecipe.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.anelcc.foodrecipe.databinding.RecipeFragmentBinding

class RecipeFragment : Fragment() {

    private var _binding: RecipeFragmentBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    private lateinit var recipeAdapter: RecipeRecyclerAdapter

    companion object {
        fun newInstance() = RecipeFragment()
    }

    private lateinit var viewModel: RecipeViewModel

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
        viewModel = ViewModelProvider(this).get(RecipeViewModel::class.java)
        // TODO: Use the ViewModel
        viewModel.getData()

        binding.recipeList.apply {
            layoutManager = LinearLayoutManager(context)
            recipeAdapter = RecipeRecyclerAdapter(viewModel.getData())
            adapter = recipeAdapter
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}