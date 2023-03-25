package com.example.android1homework7.Repository

import com.example.android1homework7.data.DogModel

class DogRepository {
    private val address: String = "https://http.dog/"
    private val dogModelList = mutableListOf<DogModel>()

    fun getLisOfDog() : MutableList<DogModel>{
        dogModelList.add(DogModel("${address}100.jpg", "Continue", "Cам виноват"))
        dogModelList.add(DogModel("${address}101.jpg", "Switching Protocols", "Cам виноват"))
        dogModelList.add(DogModel("${address}102.jpg", "Processing", "Cам виноват"))
        dogModelList.add(DogModel("${address}103.jpg", "Early Hints", "Cам виноват"))
        dogModelList.add(DogModel("${address}200.jpg", "Ok", "Cам виноват"))
        dogModelList.add(DogModel("${address}201.jpg", "Created", "Cам виноват"))
        dogModelList.add(DogModel("${address}202.jpg", "Accepted", "Cам виноват"))
        dogModelList.add(DogModel("${address}203.jpg", "Non-Authoritative", "Cам виноват"))
        dogModelList.add(DogModel("${address}204.jpg", "No Content", "Cам виноват"))
        dogModelList.add(DogModel("${address}206.jpg", "Partial Content", "Cам виноват"))
        dogModelList.add(DogModel("${address}207.jpg", "Multi-Status", "Cам виноват"))
        dogModelList.add(DogModel("${address}300.jpg", "Multiple Choices", "Cам виноват"))
        dogModelList.add(DogModel("${address}301.jpg", "Moved Permanently", "Cам виноват"))
        dogModelList.add(DogModel("${address}302.jpg", "Found", "Cам виноват"))
        dogModelList.add(DogModel("${address}303.jpg", "See Other", "Cам виноват"))
        dogModelList.add(DogModel("${address}304.jpg", "Not Modified", "Cам виноват"))
        dogModelList.add(DogModel("${address}305.jpg", "Use Proxy", "Cам виноват"))
        dogModelList.add(DogModel("${address}307.jpg", "Temporary Redirect", "Cам виноват"))
        dogModelList.add(DogModel("${address}308.jpg", "Permanent Redirect", "Cам виноват"))
        dogModelList.add(DogModel("${address}400.jpg", "Bad Request", "Cам виноват"))
        dogModelList.add(DogModel("${address}401.jpg", "Unauthorized", "Cам виноват"))
        dogModelList.add(DogModel("${address}402.jpg", "Payment Required", "Cам виноват"))
        dogModelList.add(DogModel("${address}403.jpg", "Forbidden", "Cам виноват"))
        dogModelList.add(DogModel("${address}404.jpg", "Not Found", "Cам виноват"))
        dogModelList.add(DogModel("${address}405.jpg", "Method Not Allowed", "Cам виноват"))
        dogModelList.add(DogModel("${address}406.jpg", "Not Acceptable", "Cам виноват"))
        dogModelList.add(DogModel("${address}407.jpg", "Proxy Authentication Required", "Cам виноват"))
        dogModelList.add(DogModel("${address}408.jpg", "Request Timeout", "Cам виноват"))
        dogModelList.add(DogModel("${address}409.jpg", "Conflict", "Cам виноват"))
        dogModelList.add(DogModel("${address}410.jpg", "Gone", "Cам виноват"))
        dogModelList.add(DogModel("${address}411.jpg", "Length Required", "Cам виноват"))
        dogModelList.add(DogModel("${address}412.jpg", "Precondition Failed", "Cам виноват"))
        dogModelList.add(DogModel("${address}413.jpg", "Payload Too Large", "Cам виноват"))
        dogModelList.add(DogModel("${address}414.jpg", "URI Too Long", "Cам виноват"))
        dogModelList.add(DogModel("${address}415.jpg", "Unsupported Media", "Cам виноват"))
        dogModelList.add(DogModel("${address}416.jpg", "Range Not Satisfiable", "Cам виноват"))
        dogModelList.add(DogModel("${address}418.jpg", "I'm a teapot", "Cам виноват"))
        dogModelList.add(DogModel("${address}421.jpg", "Misdirected Request", "Cам виноват"))
        dogModelList.add(DogModel("${address}423.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DogModel("${address}424.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DogModel("${address}425.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DogModel("${address}426.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DogModel("${address}417.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DogModel("${address}417.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DogModel("${address}417.jpg", "ExpectationFailed", "Cам виноват"))
        dogModelList.add(DogModel("${address}417.jpg ", "ExpectationFailed", "Cам виноват"))

        return dogModelList

    }
}