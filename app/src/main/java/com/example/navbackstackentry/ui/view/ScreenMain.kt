package com.example.navbackstackentry.ui.view

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.navbackstackentry.coordinator.NavCoordinator

@Composable
fun ScreenMainLogin(
    startDestination: String
) {
    val context = LocalContext.current
    val navController = rememberNavController()
    val coordinator: NavCoordinator = remember { NavCoordinator(navController, context) }
        coordinator.NavigationHost(
            startDestination = startDestination,
            coordinator = coordinator
        )
    }

