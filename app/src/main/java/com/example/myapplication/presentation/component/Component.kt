package com.example.myapplication.presentation.component

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Buttons(
    label: String,
) {
  Button(
      onClick = { TODO() }
  ) {
      Text(text = label)
  }
}