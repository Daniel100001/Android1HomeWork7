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
import com.example.android1homework7.data.DogModel
import com.example.android1homework7.databinding.FragmentDogDetailBinding


class DogDetailFragment : Fragment() {

    private lateinit var binding: FragmentDogDetailBinding

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            binding = FragmentDogDetailBinding.inflate(inflater, container, false)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            getData()
        }

        private fun getData() {
            val bundle = arguments
            if (bundle != null) {
                val dataModel = bundle.getSerializable("Dan") as DogModel
                binding.ImageDetailDog.context?.let { Glide.with(it).load(dataModel.getImageUri()).into(binding.ImageDetailDog) }
                binding.TextDetailDog.text = dataModel.detailDog
            }
        }
    }