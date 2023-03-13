package com.example.ecommerce_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.ecommerce_ui.presentation.login.composes.Login
import com.example.ecommerce_ui.ui.theme.BackGround
import com.example.ecommerce_ui.ui.theme.ECommerceUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ECommerceUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BackGround
                ) {
                    Login()
                }
            }
        }
    }
}