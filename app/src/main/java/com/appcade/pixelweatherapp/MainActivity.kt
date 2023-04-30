package com.appcade.pixelweatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.appcade.pixelweatherapp.ui.theme.PixelWeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PixelWeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column() {
                        Image(painter = painterResource(id = R.drawable.ic_cloudy), contentDescription = "ll")
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Image(painter = painterResource(id = R.drawable.ic_cloudy), contentDescription = "ll")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PixelWeatherAppTheme {
        Greeting()
    }
}