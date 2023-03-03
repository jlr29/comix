package com.jlrone.comix

/*import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlrone.comix.ui.theme.ComixTheme

class BusinessCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComixTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(){
    Column(Modifier.fillMaxSize()){
        val image = painterResource(R.drawable.ic_launcher_foreground)
        Column(
            Modifier
                .fillMaxWidth()
                .padding(top = 130.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = image,
                contentDescription = null,
            Modifier.padding(top = 10.dp))
            Text(
                text = stringResource(R.string.full_name),
                fontSize = 30.sp
            )
            Text(
                text = stringResource(R.string.title),
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 15.dp, bottom = 20.dp)
            )
        }
        Column(
            Modifier
                .padding(top = 200.dp)
                .fillMaxWidth()
        ) {
            Row(Modifier.padding(start = 40.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
              Image(image,
                  contentDescription = null)
                Text(
                    text = stringResource(R.string.phone_number),
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 30.dp)
                )
            }
            Row(Modifier.padding(start = 40.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(image,
                    contentDescription = null)
                Text(
                    text = stringResource(R.string.insta),
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 30.dp)
                )
            }
            Row(Modifier.padding(start = 40.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(image,
                    contentDescription = null)
                Text(
                    text = stringResource(R.string.email),
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 30.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)//name = "My Preview", //showSystemUi = true
@Composable
fun BusinessCardPreview() {
    ComixTheme {
        BusinessCard()
    }
}*/