@file:Suppress("UnusedImport")

package br.com.gersonkm.swkata.collectionpipeline.cpi_001

import org.assertj.core.api.Assertions.*
import org.junit.Test
import java.time.LocalDate

abstract class CPI_001_B_Tests(val SUT: CPI_001_B) {

    @Test
    fun `teste #1 - give me a better name, please!`() {
        val livro1 = Livro(1, "9780132350884", "A Handbook of Agile Software Craftsmanship", LocalDate.of(2008,8,11),listOf("Ernesto"))
        val livro2 = Livro(2, "9780321349606", "Java Concurrency in Practice", LocalDate.of(2006,5,19),listOf("Ernesto"))
        val livro3 = Livro(3, "9780131177055", "Working Effectively with Legacy Code", LocalDate.of(2004,10,2),listOf("Ernesto"))
        val livro4 = Livro(4, "9780201485677", "Refactoring: Improving the Design of Existing Code", LocalDate.of(1999,7,8),listOf("Ernesto"))
        val livro5 = Livro(5, "9780321356680", "Effective Java (2nd Edition)", LocalDate.of(2008,5,28),listOf("Ernesto"))

        var result =  SUT.solve(listOf(livro5,livro2,livro3,livro4,livro1))

        assertThat(result).containsExactly(
                entry("9780201485677",livro4),
                entry("9780131177055",livro3),
                entry("9780321349606",livro2),
                entry("9780321356680",livro5),
                entry("9780132350884",livro1)
        )
    }
}

class CPI_001_B_Java_Tests : CPI_001_B_Tests(CPI_001_B_Java())
class CPI_001_B_Kotlin_Tests : CPI_001_B_Tests(CPI_001_B_Kotlin())