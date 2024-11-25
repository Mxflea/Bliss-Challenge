package com.example.myapplication.presentation.randomemoji

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.model.EmojiDto
import com.example.myapplication.data.repository.randomemoji.EmojiRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class RandomEmojiViewModel(
    private val repository: EmojiRepository,
) : ViewModel() {

    private var _uiState: MutableStateFlow<RandomEmojiUiState> =
        MutableStateFlow(RandomEmojiUiState())
    val uiState = _uiState

    init {
        viewModelScope.launch {
            val result = repository.getList()
            _uiState.update { uiState ->
                uiState.copy(
                    emojiList = result,
                    radonEmoji =  if (result.isNotEmpty()) {
                        result.random().url
                    } else {
                        ""
                    }
                )
            }
        }
    }

    fun changeEmoji() {
        _uiState.update { uiState ->
            uiState.copy(
                radonEmoji = uiState.emojiList.random().url
            )
        }
    }
}

data class RandomEmojiUiState (
    val emojiList: List<EmojiDto> = emptyList(),
    val radonEmoji: String = ""
)