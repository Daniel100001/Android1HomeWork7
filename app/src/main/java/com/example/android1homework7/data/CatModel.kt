package com.example.android1homework7.data

data class CatModel(
    val imageCat: String? = null ,
    val nameCat: String? = null,
    val detailCat: String? = null
) : java.io.Serializable{
    fun getImageUri(): String? {
        return imageCat
    }
}