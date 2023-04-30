package com.ratnaglobaltech.exoplayerdemo

sealed class Routes(val route: String) {
    object Home : Routes("home")
    object Profile : Routes("profile")

}
