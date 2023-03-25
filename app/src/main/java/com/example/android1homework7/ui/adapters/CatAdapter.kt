package com.example.android1homework7.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android1homework7.R
import com.example.android1homework7.data.CatModel
import com.example.android1homework7.data.MoviesModel
import com.example.android1homework7.databinding.AnimalItemBinding
import com.example.android1homework7.interfaces.OnItemClickForCat

class CatAdapter(private val onItemClick: OnItemClickForCat,
                 private var listModel: MutableList<CatModel>) : RecyclerView.Adapter<CatAdapter.CatViewHolder>() {

    inner class CatViewHolder(private val binding: AnimalItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(catModel: CatModel) {
            Glide.with(binding.imageRecyclerview).load(catModel.imageCat).into(binding.imageRecyclerview)
            binding.textviewRecyclerview.text = catModel.nameCat
            itemView.setOnClickListener {
                onItemClick.onShortClickForCat(catModel)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AnimalItemBinding.inflate(inflater, parent, false)
        return CatViewHolder(binding)
    }

    override fun getItemCount(): Int = listModel.size

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.onBind(listModel[position])
    }
}