package com.example.myapplication.presentation.randomemoji

import androidx.compose.runtime.collectAsState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import org.koin.androidx.compose.koinViewModel

fun NavGraphBuilder.navigateToRandomEmoji() {

    composable(route = "random_emoji") {
        val viewModel: RandomEmojiViewModel = koinViewModel()
        val uiState = viewModel.uiState.collectAsState().value
        RandomEmojiScreen(
            uiState = uiState
        )
    }

}