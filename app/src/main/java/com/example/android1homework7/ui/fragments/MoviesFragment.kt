package com.example.android1homework7.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android1homework7.R
import com.example.android1homework7.Repository.CatRepository
import com.example.android1homework7.Repository.MoviesRepository
import com.example.android1homework7.data.CatModel
import com.example.android1homework7.data.MoviesModel
import com.example.android1homework7.interfaces.OnItemClickForCat
import com.example.android1homework7.interfaces.OnItemClickForMovies
import com.example.android1homework7.ui.adapters.CatAdapter
import com.example.android1homework7.ui.adapters.MoviesAdapter
import com.example.android1homework7.ui.fragmentsDetail.CatDetailFragment
import com.example.android1homework7.ui.fragmentsDetail.MoviesDetailFragment


class MoviesFragment : Fragment() , OnItemClickForMovies {

    private var recyclerView: RecyclerView? = null
    private var repository = MoviesRepository()
    private var moviesAdapter = MoviesAdapter(this, repository.getListOfMovies())


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recycler_view_fragment_movies)

        initialization()

    }

    private fun initialization() {

        recyclerView?.layoutManager = LinearLayoutManager(
            requireContext(),
            RecyclerView.VERTICAL, false
        )
        recyclerView?.adapter = moviesAdapter

    }

    override fun onShortClickForMovies(moviesModel: MoviesModel) {
        val bundle = Bundle()
        bundle.putSerializable("Dan", moviesModel)
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, MoviesDetailFragment().javaClass, bundle)
            .addToBackStack(null)
            .commit()
    }


}