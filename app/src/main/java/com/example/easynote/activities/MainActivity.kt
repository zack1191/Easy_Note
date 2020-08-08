package com.example.easynote.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.easynote.R
import com.example.easynote.adapters.NoteListAdapter
import com.example.easynote.db.AppDatabase
import com.example.easynote.db.DatabaseProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class MainActivity : BaseActivity() {


    lateinit var mNoteListAdapter: NoteListAdapter

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {
            val fbAddNote = findViewById<FloatingActionButton>(R.id.fbAddNote)


            val rvNoteList = findViewById<RecyclerView>(R.id.rvNoteList)

            mNoteListAdapter = NoteListAdapter()
            val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            rvNoteList.layoutManager = linearLayoutManager
            rvNoteList.adapter = mNoteListAdapter
            executeDb()


            fbAddNote.setOnClickListener {
                getAddNoteActivity()
            }


        } catch (ex: Exception) {
            Toast.makeText(applicationContext, ex.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    private fun getAddNoteActivity() {
        val intent = AddNoteActivity.newIntent(applicationContext)
        startActivity(intent)
    }

    private fun executeDb() {
        executor.execute {
            val database = DatabaseProvider.instance(this)!!
            val dao = database.noteDao()
            val getData = dao.getNote()
            runOnUiThread {
                mNoteListAdapter.setItem(getData)
            }
        }
    }


}