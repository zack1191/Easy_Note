package com.example.easynote.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.easynote.R
import org.w3c.dom.Text

class NoteListItems(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvTitle : TextView =itemView.findViewById(R.id.tvNoteTitle)
    val tvBrief : TextView = itemView.findViewById(R.id.tvBrief)
}