package com.example.wronganswernote

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.FileProvider
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.abs

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_two = findViewById<Button>(R.id.button_two)
        val button_four = findViewById<Button>(R.id.button_four)
        val button_six = findViewById<Button>(R.id.button_six)
        val button_eight = findViewById<Button>(R.id.button_eight)
        button_two.setOnClickListener{
            val intent = Intent(this, TwoActivity::class.java)
            startActivity(intent)
        }
        button_four.setOnClickListener{
            val intent = Intent(this, FourActivity::class.java)
            startActivity(intent)
        }
        button_six.setOnClickListener{
            val intent = Intent(this, SixActivity::class.java)
            startActivity(intent)
        }
        button_eight.setOnClickListener{
            val intent = Intent(this, EightActivity::class.java)
            startActivity(intent)
        }
    }

}