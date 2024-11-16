package com.example.myapplication.presentation.randomemoji

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.repository.randomemoji.RandomEmojiRepository
import kotlinx.coroutines.launch

class RandomEmojiViewModel(
    val repository: RandomEmojiRepository
) : ViewModel() {
    fun teste(){
        viewModelScope.launch {
            repository.getList()
        }
    }
}



data class Pessoa(
    val nome:String
)