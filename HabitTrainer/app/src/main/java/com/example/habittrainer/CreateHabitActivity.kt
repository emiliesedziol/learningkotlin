package com.example.habittrainer

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.EditText
import com.example.habittrainer.R.*
import com.example.habittrainer.db.HabitDBTable
import kotlinx.android.synthetic.main.activity_create_habit.*
import java.io.IOException

class CreateHabitActivity : AppCompatActivity() {

    private val TAG = CreateHabitActivity::class.java.simpleName

    private val CHOOSE_IMAGE_REQUEST = 1

    private var imageBitMap: Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_create_habit)
    }

    fun storeHabit(v: View) {
        // if (et_title.text.toString().isBlank() || et_description.text.toString().isBlank()) {
        // this change can be done because of the private function EditText.isBlank() below
        if (et_title.isBlank() || et_description.isBlank()) {
            Log.d(TAG, "No habit stored")
            displayErrorMessage("Your habit needs to have a title and description")
            return
        } else if (imageBitMap == null) {
            Log.d(TAG, "No Habit stored, image missing")
            displayErrorMessage("Add a picture to your habit")
            return
        }

        val title = et_title.text.toString()
        val description = et_description.text.toString()
        val habit = Habit(title, description, imageBitMap!!)

        val id = HabitDBTable(this).store(habit)

        if (id == -1L) {
            displayErrorMessage("Habit could not be stored")
        } else {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun displayErrorMessage(message: String) {
        tv_error.text = message
        tv_error.visibility = View.VISIBLE

    }


    fun chooseImage(v: View) {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT

        val chooser = Intent.createChooser(intent, "Choose Image")
        startActivityForResult(chooser, CHOOSE_IMAGE_REQUEST)

        Log.d(TAG, "Intent to choose and image sent")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == CHOOSE_IMAGE_REQUEST && resultCode == Activity.RESULT_OK
            && data != null && data.data != null) {
            Log.d(TAG, "Image was picked")
            val bitmap = tryReadBitmap(data.data)

            bitmap?.let {
                this.imageBitMap = bitmap
                iv_image.setImageBitmap(bitmap)
                Log.d(TAG, "read image bitmap and updated image view")
            }
        }
    }

    private fun tryReadBitmap(data: Uri): Bitmap? {
        return try {
            MediaStore.Images.Media.getBitmap(contentResolver, data)
        } catch(e: IOException) {
            e.printStackTrace()
            null

        }
    }
}

private fun EditText.isBlank() = this.text.toString().isBlank()