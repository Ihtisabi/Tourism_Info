package com.example.sports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import com.example.sports.ui.SportsApp
import com.example.sports.ui.WelcomeScreen // Import WelcomeScreen
import com.example.sports.ui.theme.SportsTheme

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            SportsTheme {
                var showWelcomeScreen by remember { mutableStateOf(true) } // Tambahkan state untuk mengontrol tampilan awal
                val layoutDirection = LocalLayoutDirection.current

                Surface(
                    modifier = Modifier
                        .padding(
                            start = WindowInsets.safeDrawing.asPaddingValues()
                                .calculateStartPadding(layoutDirection),
                            end = WindowInsets.safeDrawing.asPaddingValues()
                                .calculateEndPadding(layoutDirection)
                        )
                ) {
                    val windowSize = calculateWindowSizeClass(this)

                    // Tampilkan WelcomeScreen jika showWelcomeScreen masih true
                    if (showWelcomeScreen) {
                        WelcomeScreen(
                            onStartClicked = { showWelcomeScreen = false } // Ubah state saat tombol diklik
                        )
                    } else {
                        SportsApp(
                            windowSize = windowSize.widthSizeClass,
                            onBackPressed = { finish() }
                        )
                    }
                }
            }
        }
    }
}
