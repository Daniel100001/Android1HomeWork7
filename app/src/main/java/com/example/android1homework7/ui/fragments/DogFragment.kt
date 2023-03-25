package com.example.android1homework7.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android1homework7.R
import com.example.android1homework7.Repository.DogRepository
import com.example.android1homework7.data.DogModel
import com.example.android1homework7.databinding.FragmentDogBinding
import com.example.android1homework7.interfaces.OnItemClick
import com.example.android1homework7.ui.adapters.DogAdapter
import com.example.android1homework7.ui.fragmentsDetail.DogDetailFragment


class DogFragment : Fragment() , OnItemClick {

    private lateinit var bindind: FragmentDogBinding

    private var repository = DogRepository()
    private var dogAdapter = DogAdapter(this, repository.getLisOfDog())


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindind = FragmentDogBinding.inflate(inflater, container , false)
        return bindind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindind.recyclerViewFragmentDog
        initialization()

    }

    private fun initialization() {

        bindind.recyclerViewFragmentDog.layoutManager = LinearLayoutManager(
            requireContext(),
            RecyclerView.VERTICAL, false
        )
        bindind.recyclerViewFragmentDog.adapter = dogAdapter

    }

    override fun onShortClickForDog(dogModel: DogModel) {
        val bundle = Bundle()
        bundle.putSerializable("Dan", dogModel)
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, DogDetailFragment().javaClass, bundle)
            .addToBackStack(null)
            .commit()
    }
}

