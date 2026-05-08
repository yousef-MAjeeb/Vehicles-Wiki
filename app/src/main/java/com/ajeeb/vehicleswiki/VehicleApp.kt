package com.ajeeb.vehicleswiki

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ajeeb.vehicleswiki.ui.components.BottomNavigationBar
import com.ajeeb.vehicleswiki.ui.home.HomeScrenName

@Composable
fun VehicleApp(modifier: Modifier = Modifier){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                BottomNavigationBar()
            }
        }
    ) { innerPadding ->
        HomeScrenName(
            modifier = Modifier.padding(innerPadding)
        )
    }
}