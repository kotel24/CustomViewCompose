package ru.mygames.customviewcompose.samples

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Point(
    val offset: Offset,
    val isStartedPosition: Boolean
)
@Preview
@Composable
fun CanvasTest(){
    val state = remember { mutableStateListOf<Point>() }
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )
            .pointerInput(key1 = Unit){
                detectDragGestures (
                    onDragStart = {it -> state.add(Point(it, true))},
                    onDrag = { change, dragAmount ->
                        change.historical.forEach { h -> state.add(Point(h.position, false))}
                        state.add(Point(change.position, false))
                        change.consume()
                    }
                )
            }
    ) {
        val path = Path()
        state.forEach {
            if (it.isStartedPosition) {
                path.moveTo(it.offset.x, it.offset.y)
                //drawCircle(brush = Brush.linearGradient(colors = listOf(Color.Magenta, Color.Cyan)), center = state[o], radius = 2.dp.toPx())
            }
            else path.lineTo(it.offset.x, it.offset.y)
        }
        drawPath(path = path, brush = Brush.linearGradient(colors = listOf(Color.Magenta, Color.Cyan)), style = Stroke(width = 2.dp.toPx()))
    }
}
@Composable
fun Dp.toPx() = with(LocalDensity.current){
    this@toPx.toPx()
}