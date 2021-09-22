package com.jiahaoliuliu.simplemodelviewviewmodel2.data.api

import com.jiahaoliuliu.simplemodelviewviewmodel2.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>
}