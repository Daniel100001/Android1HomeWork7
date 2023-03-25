package com.example.android1homework7.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android1homework7.R
import com.example.android1homework7.data.DogModel
import com.example.android1homework7.databinding.AnimalItemBinding
import com.example.android1homework7.interfaces.OnItemClick

class DogAdapter(private val onItemClick: OnItemClick,
                 private var listModel: MutableList<DogModel>) : RecyclerView.Adapter<DogAdapter.DogViewHolder>() {


    inner class DogViewHolder(private val binding: AnimalItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(dogModel: DogModel) {
            binding.imageRecyclerview.let {
                Glide.with(it).load(dogModel.imageDog).into(binding.imageRecyclerview)
            }
            binding.textviewRecyclerview.text = dogModel.nameDog
            itemView.setOnClickListener(View.OnClickListener {
                onItemClick.onShortClickForDog(dogModel)
            })
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AnimalItemBinding.inflate(inflater, parent, false)
        return DogViewHolder(binding)    }

    override fun getItemCount(): Int = listModel.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.onBind(listModel[position])    }
}
