package com.example.myapplication.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.ViewModel


@Composable

fun mainview (modifier: Modifier = Modifier, viewModel: mainviewmodel){

<<<<<<< HEAD
    val contador:Int by viewModel.contador.observeAsState(0)
=======
    val contador:Int by viewModel.contador.observeAsState()
>>>>>>> 11cc45439eef014d8d0ac7006706d73261146f2d
        Column{
            Text(text = "=============>" )
            Text(text = "=============>" )
            Text(text = "=============>" )
            Text(text = "=============>" )
            Text(text = "=============>" )
            Text(text = "=============>" )
            Text(text = "=============>" )
<<<<<<< HEAD
            TextField(value = contador.toString(), onValueChange =  {})
            Button(onClick = {
                viewModel.incrementeContador()
            }) {
                Text(text = contador.toString())
=======
            TextField(value = "abcd", onValueChange =  {})
            Button(onClick = { /*TODO*/ }) {
                Text(text = "dudinha")
>>>>>>> 11cc45439eef014d8d0ac7006706d73261146f2d
            }
        }
}