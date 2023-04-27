package com.example.tradelinemobile.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColorScheme(
    primary = Blue50,
    onPrimary = Blue100,
    secondary = Teal200,
    primaryContainer = Purple200,
    onPrimaryContainer = Purple500
)

private val LightColorPalette = lightColorScheme(
    primary = Blue100,
    onPrimary = Blue50,
    primaryContainer = Teal200,
    onPrimaryContainer = Purple500,
    onSecondaryContainer = Purple200,
    onBackground = Gray,
    background = Color.White

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun TradelineMobileTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}