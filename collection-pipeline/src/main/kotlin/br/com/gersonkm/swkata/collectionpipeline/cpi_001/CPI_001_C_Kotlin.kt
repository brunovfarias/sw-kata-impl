package br.com.gersonkm.swkata.collectionpipeline.cpi_001

import java.util.*

class CPI_001_C_Kotlin : CPI_001_C {

    override fun solve(livros: List<Livro>): SortedMap<Int, Livro> {
        return livros.sortedWith(compareBy{it.dataPublicacao}).associateBy({ it.id},{it}).toSortedMap()
    }
}