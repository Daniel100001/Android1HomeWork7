package com.example.android1homework7.data

data class DogModel(
    val imageDog: String? = null ,
    val nameDog: String? = null,
    val detailDog: String? = null
) : java.io.Serializable{
    fun getImageUri(): String? {
        return imageDog
    }
}