package com.jiahaoliuliu.simplemodelviewviewmodel2.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()
}