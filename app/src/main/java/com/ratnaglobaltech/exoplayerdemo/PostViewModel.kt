package com.ratnaglobaltech.exoplayerdemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ratnaglobaltech.exoplayerdemo.api.ApiService
import com.ratnaglobaltech.exoplayerdemo.dto.MyDataClass
import com.ratnaglobaltech.exoplayerdemo.dto.MyDataClassItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(
    private val apiService: ApiService
) : ViewModel() {

    private val _posts = MutableLiveData<List<MyDataClassItem>>()
    val posts: LiveData<List<MyDataClassItem>> = _posts

    fun getPosts() {
        viewModelScope.launch {
            _posts.value = apiService.getPosts()
        }
    }
}
