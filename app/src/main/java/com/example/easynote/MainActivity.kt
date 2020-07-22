package com.example.easynote

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.widget.ImageView
import android.widget.Toast
import androidx.core.graphics.BitmapCompat
import androidx.core.graphics.drawable.toBitmap
import kotlinx.android.synthetic.main.activity_main.*
import java.io.ByteArrayOutputStream
import java.lang.Exception

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try
        {

        }
        catch (ex : Exception)
        {
            Toast.makeText(applicationContext, ex.toString(), Toast.LENGTH_SHORT).show()
        }
    }


}