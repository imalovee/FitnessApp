package com.example.fitnessapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fitnessapp.R
import com.example.fitnessapp.components.AlignYourBodyRow
import com.example.fitnessapp.components.AlignYourBodySection
import com.example.fitnessapp.components.FavouriteCollectionGrid
import com.example.fitnessapp.components.FavouriteSection
import com.example.fitnessapp.components.SearchBar

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Column(
        modifier
            .padding(16.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()))
    {
        Spacer(Modifier.height(16.dp))
        SearchBar(Modifier)
        Spacer(Modifier.height(20.dp))
        AlignYourBodySection(title = R.string.align_your_body) {
            AlignYourBodyRow(modifier)
        }
//        Spacer(Modifier.height(20.dp))
        FavouriteSection(title = R.string.favorite_collections) {
            FavouriteCollectionGrid()
        }
        Spacer(Modifier.height(20.dp))
    }
}
