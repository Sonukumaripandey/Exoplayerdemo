package com.ratnaglobaltech.exoplayerdemo.ui.theme

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel


class MyViewModel : ViewModel() {

    val stringValue = mutableStateOf("")
  /*  private val _longText = MutableLiveData<String>()
    val longText: LiveData<String> = _longText

    fun setLongText(longText: String) {
        _longText.value = longText
    }*/
}
