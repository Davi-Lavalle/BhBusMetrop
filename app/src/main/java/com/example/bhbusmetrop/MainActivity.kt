package com.example.bhbusmetrop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.bhbusmetrop.model.BusModel
import com.example.bhbusmetrop.repository.AppDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appDatabase = AppDatabase.getDataBase(this).BusDao()

        val retornoInsert = appDatabase.insertOnibus(BusModel().apply {
            this.nome = "s20"
            this.numero = 2101
            this.cor = "azul"
            this.tipo = "Onibus"
            this.peso = "16t"

        })

        val  retornoSelectMultiplo = appDatabase.getAll()

        for (item in retornoSelectMultiplo){
            Log.d(
                "Retorno",
                "id_onibus: ${item.id_onibus}, nome: ${item.nome}, numero: ${item.numero}, cor: ${item.cor}, tipo: ${item.tipo}, peso: ${item.peso}"
            )
        }
    }
}