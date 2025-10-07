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

@Preview
@Composable
fun CanvasTest(){
    val state = remember { mutableStateListOf<Offset>() }
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )
            .pointerInput(key1 = Unit){
                detectDragGestures { change, dragAmount ->
                    change.historical.forEach { h -> state.add(h.position) }
                    state.add(change.position)
                    change.consume()
                }
            }
    ) {
        val path = Path()
        for (o in state.indices) {
            if (o == 0) {
                path.moveTo(state[o].x, state[o].y)
                //drawCircle(brush = Brush.linearGradient(colors = listOf(Color.Magenta, Color.Cyan)), center = state[o], radius = 2.dp.toPx())
            }
            else path.lineTo(state[o].x, state[o].y)
        }
        drawPath(path = path, brush = Brush.linearGradient(colors = listOf(Color.Magenta, Color.Cyan)), style = Stroke(width = 2.dp.toPx()))
    }
}
@Composable
fun Dp.toPx() = with(LocalDensity.current){
    this@toPx.toPx()
}