package com.example.scrollablelistcompose.ui.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun ScrollAbleListHomeContent(){
    val puppies = remember { DataProvider.chocolateList}
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items = puppies,
            itemContent = {
                ChocolateListItem(chocolate = it)
            }
        )
    }
}