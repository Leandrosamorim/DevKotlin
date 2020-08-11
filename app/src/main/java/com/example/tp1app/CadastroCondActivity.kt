package com.example.tp1app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.tp1app.database.AppDatabase
import com.example.tp1app.model.Condomino
import kotlinx.android.synthetic.main.cadastro_cond.*
import kotlinx.android.synthetic.main.list.*

class CadastroCondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_cond)

        addCond.setOnClickListener {
            var nome = edtNome.text.toString()
            var sobrenome = edtSobrenome.text.toString()

            var condomino = Condomino(nome, sobrenome)

            var appDatabase = Room.databaseBuilder(
                applicationContext,
                AppDatabase::class.java,
                "appDatabase.sql"
            )
                .allowMainThreadQueries()
                .build()

            appDatabase.condominoDao().store(condomino)
        }
    }
}
