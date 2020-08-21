package com.piyushmaheswari.facedetection

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View

class MainActivity : AppCompatActivity() {

    var bitmap: Bitmap?= null
    lateinit var tempBitmap: Bitmap
    lateinit var paint: Paint
    lateinit var canvas: Canvas

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun cameraSelect(view: View) {

        val intent=Intent()
        intent.action=MediaStore.ACTION_IMAGE_CAPTURE
        if(intent.resolveActivity(packageManager)!=null)
        {
            startActivityForResult(intent, REQUESTCODE2)
        }

    }

    fun selectImage(view: View) {
        val intent=Intent()
        intent.type="image/*"
        intent.action=Intent.ACTION_GET_CONTENT
        if(intent.resolveActivity(packageManager)!=null)
        {
            startActivityForResult(intent, REQUESTCODE)
        }

    }

    companion object {
        const val REQUESTCODE=101
        const val REQUESTCODE2=102


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

    }
}
