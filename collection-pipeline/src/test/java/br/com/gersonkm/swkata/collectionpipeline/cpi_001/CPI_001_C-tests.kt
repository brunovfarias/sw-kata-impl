@file:Suppress("UnusedImport")

package br.com.gersonkm.swkata.collectionpipeline.cpi_001

import org.assertj.core.api.Assertions.*
import org.junit.Test
import java.time.LocalDate

abstract class CPI_001_C_Tests(val SUT: CPI_001_C) {

    @Test
    fun `Conversao de lista para Map ordenado por id`() {
        val livro1 = newLivro(id = 1)
        val livro2 = newLivro(id = 2)
        val livro3 = newLivro(id = 3)
        val livro4 = newLivro(id = 4)
        val livro5 = newLivro(id = 5)

        var result =  SUT.solve(listOf(livro2,livro1,livro4,livro5,livro3))

        assertThat(result).containsExactly(
                entry(1,livro1),
                entry(2,livro2),
                entry(3,livro3),
                entry(4,livro4),
                entry(5,livro5)
        )
    }

}

class CPI_001_C_Java_Tests : CPI_001_C_Tests(CPI_001_C_Java())
class CPI_001_C_Kotlin_Tests : CPI_001_C_Tests(CPI_001_C_Kotlin())