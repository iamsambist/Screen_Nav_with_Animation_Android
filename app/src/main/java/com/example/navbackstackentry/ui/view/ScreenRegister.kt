package com.example.navbackstackentry.ui.view

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.navbackstackentry.coordinator.NavCoordinator

@Composable
fun ScreenRegisterView(
    coordinator: NavCoordinator,
) {
    AnimatedScreenContent(isVisible = true) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(WindowInsets.statusBars.asPaddingValues()), // Padding for status bars
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally, // Center-align content horizontally
                verticalArrangement = Arrangement.spacedBy(20.dp) // Vertical spacing between items
            ) {
                Text(text = "Hey This is register Password")

                Button(onClick = {
                    coordinator.nagivateTo("NavItems.LOG.route") // Corrected method call for navigation
                }) {
                    Text(text = "Back")
                }
            }
        }

    }
}


@Composable
fun AnimatedScreenContent(isVisible: Boolean, content: @Composable () -> Unit) {
    AnimatedVisibility(
        visible = isVisible,
        enter = slideInVertically(initialOffsetY = { it }) + fadeIn(animationSpec = tween(7000)),
        exit = slideOutVertically(targetOffsetY = { it }) + fadeOut(animationSpec = tween(7000))
    ) {
        content()
    }
}

