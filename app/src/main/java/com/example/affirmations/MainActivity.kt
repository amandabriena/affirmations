package com.example.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Carregando os dados salvos no dataset
        val myDataset = Datasource().loadAffirmations()
        //Buscando a recyclerview
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        //Atribuindo ao adaptador a recyclerview e passando os dados contidos no dataset
        recyclerView.adapter = ItemAdapter(this, myDataset)

        //Melhora de desempenho definindo tamanho fixo na recyclerview
        recyclerView.setHasFixedSize(true)


    }
}
