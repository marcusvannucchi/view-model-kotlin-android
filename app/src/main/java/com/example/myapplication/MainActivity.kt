package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.view.mainview
import com.example.myapplication.view.mainviewmodel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: mainviewmodel = mainviewmodel()



        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
             Scaffold  (modifier = Modifier.fillMaxSize()){ innerPadding ->
                 mainview(modifier = Modifier.padding(innerPadding), viewModel = viewModel )
             }


            }
        }
    }
}



