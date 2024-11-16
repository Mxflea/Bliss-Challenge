package com.example.myapplication.presentation.emojilist

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.presentation.theme.BlueEmoji



@Composable
fun EmojiListScreen(modifier: Modifier = Modifier.background(BlueEmoji)) {
    val photo = R.drawable.pata

    LazyVerticalGrid(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(8.dp),
        columns = GridCells.Adaptive(80.dp),
        content = {
            items(36) {
                Card(
                    modifier = modifier.padding(6.dp),
                    border = BorderStroke(2.dp, Color.Red)
                ){
                    Image(painter = painterResource(photo), contentDescription = "")
                }
            }
        }
    )
}

@Preview(showSystemUi = true)
@Composable
private fun AvatarListScreenPreview() {
    EmojiListScreen()
}