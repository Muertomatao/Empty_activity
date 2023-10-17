package com.example.emptyactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.emptyactivity.ui.theme.EmptyActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmptyActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Carlos!!")
                    Text(
                        text = "Surface 1"
                    )
                    Surface (
                        color = Color.Blue
                    ){

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(modifier = Modifier.padding(top = 24.dp), color = Color.DarkGray) {
        Text(
            text = "Hello, my name is $name!",
            modifier = modifier
        )
        Text(
            text = "Wazzup Justo!",
            modifier = Modifier
                .border(
                    width = 3.dp, brush = Brush.horizontalGradient(
                        0.0f to Color.Red,
                        0.3f to Color.Green,
                        1.0f to Color.Blue,
                        startX = 0.0f,
                        endX = 100.0f
                    ), shape = CircleShape
                )
                .padding(top = 48.dp)
                .height(12.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EmptyActivityTheme {
        Surface(
            modifier = Modifier.padding(10.dp)
        ) {
            Text ( text = "Surface 1")
            Greeting("Android2", Modifier.padding(15.dp).height(30.dp))
        }
        Surface(
            modifier = Modifier.padding(40.dp),
            color = Color.Red
        ) {

            Text(
                text = "Surface 2"
            )
            Surface (
                color = Color.Blue,
                modifier = Modifier.padding(50.dp)
            ){
                Text (text = "Surface 3")
                Greeting("Carlos!!")
            }

        }
    }
    EmptyActivityTheme {
        // A surface container using the 'background' color from the theme

    }
}
