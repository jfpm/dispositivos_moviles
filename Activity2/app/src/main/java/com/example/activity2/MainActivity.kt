package com.example.activity2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.activity2.ui.theme.Activity2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Activity2Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    //Greeting("Android")

                    NotificationSummary() // Llama a la composable para mostrar el resumen
                }
            }
        }


    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Composable
    fun NotificationSummary() {
        val morningNotification = 51
        val eveningNotification = 135
        printNotificationSummary(morningNotification)
        printNotificationSummary(eveningNotification)
    }

    @Composable
    fun printNotificationSummary(numberOfMessages: Int) {
        val infov: String
        if (numberOfMessages < 100) {
             infov = "You have ${numberOfMessages} notifications."
        } else {
             infov = "Your phone is blowing up! You have 99+ notifications."
        }
        Text(
            text = infov
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Activity2Theme {
            Greeting("Android")
        }
    }
}
