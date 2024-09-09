package com.example.navbackstackentry.coordinator


import android.content.Context
import android.util.Log
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navbackstackentry.ui.view.ScreenForgotPassView
import com.example.navbackstackentry.ui.view.ScreenLoginView
import com.example.navbackstackentry.ui.view.ScreenRegisterView

interface NavCoordinatorInterface {
    fun nagivateTo(route: String)

}


class NavCoordinator(
    val navController: NavHostController,
    private val context: Context
) : NavCoordinatorInterface {

    override fun nagivateTo(route: String) {
        navController.navigate(route) {
            // To avoid stack build-up
            popUpTo(navController.graph.startDestinationId) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }


    @Composable
    fun NavigationHost(
        startDestination: String,
        coordinator: NavCoordinator
    ) {

        NavHost(
            navController = navController,
            startDestination = startDestination,
            enterTransition = { ->
                slideInVertically(initialOffsetY = { it }, animationSpec = tween(2000))
            },
            exitTransition = { ->
                slideOutVertically(targetOffsetY = { it }, animationSpec = tween(2000))
            },
//            popEnterTransition = { ->
//                slideInVertically(initialOffsetY = { it })
//            },
//            popExitTransition = { ->
//                slideOutVertically(targetOffsetY = { it })
//            }
        ) {

            composable(route = "NavItems.LOG.route") {
                ScreenLoginView(coordinator)
            }
            composable(route = "NavItems.REGISTER.route") {
                ScreenRegisterView(coordinator)
            }
            composable(route = "NavItems.FORGOT.route") {
                ScreenForgotPassView(coordinator)
            }
        }
    }
}



