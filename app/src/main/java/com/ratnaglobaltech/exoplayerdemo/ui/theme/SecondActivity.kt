package com.ratnaglobaltech.exoplayerdemo.ui.theme

import VideoPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myIntValue = intent.getStringExtra("uriKey")
        val videoTitle = "Example Video"


        setContent {
            ExoplayerDemoTheme {
                // val navController = rememberNavController()
                // A surface container using the 'background' color from the theme

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    VideoPlayer(myIntValue)
                   // VideoPlayer()
                     //PlayerViewPath(myIntValue)
                    // MyApp()
                    // ListDataItem()
                    // MyNavHost()
                }
            }
        }
    }






}