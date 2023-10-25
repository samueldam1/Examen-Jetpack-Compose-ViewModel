package com.example.examencompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examencompose.ui.theme.ExamenComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamenComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GUI()
                }
            }
        }
    }
}

@Composable
fun GUI() {

    // remember: funcion exclusiva de @Composable que redibuja la UI
    var ronda by remember { mutableStateOf(0) }
    var startText by remember { mutableStateOf("Start") }

    val fuenteSize = if (ronda <= 10) 16.sp else 14.sp  // tiene que estar en sp

    Column {

        // Indicador de ronda
        Row {

            Spacer(modifier = Modifier.width(125.dp)) // Agrega espacio horizontal

            Column (
                horizontalAlignment = Alignment.End
            ){
                Text("RONDA")
                Text(
                    text = "$ronda",
                    fontSize = fuenteSize
                )
            }
        }

        // Botones de colores
        Column (
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.CenterHorizontally)
        ){
            Row (
                modifier = Modifier
                    .padding(5.dp)
            ){
                Button(
                    onClick = { /* TODO */ },
                    modifier = Modifier
                        .background(Color.Blue)
                        .padding(10.dp)
                ) {
                }

                Spacer(modifier = Modifier.width(10.dp)) // Agrega espacio horizontal

                Button(
                    onClick = { /* TODO */ },
                    modifier = Modifier
                        .background(Color.Green)
                        .padding(10.dp)
                ) {}
            }
            Row (
                modifier = Modifier
                    .padding(5.dp)
            ){
                Button(
                    onClick = { /* TODO */ },
                    modifier = Modifier
                        .background(Color.Red)
                        .padding(10.dp)
                ) {}

                Spacer(modifier = Modifier.width(10.dp)) // Agrega espacio horizontal

                Button(
                    onClick = { /* TODO */ },
                    modifier = Modifier
                        .background(Color.Yellow)
                        .padding(10.dp)
                ) {}
            }
        }

        // Botones 'Start' y 'Send'
        Row (
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            TextButton(
                onClick = { startText = "Reset" }
            ) {
                    Text(startText)
            }

            Spacer(modifier = Modifier.width(10.dp)) // Agrega espacio horizontal

            Button(
                onClick = { ronda++ }
            ) {
                Image( painter = painterResource(id = R.drawable.send_icon),
                    contentDescription = "Icono send",
                    modifier = Modifier.size(20.dp,20.dp)
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExamenComposeTheme {
        GUI()
    }
}