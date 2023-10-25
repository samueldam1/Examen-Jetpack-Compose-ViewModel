package com.example.numeroclicks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.numeroclicks.ui.theme.NumeroClicksTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NumeroClicksTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GUI()
                }
            }
        }
    }

    data class UserData(val name: String, val numClicks: Int, val randomNumber: Int)

    @Composable
    fun GUI() {

        var dataUsuario by remember { mutableStateOf(UserData("", 0, 0)) }

        Column {
            // contador de clicks
            TextButton(
                onClick = {
                    dataUsuario = dataUsuario.copy(numClicks = dataUsuario.numClicks + 1)
                },
                modifier = Modifier.padding(10.dp)
            ) {
                Text("CLICKS: ${dataUsuario.numClicks}")
            }
            // boton que genera un numero random
            Button(
                onClick = {
                    dataUsuario = dataUsuario.copy(randomNumber = (0..10).random())
                },
                modifier = Modifier.padding(20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.plus_icon20),
                    contentDescription = "Icon image"
                )
                Text("Numero random: ${dataUsuario.randomNumber}")
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ColoredButtonPreview() {
        NumeroClicksTheme {
            GUI()
        }
    }


}