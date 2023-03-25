package com.example.android1homework7.data

data class MoviesModel(
    val imageMovies: String? = null ,
    val nameMovies: String? = null,
    val detailMovies: String? = null
) : java.io.Serializable{
    fun getImageUri(): String? {
        return imageMovies
    }
}