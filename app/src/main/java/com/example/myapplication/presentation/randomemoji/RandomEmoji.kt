package com.example.myapplication.presentation.randomemoji

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.presentation.theme.BlueEmoji

@Composable
fun RandomEmoji(
    modifier: Modifier = Modifier.background(BlueEmoji)
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            imageVector = Icons.Default.Star, contentDescription = ""
        )

        ButtonGray(
            label = "RANDOM EMOJI",
            onClick = {  },
            modifier = Modifier.width(160.dp)
        )

        ButtonGray(
            label = "EMOJI LIST",
            onClick = { },
            modifier = Modifier.width(160.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            TextField(
                value = "Insert github username",
                onValueChange = {},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Search, contentDescription = null)
                }
            )

            ButtonGray(
                label = "AVATAR LIST",
                onClick = { },
                modifier = Modifier.width(200.dp)
            )

            ButtonGray(
                label = "GOOGLE REPOS",
                onClick = { },
                modifier = Modifier.width(200.dp)
            )
        }
    }
}

@Composable
fun ButtonGray(
    label:String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier
            .padding(6.dp)
            .background(Color(0xFFD6D7D7))
            .padding(13.dp),
        contentAlignment = Alignment.Center

    ){
        Text(label)
    }
}

@Composable
@Preview
fun ButtonGrayPreview(){
    ButtonGray("RANDOM EMOJO", {})
}

@Preview(showSystemUi = true)
@Composable
private fun HomePreview() {
    RandomEmoji()
}