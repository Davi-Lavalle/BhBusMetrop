package com.example.bhbusmetrop.repository.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.bhbusmetrop.model.BusModel

@Dao
interface BusDao {

    @Insert
    fun insertOnibus(onibus: BusModel) : Long

    @Update
    fun updateOnibus(onibus: BusModel) : Int

    @Delete
    fun deleteOnibus(onibus: BusModel) : Int

    @Query("SELECT * FROM Onibus WHERE id_onibus = :id")
    fun get(id: Int): BusModel

    @Query("SELECT * FROM Onibus" )
    fun getAll(): List<BusModel>
}

