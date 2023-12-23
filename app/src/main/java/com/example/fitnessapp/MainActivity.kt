package com.example.fitnessapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fitnessapp.components.AppNavRail
import com.example.fitnessapp.components.BottomNav
import com.example.fitnessapp.screens.HomeScreen
import com.example.fitnessapp.ui.theme.FitnessAppTheme


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FitnessAppPortrait()
                }
            }
        }
    }
}



val alignYourBodyData = listOf(
    R.drawable.ab1_inversions to R.string.ab1_inversions,
    R.drawable.ab2_quick_yoga to R.string.ab2_quick_yoga,
    R.drawable.ab3_stretching to R.string.ab3_stretching,
    R.drawable.ab4_tabata to R.string.ab4_tabata,
    R.drawable.ab5_hiit to R.string.ab5_hiit,
    R.drawable.ab6_pre_natal_yoga to R.string.ab6_pre_natal_yoga
).map { DrawableStringPair(it.first, it.second) }

val favoriteCollectionsData = listOf(
    R.drawable.fc1_short_mantras to R.string.fc1_short_mantras,
    R.drawable.fc2_nature_meditations to R.string.fc2_nature_meditations,
    R.drawable.fc3_stress_and_anxiety to R.string.fc3_stress_and_anxiety,
    R.drawable.fc4_self_massage to R.string.fc4_self_massage,
    R.drawable.fc5_overwhelmed to R.string.fc5_overwhelmed,
    R.drawable.fc6_nightly_wind_down to R.string.fc6_nightly_wind_down
).map { DrawableStringPair(it.first, it.second) }


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FitnessAppPortrait(){
    FitnessAppTheme {
        Scaffold(bottomBar = { BottomNav()})
        {padding->
            HomeScreen(Modifier.padding(padding) )
        }
    }
}
//
//@Composable
//fun FitnessAppLandscape(){
//    FitnessAppTheme {
//        Surface(color = MaterialTheme.colorScheme.background){
//            Row {
//                AppNavRail()
//                HomeScreen()
//            }
//        }
//    }
//}





@Preview(showBackground = true,  backgroundColor = 0xFFF5F0EE, heightDp = 180)
@Composable
fun HomeScreenPreview() {
    FitnessAppTheme { FitnessAppPortrait() }
}