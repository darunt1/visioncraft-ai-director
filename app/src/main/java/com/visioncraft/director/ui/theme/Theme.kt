package com.visioncraft.director.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = NeonBlue,
    secondary = NeonPurple,
    tertiary = DarkGray,
    background = AlmostBlack,
    surface = DarkCharcoal,
    error = NeonRed
)

private val LightColorScheme = lightColorScheme(
    primary = NeonBlue,
    secondary = NeonPurple,
    tertiary = LightGray,
    background = OffWhite,
    surface = White,
    error = NeonRed
)

@Composable
fun VisionCraftTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = VisionCraftTypography,
        content = content
    )
}
