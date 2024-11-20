package com.example.myapplication.presentation.randomemoji

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.myapplication.presentation.theme.BlueEmoji
import com.example.myapplication.presentation.theme.MyApplicationTheme

@Composable
fun RandomEmojiScreen(
    uiState: RandomEmojiUiState = RandomEmojiUiState(),
    modifier: Modifier = Modifier.background(BlueEmoji),
    navegateTo: () -> Unit = {},
    clickRadomEmoji: () -> Unit = {},
) {


    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        AsyncImage(
            model = uiState.radonEmoji,
            modifier = Modifier
                .width(80.dp)
                .height(40.dp),
            contentDescription = null,
        )

        ButtonGray(
            label = if (uiState.emojiList.isNotEmpty()) {
                "RANDOM EMOJI"
            } else {
                "GET EMOJI"
            },
            onClick = {
                clickRadomEmoji()
            },
            modifier = Modifier
                .width(160.dp)
                .padding(top = 12.dp)
        )

        ButtonGray(
            label = "EMOJI LIST", onClick = {
                navegateTo()
            }, modifier = Modifier
                .width(160.dp)
                .padding(top = 12.dp)
        )

        Box(
            modifier = Modifier
                .width(250.dp)
                .padding(top = 12.dp),
        ) {
            TextField(value = "", onValueChange = {}, colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent
            ), placeholder = {
                Text(
                    text = "insert github username", fontSize = 12.sp, color = Color.Red
                )
            })

            ButtonGray(
                label = "",
                onClick = { },
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .align(alignment = Alignment.CenterEnd)
                    .offset(x = 48.dp, y = 8.dp)
            )
        }

        ButtonGray(
            label = "AVATAR LIST",
            onClick = { },
            modifier = Modifier
                .width(250.dp)
                .padding(top = 12.dp)
        )

        ButtonGray(
            label = "GOOGLE REPOS",
            onClick = { },
            modifier = Modifier
                .width(250.dp)
                .padding(top = 12.dp)
        )
    }
}

@Composable
fun ButtonGray(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit = {},
) {
    Box(
        modifier = modifier
            .background(Color(0xFFD6D7D7))
            .clickable {
                onClick()
            }
            .padding(13.dp),
        contentAlignment = Alignment.Center

    ) {
        Text(
            text = label,
            modifier = Modifier.fillMaxWidth(),
            fontSize = 13.sp,
            textAlign = TextAlign.Center
        )
        if (label.isEmpty()) {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        }
    }
}

@Composable
@Preview
fun ButtonGrayPreview() {
    ButtonGray("RANDOM EMOJi", {})
}

@Preview(showSystemUi = true)
@Composable
private fun RandomEmojiPreview() {
    MyApplicationTheme {
        RandomEmojiScreen()
    }
}