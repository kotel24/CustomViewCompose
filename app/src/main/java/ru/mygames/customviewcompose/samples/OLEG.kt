package ru.mygames.customviewcompose.samples

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

fun DrawScope.oleg(){
    // Буква "О"
    drawCircle(
        color = Color.Yellow,
        radius = 25.dp.toPx(),
        center = Offset(x = 50.dp.toPx(), y = 50.dp.toPx()),
        style = Stroke(width = 5.dp.toPx())
    )

    // Буква "Л"
    drawLine(
        color = Color.Green,
        start = Offset(x = 85.dp.toPx(), y = 75.dp.toPx()),
        end = Offset(x = 110.dp.toPx(), y = 25.dp.toPx()),
        strokeWidth = 1f.dp.toPx()
    )
    drawLine(
        color = Color.Blue,
        start = Offset(x = 110.dp.toPx(), y = 25.dp.toPx()),
        end = Offset(x = 135.dp.toPx(), y = 75.dp.toPx()),
        strokeWidth = 1f.dp.toPx()
    )

    // Буква "Е"
    drawLine(
        color = Color.Cyan,
        start = Offset(x = 145.dp.toPx(), y = 75.dp.toPx()),
        end = Offset(x = 145.dp.toPx(), y = 25.dp.toPx()),
        strokeWidth = 3f.dp.toPx()
    )
    drawLine(
        color = Color.Green,
        start = Offset(x = 145.dp.toPx(), y = 25.dp.toPx()),
        end = Offset(x = 175.dp.toPx(), y = 25.dp.toPx()),
        strokeWidth = 2f.dp.toPx()
    )
    drawLine(
        color = Color.Gray,
        start = Offset(x = 145.dp.toPx(), y = 50.dp.toPx()),
        end = Offset(x = 175.dp.toPx(), y = 50.dp.toPx()),
        strokeWidth = 5f.dp.toPx()
    )
    drawLine(
        color = Color.Yellow,
        start = Offset(x = 145.dp.toPx(), y = 75.dp.toPx()),
        end = Offset(x = 175.dp.toPx(), y = 75.dp.toPx()),
        strokeWidth = 2f.dp.toPx()
    )

    // Буква "Г"
    drawLine(
        color = Color.Red,
        start = Offset(x = 190.dp.toPx(), y = 25.dp.toPx()),
        end = Offset(x = 190.dp.toPx(), y = 75.dp.toPx()),
        strokeWidth = 3f.dp.toPx()
    )
    drawLine(
        color = Color.Magenta,
        start = Offset(x = 190.dp.toPx(), y = 25.dp.toPx()),
        end = Offset(x = 225.dp.toPx(), y = 25.dp.toPx()),
        strokeWidth = 2f.dp.toPx()
    )
    drawLine(
        color = Color.White,
        start = Offset(x = 225.dp.toPx(), y = 25.dp.toPx()),
        end = Offset(x = 225.dp.toPx(), y = 30.dp.toPx()),
        strokeWidth = 1f.dp.toPx()
    )
}