package com.lucasmaranhao.camponesessergipanosltda.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.lucasmaranhao.camponesessergipanosltda.R
import com.lucasmaranhao.camponesessergipanosltda.model.Produto
import com.lucasmaranhao.camponesessergipanosltda.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, uva e maçã"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "R$ 19.99"
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(nome = "teste 1", descricao = "descricao 1",
                valor = BigDecimal("19.99")),
            Produto(nome = "teste 2", descricao = "descricao 2",
                valor = BigDecimal("39.99"))
        ))
    }
}