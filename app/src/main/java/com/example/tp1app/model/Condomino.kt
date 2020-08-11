package com.example.tp1app.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Condomino(
    var nome: String,
    var sobrenome: String,
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
)