package com.ratnaglobaltech.exoplayerdemo.ui.theme

import android.content.Intent
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ratnaglobaltech.exoplayerdemo.PostViewModel
import com.ratnaglobaltech.exoplayerdemo.Routes


@Composable
fun ListDataItem(postViewModel: PostViewModel = viewModel(), navControlleOner: NavHostController) {
    val context = LocalContext.current
    var textFieldState by remember { mutableStateOf("") }
    val posts by postViewModel.posts.observeAsState(emptyList())
    val viewModel = viewModel<MyViewModel>()
    LaunchedEffect(postViewModel) {
        postViewModel.getPosts()
    }


    LazyColumn {
        items(posts) { postList ->
            Card(
                modifier = Modifier.padding(16.dp).clickable {
                    viewModel.stringValue.value = postList.uri

                    val intent = Intent(context, SecondActivity::class.java)
                    intent.putExtra("uriKey", postList.uri)
                    context.startActivity(intent)
                }
            ) {
                Column {
                    Text(
                        text = postList.name,
                        modifier = Modifier.padding(16.dp)
                    )
                    Text(
                        text = postList.uri,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }

    }

}