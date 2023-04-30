package com.ratnaglobaltech.exoplayerdemo.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@SuppressLint("SuspiciousIndentation")
@Composable
fun ExoPlayerView(viewModel: MyViewModel) {

    val stringValue = viewModel.stringValue.value

       Card {

           Text(text = stringValue.toString(), modifier = Modifier.fillMaxWidth())
       }

}