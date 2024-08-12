package com.example.thelearntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thelearntogether.ui.theme.TheLearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TheLearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    ArticleCard(
//                        heading = stringResource(R.string.jetpack_compose_heading),
//                        paragraph1= stringResource(R.string.jetpack_compose_paragraph1),
//                        paragraph2= stringResource(R.string.jetpack_compose_para2),
//                    )
                    ComposeArticleApp()
                }
            }
        }
    }
}


@Composable
fun ArticleCard(heading:String,paragraph1:String,paragraph2:String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Column(verticalArrangement = Arrangement.Center, modifier = modifier.padding(16.dp)) {
        Image(
            painter = image,
            contentDescription = null,
        )
        Text(
            text = heading,
            fontSize= 24.sp,
            modifier = Modifier.padding(16.dp)

        )
        Text(

            text = paragraph1,
          //  fontSize=14.sp ,
            modifier = Modifier.padding(start = 16.dp,end = 16.dp),
            textAlign= TextAlign.Justify
        )
        Text(
            text = paragraph2,
           // fontSize= 14.sp,
            modifier = Modifier.padding(16.dp),
            textAlign=TextAlign.Justify
        )
    }

}


@Composable
fun ComposeArticleApp(){

        ArticleCard(heading=stringResource(R.string.jetpack_compose_heading),
            paragraph1=stringResource(R.string.jetpack_compose_paragraph1),
            paragraph2=stringResource(R.string.jetpack_compose_para2),
            modifier= Modifier
                .fillMaxSize()
                .padding(16.dp))


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TheLearnTogetherTheme {
        ComposeArticleApp(
//            heading = stringResource(R.string.jetpack_compose_heading),
//            paragraph1= stringResource(R.string.jetpack_compose_paragraph1),
//            paragraph2= stringResource(R.string.jetpack_compose_para2),
      //      modifier = Modifier,
        )
    }
}