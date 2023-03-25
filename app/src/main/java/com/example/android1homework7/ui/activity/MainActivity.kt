package com.example.android1homework7.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import com.example.android1homework7.R
import com.example.android1homework7.ui.fragments.CatFragment
import com.example.android1homework7.ui.fragments.DogFragment
import com.example.android1homework7.ui.fragments.MoviesFragment
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dog_button: MaterialButton? = null
        var cat_button: MaterialButton? = null
        var movies_button : MaterialButton? = null

        dog_button = findViewById(R.id.button_dog)
        cat_button = findViewById(R.id.button_cats)
        movies_button = findViewById(R.id.button_movies)

        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, DogFragment())
            .commit()

        dog_button.setOnClickListener(View.OnClickListener {

            val fragment = supportFragmentManager
            fragment.beginTransaction()
                .replace(R.id.fragment_container_view, DogFragment())
                .commit()
        })

        cat_button.setOnClickListener(View.OnClickListener {

            val fragment = supportFragmentManager
            fragment.beginTransaction()
                .replace(R.id.fragment_container_view, CatFragment())
                .commit()
        })

        movies_button.setOnClickListener(View.OnClickListener {

            val fragment = supportFragmentManager
            fragment.beginTransaction()
                .replace(R.id.fragment_container_view, MoviesFragment())
                .commit()
        })

    }
    }
