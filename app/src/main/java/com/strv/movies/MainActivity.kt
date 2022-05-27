package com.strv.movies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.strv.movies.data.OfflineMoviesProvider
import com.strv.movies.ui.movieslist.MoviesList
import com.strv.movies.ui.theme.MoviesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val isSystemInDarkTheme = isSystemInDarkTheme()
            val isDarkTheme = remember { mutableStateOf(isSystemInDarkTheme) }
            MoviesTheme(useDarkTheme = isDarkTheme.value) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        TopAppBar(
                            title = {
                                Text(text = stringResource(id = R.string.app_name))
                            },
                            backgroundColor = MaterialTheme.colors.primary,
                            actions = {
                                DarkLightModeSwitchIcon(isDarkTheme = isDarkTheme)
                            }
                        )
                        Greeting(stringResource(id = R.string.greetings))
                        LogInMoviesApp()
                        MoviesList(movies = OfflineMoviesProvider.getMovies())
                    }
                }
            }
        }
    }

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun LogInMoviesApp() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(start = 40.dp, bottom = 10.dp, top = 18.dp, end = 40.dp)
                .fillMaxWidth()
        ) {
            LogInElements()
            otherElementsForLogin()
        }
    }

    @Composable
    private fun otherElementsForLogin() {
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            Row() {
                Icon(
                    painter = painterResource(R.drawable.ic_facebook),
                    contentDescription = stringResource(id = R.string.continue_with_fb),
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                    text = stringResource(id = R.string.continue_with_fb)
                )
            }

        }

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            Row() {
                Icon(
                    painter = painterResource(R.drawable.ic_gmail),
                    modifier = Modifier.size(24.dp),
                    contentDescription = stringResource(id = R.string.continue_with_gmail)
                )
                Text(
                    modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                    text = stringResource(id = R.string.continue_with_gmail)
                )
            }
        }
    }

    @Composable
    private fun LogInElements() {
        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.padding(bottom = 10.dp),
            isError = false,
            label = {
                Text(text = stringResource(id = R.string.login_username_text_input_field))
            })
        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.padding(bottom = 10.dp),
            isError = false,
            label = {
                Text(stringResource(id = R.string.login_password_text_input_field))
            })
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            Text(stringResource(id = R.string.login_btn))
        }
    }

    @Composable
    private fun DarkLightModeSwitchIcon(isDarkTheme: MutableState<Boolean>) {
        Icon(
            modifier = Modifier
                .padding(end = 12.dp)
                .clickable(
                    interactionSource = remember {
                        MutableInteractionSource()
                    },
                    indication = rememberRipple(bounded = false)
                ) {
                    isDarkTheme.value = !isDarkTheme.value
                    changeStatusBarColor(isDarkTheme.value)
                },
            painter = painterResource(
                id = if (isDarkTheme.value) {
                    R.drawable.ic_light
                } else {
                    R.drawable.ic_dark
                }
            ),
            contentDescription = null
        )
    }

    private fun changeStatusBarColor(isDarkMode: Boolean) {
        val color = if (isDarkMode) R.color.statusBarDarkMode else R.color.statusBarLightMode
        window.statusBarColor = resources.getColor(color, this@MainActivity.theme)
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(start = 130.dp, bottom = 4.dp, top = 16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.welcome_text),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
        Text(
            text = "$name",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color.Red
        )
    }
}

