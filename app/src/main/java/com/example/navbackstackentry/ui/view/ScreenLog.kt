package com.example.navbackstackentry.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.navbackstackentry.coordinator.NavCoordinator

@Composable
fun ScreenLoginView(coordinator: NavCoordinator){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Button(
            onClick = { coordinator.nagivateTo("NavItems.REGISTER.route")}
        ) {
            Text(text = "Register")
        }
        Button(

            onClick = { coordinator.nagivateTo("NavItems.FORGOT.route") }
        ) {
            Text(text = "Forget Password")
        }
    }
}