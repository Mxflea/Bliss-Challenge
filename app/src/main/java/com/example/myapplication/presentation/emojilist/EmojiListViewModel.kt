package com.example.myapplication.presentation.emojilist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.model.EmojiDto
import com.example.myapplication.data.repository.randomemoji.EmojiRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class EmojiListViewModel(
    private val repository: EmojiRepository
) : ViewModel() {
    private var _uiState: MutableStateFlow<EmojiListUiState> =
        MutableStateFlow(EmojiListUiState())
    val uiState = _uiState

    init {
        viewModelScope.launch {
            val result = repository.getList()
            _uiState.update { uiState ->
                uiState.copy(emojiList = result)
            }
        }
    }
}

data class EmojiListUiState(
    val emojiList: List<EmojiDto> = emptyList()
)