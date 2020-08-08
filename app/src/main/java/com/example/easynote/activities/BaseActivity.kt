package com.example.easynote.activities

import androidx.appcompat.app.AppCompatActivity
import java.util.concurrent.Executors

open class BaseActivity : AppCompatActivity() {
    companion object {
        val executor = Executors.newSingleThreadExecutor()!!
    }
}