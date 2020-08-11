package com.example.tp1app.model

import androidx.room.Embedded
import androidx.room.Relation

data class Condeconta(
    @Embedded val condomino: Condomino,
    @Relation(
        parentColumn = "id",
        entityColumn = "condId"
    )
    val contas: List<Conta>
)