package com.example.vietnamtravel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.vietnamtravel.data.DataSource
import com.example.vietnamtravel.ui.TravelScreen
import com.example.vietnamtravel.ui.theme.VietnamTravelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VietnamTravelTheme {
                TravelScreen(places = DataSource.places)
            }
        }
    }
}
