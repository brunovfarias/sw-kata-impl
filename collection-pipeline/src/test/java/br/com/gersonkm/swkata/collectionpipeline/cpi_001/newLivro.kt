package br.com.gersonkm.swkata.collectionpipeline.cpi_001

import java.time.LocalDate

fun newLivro(id: Int = 1, isbn: String = "", titulo: String = "titulo", dataPublicacao: LocalDate = LocalDate.of(1900,1,1), autores: List<String> = emptyList<String>()): Livro {
        return Livro(id, isbn, titulo, dataPublicacao, autores)
    }