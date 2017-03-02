@file:Suppress("UnusedImport")

package br.com.gersonkm.swkata.collectionpipeline.cpi_001

import org.assertj.core.api.Assertions.*
import org.junit.Test
import java.time.LocalDate

abstract class CPI_001_A_Tests(val SUT: CPI_001_A) {

    @Test
    fun `teste #1 - give me a better name, please!`() {
       var result =  SUT.solve(listOf(
                Livro(1, "9780132350884", "A Handbook of Agile Software Craftsmanship", LocalDate.of(2017,1,1),listOf("Ernesto")),
                Livro(1, "9780321349606", "Java Concurrency in Practice", LocalDate.of(2017,1,1),listOf("Ernesto")),
                Livro(1, "9780131177055", "Working Effectively with Legacy Code", LocalDate.of(2017,1,1),listOf("Ernesto")),
                Livro(1, "9780201485677", "Refactoring: Improving the Design of Existing Code", LocalDate.of(2017,1,1),listOf("Ernesto")),
                Livro(1, "9780321356680", "Effective Java (2nd Edition)", LocalDate.of(2017,1,1),listOf("Ernesto"))
        ))

        assertThat(result).containsAllEntriesOf(mapOf(
                "9780132350884" to "A Handbook of Agile Software Craftsmanship",
                "9780321349606" to "Java Concurrency in Practice",
                "9780131177055" to "Working Effectively with Legacy Code",
                "9780201485677" to "Refactoring: Improving the Design of Existing Code",
                "9780321356680" to "Effective Java (2nd Edition)"
        ))
    }
}

class CPI_001_A_Java_Tests : CPI_001_A_Tests(CPI_001_A_Java())
class CPI_001_A_Kotlin_Tests : CPI_001_A_Tests(CPI_001_A_Kotlin())