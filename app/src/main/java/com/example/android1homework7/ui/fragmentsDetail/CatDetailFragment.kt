package com.example.android1homework7.ui.fragmentsDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.android1homework7.R
import com.example.android1homework7.data.CatModel
import com.example.android1homework7.data.MoviesModel
import com.example.android1homework7.databinding.FragmentCatDetailBinding


class CatDetailFragment : Fragment() {

    private lateinit var binding: FragmentCatDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCatDetailBinding.inflate(inflater,container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        val bundle = arguments
        if (bundle != null) {
            val moviesModelFake = bundle.getSerializable("Dan") as CatModel
            binding.ImageDetailCat.context?.let { Glide.with(it).load(moviesModelFake.getImageUri()).into(binding.ImageDetailCat) }
            binding.TextDetailCat.text = moviesModelFake.detailCat
        }
    }
}