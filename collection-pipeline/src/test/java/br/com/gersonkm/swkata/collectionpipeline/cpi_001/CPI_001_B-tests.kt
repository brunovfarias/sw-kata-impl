@file:Suppress("UnusedImport")

package br.com.gersonkm.swkata.collectionpipeline.cpi_001

import org.assertj.core.api.Assertions.*
import org.junit.Test
import java.time.LocalDate

abstract class CPI_001_B_Tests(val SUT: CPI_001_B) {

    @Test
    fun `Conversao de lista para map ordenada por data de publicação`() {
        val livro1 = newLivro(isbn = "111", dataPublicacao =  LocalDate.of(1999,7,8))
        val livro2 = newLivro(isbn = "222", dataPublicacao =  LocalDate.of(2004,10,2))
        val livro3 = newLivro(isbn = "333", dataPublicacao =  LocalDate.of(2006,5,19))
        val livro4 = newLivro(isbn = "444", dataPublicacao =  LocalDate.of(2008,5,28))
        val livro5 = newLivro(isbn = "555", dataPublicacao =  LocalDate.of(2008,8,11))


        var result =  SUT.solve(listOf(livro5,livro2,livro3,livro4,livro1))

        assertThat(result).containsExactly(
                entry("111",livro1),
                entry("222",livro2),
                entry("333",livro3),
                entry("444",livro4),
                entry("555",livro5)
        )
    }
}

class CPI_001_B_Java_Tests : CPI_001_B_Tests(CPI_001_B_Java())
class CPI_001_B_Kotlin_Tests : CPI_001_B_Tests(CPI_001_B_Kotlin())