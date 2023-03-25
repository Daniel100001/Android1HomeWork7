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
import com.example.android1homework7.data.MoviesModel


class MoviesDetailFragment : Fragment() {

    private var image: ImageView? = null
    private var text: TextView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies_detail, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        image = view.findViewById(R.id.Image_Detail_movies)
        text = view.findViewById(R.id.Text_Detail_movies)
        getData()
    }

    private fun getData() {
        val bundle = arguments
        if (bundle != null) {
            val dataModel = bundle.getSerializable("Dan") as MoviesModel
            image?.context?.let { Glide.with(it).load(dataModel.getImageUri()).into(image!!) }
            text?.setText(dataModel.detailMovies)
        }
    }
}