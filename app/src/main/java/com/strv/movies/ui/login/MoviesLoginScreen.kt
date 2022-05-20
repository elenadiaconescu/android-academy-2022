package com.strv.movies.ui.login

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.strv.movies.R
import com.strv.movies.ui.error.ErrorScreen
import com.strv.movies.ui.loading.LoadingScreen

@Composable
fun MoviesLoginScreen(
    navigateToMovieList: () -> Unit,
    viewModel: MoviesLoginViewModel = viewModel()
) {
    val viewState by viewModel.viewState.collectAsState()

    if (viewState.loading) {
        LoadingScreen()
    } else if (viewState.error != null) {
        ErrorScreen(errorMessage = viewState.error!!)
    } else {
        LoginElements(navigateToMovieList)

    }
}

@Composable
private fun LoginElements(navigateToMovieList: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(horizontal = 40.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {
        EmailField()
        PasswordField()
        LoginInWithSmileButton(navigateToMovieList)
        SignInGmailButton(navigateToMovieList)
        ContinueWithFacebookButton(navigateToMovieList)
        PopcornMoviePictures()
    }
}

@Composable
private fun LoginInWithSmileButton(navigateToMovieList: () -> Unit) {
    Button(
        onClick = { navigateToMovieList() },
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp)
    ) {
        Text(stringResource(id = R.string.login_btn))
    }
}

@Composable
private fun PasswordField() {
    val passwordState = remember { mutableStateOf(TextFieldValue()) }
    var passwordVisible by rememberSaveable { mutableStateOf(false) }

    TextField(
        value = passwordState.value,
        onValueChange = { passwordState.value = it },
        modifier = Modifier.padding(bottom = 10.dp),
        isError = false,
        placeholder = {
            Text(text = stringResource(id = R.string.login_password_text_input_field))
        },
        label = {
            Text(text = stringResource(id = R.string.login_password_text_input_field))
        },

        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            val image = if (passwordVisible)
                Icons.Filled.Visibility
            else Icons.Filled.VisibilityOff

            val description = if (passwordVisible) "Hide password" else "Show password"

            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(imageVector = image, description)
            }
        }
    )
}

@Composable
private fun EmailField() {
    val emailState = remember { mutableStateOf(TextFieldValue()) }
    TextField(
        value = emailState.value,
        onValueChange = { emailState.value = it },
        modifier = Modifier.padding(bottom = 10.dp),
        isError = false,
        label = {
            Text(
                text = stringResource(id = R.string.login_username_text_input_field)
            )
        }
    )
}

@Composable
private fun ContinueWithFacebookButton(navigateToMovieList: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Button(
            onClick = { navigateToMovieList() },
//            onClick = { "https://www.facebook.com/index.php" },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            Text(
                modifier = Modifier.padding(end = 10.dp),
                text = stringResource(id = R.string.continue_with_fb)
            )
            Icon(
                painter = painterResource(R.drawable.ic_facebook),
                contentDescription = stringResource(id = R.string.continue_with_fb),
                modifier = Modifier.size(24.dp)
            )
        }
    }
//    SignInGmailButton(navigateToMovieList)
}

@Composable
private fun SignInGmailButton(navigateToMovieList: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Button(
            onClick = { navigateToMovieList() },
//            onClick = { "https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin" },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            Text(
                modifier = Modifier.padding(end = 10.dp),
                text = stringResource(id = R.string.continue_with_gmail)
            )
            Icon(
                painter = painterResource(R.drawable.ic_gmail),
                modifier = Modifier.size(24.dp),
                contentDescription = stringResource(id = R.string.continue_with_gmail)
            )
        }
    }
}

@Composable
private fun PopcornMoviePictures() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 70.dp)
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_movie_clapper),
            contentDescription = stringResource(id = R.string.movie_clapper_picture),
        )
        Icon(
            painter = painterResource(R.drawable.ic_popcorn),
            contentDescription = stringResource(id = R.string.popcorn_picture),
        )
    }
}




