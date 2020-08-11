package com.example.tp1app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.tp1app.database.AppDatabase
import com.example.tp1app.model.Conta
import kotlinx.android.synthetic.main.cadastro_cont.*
import kotlinx.android.synthetic.main.list.*
import java.text.SimpleDateFormat

class CadastroContActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_cont)
        addCond.setOnClickListener {
            var nome = edtDesc.text.toString()
            var valor = edtVal.text.toString()
            var data = edtDt.text.toString()
            var condId = edtResponsavel.text.toString()

            var conta = Conta(
                nome,
                valor.toDouble(),
                SimpleDateFormat("dd-MM-yyyy").parse(data),
                condId.toInt()
            )

            var appDatabase = Room.databaseBuilder(
                applicationContext,
                AppDatabase::class.java,
                "appDatabase.sql"
            )
                .allowMainThreadQueries()
                .build()

            appDatabase.contaDao().store(conta)
        }
    }
}