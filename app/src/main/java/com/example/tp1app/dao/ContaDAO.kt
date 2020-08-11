package com.example.tp1app.dao

import androidx.room.*
import com.example.tp1app.model.Conta
import java.util.*

@Dao
interface ContaDAO {
    @Insert
    fun store(conta: Conta)
    @Update
    fun update(conta: Conta)
    @Delete
    fun delete(conta: Conta)

    @Query("SELECT * FROM Conta")
    fun all(): Array<Conta>
    @Query("SELECT * FROM Conta WHERE condId = :indicador")
    fun show(indicador: Int): Array<Conta>
    @Query("SELECT * FROM Conta WHERE data >= :indicador AND data <= :indicador2")
    fun pegaContaDt(indicador: Date, indicador2: Date): Array<Conta>
}