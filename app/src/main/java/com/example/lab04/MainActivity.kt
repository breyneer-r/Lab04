package com.example.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab04.ui.theme.Lab04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyComponents(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MyComponents(modifier: Modifier = Modifier) {
    // Variable de estado para el TextField
    val textState = remember { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        // Primer componente para el commit
        Button(onClick = { /* Acción */ }) {
            Text("Mi Boton")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Segundo componente para el commit
        Card(modifier = Modifier.fillMaxSize(0.5f)) {
            Text(
                text = "Hola yo soy Breyneer!",
                modifier = Modifier.padding(16.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Tercer componente para el commit
        TextField(
            value = textState.value,
            onValueChange = { textState.value = it },
            label = { Text("Enter text here") }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyComponentsPreview() {
    Lab04Theme {
        MyComponents()
    }
}

/*..............................................................
codigo del lab
 */

fun ViewHolaCurso() {
    Column(
        modifier = Modifier
            .fillMaxWith()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Course!",
            fontSize = 28.sp,
            fontWeight = FontWeigh.Bold
        )
        Spacer(modifier = Modifier.heigh(16.dp))
        Text(
            text = "Hello, Student!",
            fontSize = 20.xD

    }
}
