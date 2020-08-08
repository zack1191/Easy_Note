package com.example.easynote.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.easynote.R
import com.example.easynote.db.AppDatabase
import com.example.easynote.db.DatabaseProvider
import com.example.easynote.db.entities.NoteEntities

class AddNoteActivity : BaseActivity() {


    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, AddNoteActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

            val ivBackPres = findViewById<ImageView>(R.id.ivBackPress)
            ivBackPres.setOnClickListener {
                onBackPressed()
                finish()
            }

        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            addNote()
        }


    }

    private fun addNote() {
        val etTitle = findViewById<EditText>(R.id.etTitle)
        val etBrief = findViewById<EditText>(R.id.etBrief)
        val title = etTitle.text.toString()
        val brief = etBrief.text.toString()

        val addData = NoteEntities(
            id = 0,
            title = title,
            brief = brief
        )
        executor.execute{
            DatabaseProvider.instance(this).noteDao().insertNote(addData)
        }

        startActivity(Intent(this, MainActivity::class.java))

    }


}