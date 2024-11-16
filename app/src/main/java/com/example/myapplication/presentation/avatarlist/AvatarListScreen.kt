package com.example.myapplication.presentation.avatarlist

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R


@Composable
fun AvatarListScreen(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(128.dp),
        content = {
            items(30) {
                Card(){
                    R.drawable.ic_launcher_background
                }
            }
        }
    )
}

@Preview (showSystemUi = true)
@Composable
private fun AvatarListScreenPreview() {
    AvatarListScreen()
}