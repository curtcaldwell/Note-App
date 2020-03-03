package com.curtcaldwell.top10downloader.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.curtcaldwell.top10downloader.R
import com.curtcaldwell.top10downloader.models.Note

val TAG = "NoteAdapter"

class NotesRecyclerAdapter(val notes: ArrayList<Note>, val clickListener:ViewHolder.NoteListener) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_note_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return notes.size
        }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.number.text = notes[position].name
        holder.timestamp.text = notes[position].timestamp
        holder.setClickListener(View.OnClickListener {
            clickListener.onNoteClicked(notes[position])
            Log.d(TAG, notes[position].toString())
        })


    }


}

class ViewHolder (view:View) : RecyclerView.ViewHolder(view){

    var root : LinearLayout = view.findViewById(R.id.root)
    var timestamp : TextView = view.findViewById(R.id.note_timestamp)
    var number: TextView = view.findViewById(R.id.note_number)

    init {

    }

    fun setClickListener(listener: View.OnClickListener){

        root.setOnClickListener{
            listener.onClick(this.itemView)

        }




    }

    interface NoteListener{

        fun onNoteClicked(note : Note)

    }






}







