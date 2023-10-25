package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.composeTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            composeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GUI()
                }
            }
        }
    }




    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun GUI() {

    var ronda = 0

    Column {

        // Indicador de ronda
        Row (

        ){
            Spacer(modifier = Modifier.width(125.dp)) // Agrega espacio horizontal

            Column (
                horizontalAlignment = Alignment.End
            ){
                Text("RONDA")
                Text("$ronda")
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

        // Botones de abajo
        Row (
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            TextButton(
                onClick = {  }
            ) {
                Text("START")
            }

            Spacer(modifier = Modifier.width(10.dp)) // Agrega espacio horizontal

            Button(
                onClick = { /*TODO*/ }
            ) {

            }
        }

    }
    }


    @Preview(showBackground = true)
    @Composable
    fun ColoredButtonPreview() {
        composeTheme {
            GUI()
        }
    }

}