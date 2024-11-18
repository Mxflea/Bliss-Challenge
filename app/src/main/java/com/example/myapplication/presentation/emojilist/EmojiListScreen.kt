package com.example.myapplication.presentation.emojilist

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.myapplication.R
import com.example.myapplication.data.model.EmojiDto
import com.example.myapplication.presentation.theme.BlueEmoji


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun EmojiListScreen(
    uiState: EmojiListUiState = EmojiListUiState(),
    modifier: Modifier = Modifier
) {
    var componentHeight by remember { mutableStateOf(0.dp) }
    val density = LocalDensity.current

    LazyVerticalGrid(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(BlueEmoji)
            .padding(8.dp),
        columns = GridCells.Fixed(4),
        content = {

                items(items = uiState.emojiList, itemContent = {
                    Card(modifier = modifier
                        .padding(6.dp)
                        .fillMaxWidth()
                        .onGloballyPositioned {
                            componentHeight = with(density) { it.size.width.toDp() }
                        }
                        .then(
                            if (componentHeight > 0.dp) {
                                modifier.height(componentHeight)
                            } else {
                                modifier.wrapContentHeight()
                            }
                        ), border = BorderStroke(2.dp, Color.White)) {
                        AsyncImage(
                            model = it.url,
                            contentDescription = "",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.FillHeight,
                        )
                    }
                }
            )
        }
    )

//    FlowRow(
//        modifier = Modifier
//            .fillMaxWidth(),
//        maxItemsInEachRow = 4,
//    ) {
//        val emojis = uiState.emojiList.forEach {
//            AsyncImage(
//                model = it.url,
//                contentDescription = "",
//            )
//        }
//
//        emojis
//    }
}

@Preview(showSystemUi = true)
@Composable
private fun EmojiListScreenPreview() {
    EmojiListScreen(
        uiState = EmojiListUiState(
            emojiList = listOf(
                EmojiDto(
                    url = "https://github.githubassets.com/images/icons/emoji/unicode/1f44d.png?v8)"
                )
            )
        )
    )
}