package com.example.shoptutorial.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.shoptutorial.R

private val AgathoFontFamily = FontFamily(
    Font(R.font.agatho_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.agatho, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.agatho_light, FontWeight.Light, FontStyle.Normal)
)

@Immutable
data class AppTypography(
    val headline: TextStyle,
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,
    val body: TextStyle,
    val bodySmall: TextStyle,
    val label: TextStyle
)

val LocalAppTypography = staticCompositionLocalOf {
    AppTypography(
        headline = TextStyle.Default,
        titleLarge = TextStyle.Default,
        titleMedium = TextStyle.Default,
        titleSmall = TextStyle.Default,
        body = TextStyle.Default,
        bodySmall = TextStyle.Default,
        label = TextStyle.Default
    )
}

val extendedTypography = AppTypography(
    headline = TextStyle(
        fontFamily = AgathoFontFamily,
        fontSize = 32.sp,
        fontWeight = FontWeight.Normal
    ),
    titleLarge = TextStyle(
        fontFamily = AgathoFontFamily,
        fontSize = 24.sp,
        fontWeight = FontWeight.Normal
    ),
    titleMedium = TextStyle(
        fontFamily = AgathoFontFamily,
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal
    ),
    titleSmall = TextStyle(
        fontFamily = AgathoFontFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal
    ),
    body = TextStyle(
        fontFamily = AgathoFontFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    ),
    bodySmall = TextStyle(
        fontFamily = AgathoFontFamily,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal
    ),
    label = TextStyle(
        fontFamily = AgathoFontFamily,
        fontSize = 11.sp,
        fontWeight = FontWeight.Light
    )
)
