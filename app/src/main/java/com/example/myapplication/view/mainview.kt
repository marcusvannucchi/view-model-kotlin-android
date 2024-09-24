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


    val contador:Int by viewModel.contador.observeAsState(0)


        Column{
            Text(text = "=============>" )
            Text(text = "=============>" )
            Text(text = "=============>" )
            Text(text = "=============>" )
            Text(text = "=============>" )
            Text(text = "=============>" )
            Text(text = "=============>" )

            TextField(value = contador.toString(), onValueChange =  {})
            Button(onClick = {
                viewModel.incrementeContador()
            }) {
                Text(text = contador.toString())

            
            }
        }
}
