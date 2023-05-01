package com.appcade.pixelweatherapp.domain.util

sealed class Resource<T>(val data: T? = null, val messace:String?=null){
    class Success<T>(data: T?):Resource<T>(data)
    class Error<T>(message: String, data: T? = null):Resource<T>(data,message)
}
