package com.example.myapplication.presentation.emojilist

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.myapplication.presentation.EmojiList
import com.example.myapplication.presentation.EmojiRandom
import org.koin.androidx.compose.koinViewModel

fun NavGraphBuilder.navigateToEmojiListScreen(){
    composable<EmojiList> {
        val viwModel: EmojiListScreenViewModel = koinViewModel()
        val uiState = viwModel.uiState.collectAsState().value
        EmojiListScreen(
            uiState = uiState
        )
    }
}