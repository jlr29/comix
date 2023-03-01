package com.jlrone.comix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayCard("Angurie","- Da Guiova")
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

@Preview(//name = "My Preview",
        showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    ComixTheme {
        BirthdayCard("Angurie","- Da Guiova")
    }
}