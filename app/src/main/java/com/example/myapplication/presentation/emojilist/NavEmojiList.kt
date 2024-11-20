package com.example.myapplication.presentation.emojilist

import androidx.compose.runtime.collectAsState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.myapplication.presentation.EmojiList
import org.koin.androidx.compose.koinViewModel

fun NavGraphBuilder.navigateToEmojiListScreen(){
    composable<EmojiList> {
        val viwModel: EmojiListViewModel = koinViewModel()
        val uiState = viwModel.uiState.collectAsState().value
        EmojiListScreen(
            uiState = uiState
        )
    }
}