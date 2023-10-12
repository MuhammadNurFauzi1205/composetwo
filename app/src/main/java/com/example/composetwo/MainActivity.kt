package com.example.composetwo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetwo.ui.theme.ComposeTwoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTwoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    modifier = Modifier.fillMaxSize()
                ) {
                    ComposeArticleApp()
                }
            }
        }
    }
}

//@Composable
//fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
//    // Create a column so that texts don't overlap
//    Column(
//        verticalArrangement = Arrangement.Center,
//        modifier = modifier
//    ) {
//        Text(
//            text = message,
//            fontSize = 24.sp,
//            lineHeight = 116.sp,
//            textAlign = TextAlign.Center
//
//        )
//        Text(
//            text = from,
//            fontSize = 36.sp,
//            modifier = Modifier
//                .padding(16.dp)
//                .align(alignment = Alignment.CenterHorizontally)
//        )
//    }
//}
@Composable
fun ArticleText(title: String, subtitle: String, content: String, imagePainter: Painter, modifier: Modifier = Modifier) {
    // Create a column so that texts don't overlap
    Column(
        modifier = modifier
    ) {
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)

        )
        Text(
            text = subtitle,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)

        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)

        )
    }
}

//@Composable
//fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
//    val image = painterResource(R.drawable.bg_compose_background)
//    //Step 3 create a box to overlap image and texts
//    Box {
//        Image(
//            painter = image,
//            contentDescription = null,
//            contentScale = ContentScale.Crop,
//            alpha = 0.5F
//        )
//        GreetingText(
//            message = message,
//            from = from
//        )
//    }
//}

@Composable
fun ComposeArticleApp() {
    ArticleText(
        title = stringResource(R.string.title),
        subtitle = stringResource(R.string.subtitle),
        content = stringResource(R.string.content),
        imagePainter = painterResource(R.drawable.bg_compose_background)
    )
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    ComposeTwoTheme {
        ComposeArticleApp()
    }
}