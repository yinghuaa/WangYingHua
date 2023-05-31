package com.example.wangyinghua

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.wangyinghua.ui.theme.WangYingHuaTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WangYingHuaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Canvas(modifier = Modifier){
            drawRect(androidx.compose.ui.graphics.Color.Blue, Offset(200f, 300f), Size(100f,100f))
        }
        Canvas(modifier = Modifier){
            drawRect(androidx.compose.ui.graphics.Color.Blue, Offset(500f, 500f), Size(100f,100f))
        }
    }
    Column() {
        Text(text = "作者:資管二B 王櫻樺")
        Image(painter = painterResource(id = R.drawable.map), contentDescription = "地圖")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WangYingHuaTheme {
        //Greeting("Android")
    }
}