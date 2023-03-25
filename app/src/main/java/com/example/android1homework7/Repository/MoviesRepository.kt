package com.example.android1homework7.Repository

import com.example.android1homework7.data.MoviesModel

class MoviesRepository {
    private val moviesAddress: String = "https://http.cat/"
    private val moviesModelList = mutableListOf<MoviesModel>()

    fun getListOfMovies() : MutableList<MoviesModel>{
        moviesModelList.add(MoviesModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXB4SshB7yfm0gkxFn1RyOI4edXRwGBrHZRtOCQfcDyV-R5Jd7en0L56tqsBRIgZDQ5kw&usqp=CAU", "красное уведомление", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}101", "Switching Protocols", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}102", "Processing", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}103", "Early Hints", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}200", "Ok", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}201", "Created", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}202", "Accepted", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}203", "Non-Authoritative", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}204", "No Content", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}206", "Partial Content", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}207", "Multi-Status", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}300", "Multiple Choices", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}301", "Moved Permanently", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}302", "Found", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}303", "See Other", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}304", "Not Modified", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}305", "Use Proxy", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}307", "Temporary Redirect", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}308", "Permanent Redirect", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}400", "Bad Request", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}401", "Unauthorized", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}402", "Payment Required", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}403", "Forbidden", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}404", "Not Found", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}405", "Method Not Allowed", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}406", "Not Acceptable", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}407", "Proxy Authentication Required", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}408", "Request Timeout", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}409", "Conflict", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}410", "Gone", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}411", "Length Required", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}412", "Precondition Failed", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}413", "Payload Too Large", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}414", "URI Too Long", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}415", "Unsupported Media", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}416", "Range Not Satisfiable", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}418", "I'm a teapot", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}421", "Misdirected Request", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}423", "ExpectationFailed", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}424", "ExpectationFailed", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}425", "ExpectationFailed", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}426", "ExpectationFailed", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}417", "ExpectationFailed", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}417", "ExpectationFailed", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}417", "ExpectationFailed", "Cам виноват"))
        moviesModelList.add(MoviesModel("${moviesAddress}417", "ExpectationFailed", "Cам виноват"))

        return moviesModelList

    }
}