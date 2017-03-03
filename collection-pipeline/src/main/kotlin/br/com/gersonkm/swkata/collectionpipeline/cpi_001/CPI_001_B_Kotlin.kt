package br.com.gersonkm.swkata.collectionpipeline.cpi_001

class CPI_001_B_Kotlin : CPI_001_B {

    override fun solve(livros: List<Livro>): Map<String, Livro> {
        return livros.sortedWith(compareBy{it.dataPublicacao}).associateBy({ it.isbn},{it})
    }
}