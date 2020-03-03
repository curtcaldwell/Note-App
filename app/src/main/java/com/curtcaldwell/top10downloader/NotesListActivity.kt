package com.curtcaldwell.top10downloader


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.curtcaldwell.top10downloader.adapters.NotesRecyclerAdapter
import com.curtcaldwell.top10downloader.adapters.ViewHolder
import com.curtcaldwell.top10downloader.models.Note
import com.curtcaldwell.top10downloader.util.VerticalSpacingItemDecorator
import kotlinx.android.synthetic.main.activity_notes_list.*

private var TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private val notes: ArrayList<Note> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes_list)
        addNote()



        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = NotesRecyclerAdapter(notes, object : ViewHolder.NoteListener{
            override fun onNoteClicked(note: Note) {
                startNoteActivity(note)


            }

        })
        val verticalSpaceHeight = VerticalSpacingItemDecorator(12)
        recycler_view.addItemDecoration(verticalSpaceHeight)
        toolbar.setTitle("notes")


    }


    fun addNote() {
        for (i in 1..1000) {

            val note = Note("#$i", "dog", "now")
            notes.add(note)

        }
    }

    fun startNoteActivity(note : Note){
        val intent = Intent(this, NoteActivity::class.java)
        intent.putExtra("selected_note", note)
        // start your next activity
        startActivity(intent)
    }






    }





