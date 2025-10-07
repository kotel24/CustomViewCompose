package ru.mygames.customviewcompose.samples

import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
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
                detectTapGestures {
                    state.add(it)
                }
            }
    ) {
        for (o in state)
            drawCircle(color = Color.Black, radius = 3.dp.toPx(), center = o)
    }
}
@Composable
fun Dp.toPx() = with(LocalDensity.current){
    this@toPx.toPx()
}