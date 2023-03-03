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

class HelloWorld : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComixTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    QuadrantApp()
                }
            }
        }
    }
}

@Composable
fun QuadrantApp(){
    Column(Modifier.fillMaxWidth()){
        Row(Modifier.weight(1f)) {
            QuadrantGenerator(stringResource(R.string.titolo1),
                stringResource(R.string.texto),
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            QuadrantGenerator(stringResource(R.string.titolo2),
                stringResource(R.string.texto),
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            QuadrantGenerator(stringResource(R.string.titolo3),
                stringResource(R.string.texto),
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            QuadrantGenerator(stringResource(R.string.titolo4),
                stringResource(R.string.texto),
                backgroundColor = Color.Gray,
                modifier = Modifier.weight(1f)
            )
        }

    }
}
@Composable
fun QuadrantGenerator(title: String,
                      texto: String,
                      backgroundColor: Color,
                      modifier: Modifier = Modifier
) {
    Column(modifier = modifier
        .background(backgroundColor)
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = texto
        )
    }
}

@Preview(showBackground = true)//name = "My Preview", //showSystemUi = true
@Composable
fun QuadrantPreview() {
    ComixTheme {
        QuadrantApp()
    }
}*/