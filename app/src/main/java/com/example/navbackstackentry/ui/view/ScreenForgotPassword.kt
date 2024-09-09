package com.example.navbackstackentry.ui.view

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
import androidx.compose.ui.unit.dp
import com.example.navbackstackentry.coordinator.NavCoordinator

@Composable
fun ScreenForgotPassView(coordinator: NavCoordinator) {
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
            Text(text = "Hey This is Forget Password")

            Button(onClick = {
                coordinator.nagivateTo("NavItems.LOG.route") // Corrected method call for navigation
            }) {
                Text(text = "Back")
            }
        }
    }

}