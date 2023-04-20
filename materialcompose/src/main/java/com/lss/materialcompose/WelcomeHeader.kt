package com.lss.materialcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WelcomeHeader(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.onPrimary,
    header: String
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            color = color,
            style = MaterialTheme.typography.headlineLarge,
            text = header
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WelcomeHeader(color = Color.Blue, header = "Publishing Android Library to GitHub")
}