package com.example.tp1app.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tp1app.dao.CondominoDAO
import com.example.tp1app.dao.ContaDAO
import com.example.tp1app.model.Condomino
import com.example.tp1app.model.Conta

@Database(
    entities = arrayOf(
        Condomino::class,
        Conta::class
    ),
    version = 1
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun condominoDao() : CondominoDAO
    abstract fun contaDao() : ContaDAO
}