package com.lucasmaranhao.camponesessergipanosltda.dao

import com.lucasmaranhao.camponesessergipanosltda.model.Produto

class ProdutosDao {

    fun adiciona(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos(): List<Produto> {
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }
}