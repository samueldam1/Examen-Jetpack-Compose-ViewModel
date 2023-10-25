package com.example.numeroclicks

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
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
import com.example.numeroclicks.ui.theme.NumeroClicksTheme

class UI {
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GUI() {
    // Dos maneras diferentes de definir un estado
    var counter by remember { mutableStateOf(0) } // remember: funcion exclusiva de @Composable que redibuja la UI
    // con el = necesitamos utilizar value
    val name = remember { mutableStateOf("") }

    Column {
        /*
        Image(
            painter = painterResource(id = R.drawable.icon),
            contentDescription = "Generar numeros"
        )
        */
        // contador de clicks
        TextButton(
            onClick = { counter++ },
            modifier = Modifier.padding(10.dp)
        ) {
            Text("CLICKS: $counter")
        }
        // boton que genera un numero random
        Button(
            onClick = { _number.value = (0..10).random()},
            modifier = Modifier.padding(20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.plus_icon20),
                contentDescription = "Icon image"
            )
            Text(
                text = "Numero random: ${_number.value}"
            )

        }

        // campo de texto para rellenar
        OutlinedTextField(
            value = name.value,
            onValueChange = {name.value = it},
            label = { Text(text = "Text") }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NumeroClicksTheme {
        GUI()
    }
}