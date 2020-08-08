package com.example.easynote.adapters

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.easynote.R
import com.example.easynote.db.AppDatabase
import com.example.easynote.db.daos.NoteDao
import com.example.easynote.db.entities.NoteEntities
import com.example.easynote.viewholders.NoteListItems
import kotlinx.android.synthetic.main.item_note_list.view.*

class NoteListAdapter() : RecyclerView.Adapter<NoteListItems>() {


    private var noteList = listOf<NoteEntities>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteListItems {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.item_note_list,parent,false)
         return NoteListItems(view)
    }

    override fun getItemCount(): Int {
       return noteList.size
    }
    fun setItem(note : List<NoteEntities>){
        noteList = note
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: NoteListItems, position: Int) {
             val item = noteList[position]
             holder.tvTitle.text =item.title
             holder.tvBrief.text = item.brief

    }

//    override fun writeToParcel(p0: Parcel?, p1: Int) {
//
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//    companion object CREATOR : Parcelable.Creator<NoteListAdapter> {
//        override fun createFromParcel(parcel: Parcel): NoteListAdapter {
//            return NoteListAdapter(parcel)
//        }
//
//        override fun newArray(size: Int): Array<NoteListAdapter?> {
//            return arrayOfNulls(size)
//        }
//    }
//
//    constructor(parcel: Parcel) : this()
}