package com.example.buttonapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.buttonapp.components.ButtonIcon
import com.example.buttonapp.components.ButtonNormal
import com.example.buttonapp.components.ButtonNormalTwo
import com.example.buttonapp.components.ButtonOutline
import com.example.buttonapp.components.ButtonSwitch
import com.example.buttonapp.components.ButtonText
import com.example.buttonapp.components.DarkMode
import com.example.buttonapp.components.FloatingAction
import com.example.buttonapp.components.Space
import com.example.buttonapp.ui.theme.ButtonAppTheme
import kotlinx.coroutines.flow.MutableStateFlow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkMode = remember { mutableStateOf(false)}
            ButtonAppTheme(darkTheme = darkMode.value){
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    Content(darkMode = darkMode)
                }
            }

        }
    }
}

@Composable
fun Content(darkMode: MutableState<Boolean>) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ButtonNormal()
        Space()
        ButtonNormalTwo()
        Space()
        ButtonText()
        Space()
        ButtonOutline()
        Space()
        ButtonIcon()
        Space()
        ButtonSwitch()
        Space()
        DarkMode(darkMode = darkMode)
        Space()
        FloatingAction()
    }
}

