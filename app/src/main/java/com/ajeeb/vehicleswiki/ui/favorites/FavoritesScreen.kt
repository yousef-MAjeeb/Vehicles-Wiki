package com.ajeeb.vehicleswiki.ui.favorites

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun FavoritesScreen(){
    Text(
        text = "Home Screen",
        modifier = Modifier.fillMaxSize(),
        textAlign = TextAlign.Center
    )
}