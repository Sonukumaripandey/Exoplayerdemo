package com.ratnaglobaltech.exoplayerdemo.ui.theme

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ratnaglobaltech.exoplayerdemo.PostViewModel
import com.ratnaglobaltech.exoplayerdemo.Routes


@SuppressLint("SuspiciousIndentation")
@Composable
fun MyNavHost(navControlleOner: NavHostController) {
    //val navController = rememberNavController()
     val   postViewModel: PostViewModel = viewModel()
    val myViewModel :MyViewModel = viewModel()
    NavHost(navController = navControlleOner, startDestination = Routes.Home.route) {
        composable(Routes.Home.route) {
            ListDataItem(postViewModel,navControlleOner)
        }
       /* composable("userProfile/{userId}") { backStackEntry ->
            // Composable for the user profile screen
          //  val urlData = backStackEntry.arguments?.getString("userId")
            // Use the userId to render the user profile
            // ExoPlayerView(urlData)

            val userId = backStackEntry.arguments?.getString("userId")
            ExoPlayerView(urlData = userId)
        }*/

        composable(Routes.Profile.route) { navBackStack ->



            ExoPlayerView(myViewModel)
        }
    }
}


