package com.jaegerapps.sqldelightdemo

import App
import DatabaseDriverFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.jaegerapps.sqldelightdemo.composeApp.database.SQLDelightDemoDatabase

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val database = SQLDelightDemoDatabase(DatabaseDriverFactory(LocalContext.current).createDriver())
            App(database)
        }
    }
}

