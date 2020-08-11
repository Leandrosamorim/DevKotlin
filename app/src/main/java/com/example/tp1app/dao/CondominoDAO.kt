package com.example.tp1app.dao

import androidx.room.*
import com.example.tp1app.model.Condomino

@Dao
interface CondominoDAO {
    @Insert
    fun store(condomino: Condomino)
    @Update
    fun update(condomino: Condomino)
    @Delete
    fun delete(condomino: Condomino)

    @Query("SELECT * FROM Condomino")
    fun all(): Array<Condomino>
    @Query("SELECT * FROM Condomino WHERE id = :indicador")
    fun show(indicador: Int): Array<Condomino>
    @Query("SELECT Nome FROM Condomino WHERE id = :indicador")
    fun showName(indicador: Int): Array<Condomino>
}