package com.strv.movies.ui.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ProfileScreen(
    viewModel: ProfileViewModel = viewModel(),
    onLogout: () -> Unit
) {

    Column {
        Text(text = "Profile screen", style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.size(32.dp))
        Button(onClick = {
            viewModel.logout(onSuccess = onLogout)
        }) {
            Text(text = "Logout")
        }
    }
}