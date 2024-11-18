package com.example.myapplication.presentation.randomemoji

import androidx.compose.runtime.collectAsState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.myapplication.presentation.EmojiRandom
import org.koin.androidx.compose.koinViewModel

fun NavGraphBuilder.navigateToRandomEmoji(
    navegateTo: () -> Unit = {}
) {
    composable<EmojiRandom> {
        val viewModel: RandomEmojiViewModel = koinViewModel()
        val uiState = viewModel.uiState.collectAsState().value
        RandomEmojiScreen(
            uiState = uiState,
            navegateTo = {
                navegateTo()
            },
            clickRadomEmoji = {
                viewModel.changeEmoji()
            }
        )
    }
}