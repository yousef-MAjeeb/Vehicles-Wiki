package com.ajeeb.vehicleswiki.ui.browse

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun HomeScrenName(modifier: Modifier = Modifier){
    Text(
        text = "Home Screen",
        modifier = Modifier.fillMaxSize(),
        textAlign = TextAlign.Center
    )
}