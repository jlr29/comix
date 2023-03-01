package com.jlrone.comix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.jlrone.comix.ui.theme.ComixTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComixTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayCardWithPic("Angurie","- Da Guiova")
                }
            }
        }
    }
}

@Composable
fun BirthdayCard(message: String, from: String) {
    Column{
        Text(text = message, fontSize = 36.sp)
        Text(text = from, fontSize = 24.sp)
    }
}
@Composable
fun BirthdayCardWithPic(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(painter = image, contentDescription = null)
        BirthdayCard(message = message, from = from)
    }
}

@Preview(showBackground = false)//name = "My Preview", //showSystemUi = true
@Composable
fun BirthdayCardPreview() {
    ComixTheme {
        BirthdayCardWithPic("Angurie","- Da Guiova")
    }
}