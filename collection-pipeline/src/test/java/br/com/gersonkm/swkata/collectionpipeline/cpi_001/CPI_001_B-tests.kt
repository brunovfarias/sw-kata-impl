@file:Suppress("UnusedImport")

package br.com.gersonkm.swkata.collectionpipeline.cpi_001

import org.assertj.core.api.Assertions.*
import org.junit.Test
import java.time.LocalDate

abstract class CPI_001_B_Tests(val SUT: CPI_001_B) {

    @Test
    fun `teste #1 - give me a better name, please!`() {
        var result =  SUT.solve(listOf(
                Livro(1, "9780132350884", "A Handbook of Agile Software Craftsmanship", LocalDate.of(2008,8,11),listOf("Ernesto")),
                Livro(2, "9780321349606", "Java Concurrency in Practice", LocalDate.of(2006,5,19),listOf("Ernesto")),
                Livro(3, "9780131177055", "Working Effectively with Legacy Code", LocalDate.of(2004,10,2),listOf("Ernesto")),
                Livro(4, "9780201485677", "Refactoring: Improving the Design of Existing Code", LocalDate.of(1999,7,8),listOf("Ernesto")),
                Livro(5, "9780321356680", "Effective Java (2nd Edition)", LocalDate.of(2008,5,28),listOf("Ernesto"))
        ))

        assertThat(result).containsAllEntriesOf(mapOf(
                "9780132350884" to Livro(1, "9780132350884", "A Handbook of Agile Software Craftsmanship", LocalDate.of(2008,8,11),listOf("Ernesto")),
                "9780321349606" to Livro(2, "9780321349606", "Java Concurrency in Practice", LocalDate.of(2006,5,19),listOf("Ernesto")),
                "9780131177055" to Livro(3, "9780131177055", "Working Effectively with Legacy Code", LocalDate.of(2004,10,2),listOf("Ernesto")),
                "9780321356680" to Livro(5, "9780321356680", "Effective Java (2nd Edition)", LocalDate.of(2008,5,28),listOf("Ernesto")),
                "9780201485677" to Livro(4, "9780201485677", "Refactoring: Improving the Design of Existing Code", LocalDate.of(1999,7,8),listOf("Ernesto"))
        ))
    }
}

class CPI_001_B_Java_Tests : CPI_001_B_Tests(CPI_001_B_Java())
class CPI_001_B_Kotlin_Tests : CPI_001_B_Tests(CPI_001_B_Kotlin())