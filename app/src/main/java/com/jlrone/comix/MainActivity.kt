package com.jlrone.comix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
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
                    ArticleWithPic(stringResource(R.string.title),
                        stringResource(R.string.intro),
                        stringResource(R.string.script),
                        painterResource(R.drawable.bg_compose_background)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleWithPic(title: String,
                   intro: String,
                   text: String,
                   image: Painter,
                   modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,

        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = intro,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = text,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)//name = "My Preview", //showSystemUi = true
@Composable
fun ArticlePreview() {
    ComixTheme {
        ArticleWithPic(stringResource(R.string.title),
            stringResource(R.string.intro),
            stringResource(R.string.script),
            painterResource(R.drawable.bg_compose_background)
        )
    }
}