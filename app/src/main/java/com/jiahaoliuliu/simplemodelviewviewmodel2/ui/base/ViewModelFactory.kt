package com.jiahaoliuliu.simplemodelviewviewmodel2.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jiahaoliuliu.simplemodelviewviewmodel2.data.api.ApiHelper
import com.jiahaoliuliu.simplemodelviewviewmodel2.data.repository.MainRepository
import com.jiahaoliuliu.simplemodelviewviewmodel2.ui.main.viewmodel.MainViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory(private val apiHelper: ApiHelper): ViewModelProvider.Factory {

    override fun <T: ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }

        throw IllegalArgumentException("Unknown class name")
    }
}