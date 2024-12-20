package com.laranda.clase112

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.laranda.clase112.ui.MarsPhotosApp
import com.laranda.clase112.ui.theme.Clase112Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            Clase112Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    MarsPhotosApp()
                }
            }
        }
    }
}