package com.example.tp1app.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

@Entity
class Conta(
    var nome: String,
    var valor: Double,
    var data: Date,
    @PrimaryKey val contId : Int
)