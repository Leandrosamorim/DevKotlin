package com.example.tp1app

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import androidx.room.Room
import com.example.tp1app.database.AppDatabase
import kotlinx.android.synthetic.main.list.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list)

        var appDatabase = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "appDatabase.sql"
        )
            .allowMainThreadQueries().build()
        var condominos = appDatabase.condominoDao().all()
        // Post
        lstcond.adapter = ArrayAdapter(
            applicationContext,
            android.R.layout.simple_list_item_1,
            condominos
        )
        addCond.setOnClickListener {
            startActivity(Intent(this, CadastroCondActivity::class.java))
        }
    }
}