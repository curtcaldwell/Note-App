package com.curtcaldwell.top10downloader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.curtcaldwell.top10downloader.models.Note
import kotlinx.android.synthetic.main.activity_note.*


private val TAG = "NoteActivity"

class NoteActivity : AppCompatActivity(), View.OnClickListener  {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        val note = intent.extras.getParcelable("selected_note") as Note

        note_text.setText(note.name)

    }

    override fun onClick(v: View?) {
        var checkBox = R.id.tool_bar_check

       
    }


}
