package ru.mygames.customviewcompose.samples

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CanvasTest(){
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        drawPath(
            path = Path().apply {
                moveTo(x = center.x, y = 100.dp.toPx())
                lineTo(x = center.x + 25.dp.toPx(), 150.dp.toPx())
                lineTo(x = center.x + 75.dp.toPx(), 150.dp.toPx())
                lineTo(x = center.x + 45.dp.toPx(), 200.dp.toPx())
                lineTo(x = center.x + 60.dp.toPx(), 250.dp.toPx())
                lineTo(x = center.x, 220.dp.toPx())
                lineTo(x = center.x - 60.dp.toPx(), 250.dp.toPx())
                lineTo(x = center.x - 45.dp.toPx(), 200.dp.toPx())
                lineTo(x = center.x - 75.dp.toPx(), 150.dp.toPx())
                lineTo(x = center.x - 25.dp.toPx(), 150.dp.toPx())
                lineTo(x = center.x, 100.dp.toPx())
            },
            color = Color.White,
            style = Fill
        )
    }
}