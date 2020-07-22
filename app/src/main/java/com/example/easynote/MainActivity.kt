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
         /*   //            val bitmap = imageView.drawable.toBitmap(100, 100, null)
            val byteArray = convertImageToByteArray(imageView)
            //            val bitmap = (imageView.drawable as BitmapDrawable).bitmap
            //            val baos = ByteArrayOutputStream()
            //            bitmap.compress(Bitmap.CompressFormat.JPEG, 70, baos)
            //            val byteArray = baos.toByteArray()
            val image : Bitmap = resizeImage(byteArray, 500, 500) !!
            image?.let {
                imageView2.setImageBitmap(image)
            }*/
            //            baos.close()
        }
        catch (ex : Exception)
        {
            Toast.makeText(applicationContext, ex.toString(), Toast.LENGTH_SHORT).show()
        }
    }

  /*  private fun convertImageToByteArray(imageView : ImageView) : ByteArray
    {
        val bitmap = (imageView.drawable as BitmapDrawable).bitmap
        val byteArrayOutputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream)
        //            bitmap.recycle()
        val byte = byteArrayOutputStream.toByteArray()
        return byte
    }

    private fun resizeImage(imageData : ByteArray, targetWidth : Int, targetHeight : Int) : Bitmap?
    {
        // First decode with inJustDecodeBounds=true to check dimensions
        val options = BitmapFactory.Options()
        options.inJustDecodeBounds = true
        BitmapFactory.decodeByteArray(imageData, 0, imageData.size, options)
        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, targetWidth, targetHeight)
        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false
        val reducedBitmap = BitmapFactory.decodeByteArray(imageData, 0, imageData.size, options)
        return Bitmap.createScaledBitmap(reducedBitmap, targetWidth, targetHeight, false)
    }

    private fun calculateInSampleSize(options : BitmapFactory.Options, reqWidth : Int, reqHeight : Int) : Int
    {
        // Raw height and width of image
        val height = options.outHeight
        val width = options.outWidth
        var inSampleSize = 1
        if (height > reqHeight || width > reqWidth)
        {
            val halfHeight = height / 2
            val halfWidth = width / 2
            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while (halfHeight / inSampleSize > reqHeight && halfWidth / inSampleSize > reqWidth)
            {
                inSampleSize *= 2
            }
        }
        return inSampleSize
    }*/
}