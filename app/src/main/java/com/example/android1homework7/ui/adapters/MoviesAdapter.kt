package com.example.android1homework7.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android1homework7.R
import com.example.android1homework7.data.MoviesModel
import com.example.android1homework7.databinding.AnimalItemBinding
import com.example.android1homework7.interfaces.OnItemClickForCat
import com.example.android1homework7.interfaces.OnItemClickForMovies

class MoviesAdapter(private val onItemClick: OnItemClickForMovies,
                 private var listModel: MutableList<MoviesModel>) : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {


    inner class MoviesViewHolder(private val binding: AnimalItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(moviesModel: MoviesModel) {
            binding.imageRecyclerview.let {
                Glide.with(it).load(moviesModel.imageMovies).into(binding.imageRecyclerview)}
            binding.textviewRecyclerview.text = moviesModel.nameMovies
            itemView.setOnClickListener(View.OnClickListener {
                onItemClick.onShortClickForMovies(moviesModel)
            })
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AnimalItemBinding.inflate(inflater, parent, false)
        return MoviesViewHolder(binding)    }

    override fun getItemCount(): Int = listModel.size

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.onBind(listModel[position])    }
}
