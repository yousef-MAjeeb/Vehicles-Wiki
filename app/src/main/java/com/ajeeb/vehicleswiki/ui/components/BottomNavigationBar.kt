package com.ajeeb.vehicleswiki.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import org.koin.core.definition.indexKey

data class BottomNavigationBar(
    val title: String,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector,
)

val BottomNavigationBarItems = listOf(
    BottomNavigationBar(
        title = "Home",
        selectedIcon = Icons.Filled.Home,
        unSelectedIcon = Icons.Outlined.Home
    ),
    BottomNavigationBar(
        title = "Favorites",
        selectedIcon = Icons.Filled.Favorite,
        unSelectedIcon = Icons.Outlined.FavoriteBorder
    ),
    BottomNavigationBar(
        title = "Settings",
        selectedIcon = Icons.Filled.Settings,
        unSelectedIcon = Icons.Outlined.Settings
    )
)

@Preview
@Composable
fun BottomNavigationBar(){
    var selectedItemIndex by rememberSaveable{
        mutableStateOf(0)
    }
    NavigationBar {
        BottomNavigationBarItems.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedItemIndex == index,
                onClick = {
                    selectedItemIndex = index
                },
                label = {
                    Text(text = item.title)
                },
                icon = {
                    Icon(
                        imageVector = if (index == selectedItemIndex){
                            item.selectedIcon
                        } else item.unSelectedIcon,
                        contentDescription = item.title
                    )
                }
            )
        }
    }
}