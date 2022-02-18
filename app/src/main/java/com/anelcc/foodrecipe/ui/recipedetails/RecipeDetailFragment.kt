package com.anelcc.foodrecipe.ui.recipedetails

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anelcc.foodrecipe.R
import com.anelcc.foodrecipe.databinding.RecipeDetailFragmentBinding
import com.anelcc.foodrecipe.databinding.RecipeFragmentBinding
import com.anelcc.foodrecipe.ui.RecipeViewModel
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

class RecipeDetailFragment : Fragment() {
    private lateinit var viewModel: RecipeViewModel
    private var _binding: RecipeDetailFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RecipeDetailFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(RecipeViewModel::class.java)

        loadSingleImage()
        binding.resizedImageDetails.setOnClickListener {
            loadSingleImageResized()
        }
        binding.errorImageDetails.setOnClickListener {
            errorHandler()
        }
        binding.holderImageDetails.setOnClickListener {
            holderSingleImage()
        }
    }

    private fun loadSingleImage() {
        viewModel.getRecipeSelected()?.let { recipe ->
            Glide.with(requireContext())
                .load(recipe.url_image)
                .into(binding.recipeImageDetail)
        }
    }

    private fun errorHandler() {
        binding.progressBar.visibility = View.VISIBLE

        viewModel.getRecipeSelected()?.let { recipe ->
            Glide.with(requireContext())
                .load(recipe.url_image)
                .listener(object : RequestListener<Drawable> {
                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: Target<Drawable>?,
                        isFirstResource: Boolean
                    ): Boolean {
                        binding.progressBar.visibility = View.GONE
                        return false
                    }

                    override fun onResourceReady(
                        resource: Drawable?,
                        model: Any?,
                        target: Target<Drawable>?,
                        dataSource: DataSource?,
                        isFirstResource: Boolean
                    ): Boolean {
                        binding.progressBar.visibility = View.GONE
                        return false
                    }

                })
                .into(binding.recipeImageDetail)
        }
    }

    private fun holderSingleImage() {
        viewModel.getRecipeSelected()?.let { recipe ->
            Glide.with(requireContext())
                .load(recipe.url_image)
                .override(1000, 1000)
                .fitCenter()
                .placeholder(R.drawable.ic_image_search)
                .error(R.drawable.ic_image_not_supported)
                .into(binding.recipeImageDetail)
        }
    }

    private fun loadSingleImageResized() {
        viewModel.getRecipeSelected()?.let { recipe ->
            Glide.with(requireContext())
                .load(recipe.url_image)
                .override(800, 300)
                .into(binding.recipeImageDetail)
        }
    }

}