@file:Suppress("UnusedImport")

package br.com.gersonkm.swkata.collectionpipeline.cpi_001

import org.assertj.core.api.Assertions.*
import org.junit.Test
import java.time.LocalDate

abstract class CPI_001_A_Tests(val SUT: CPI_001_A) {

    @Test
    fun `Conversao de lista para Map`() {
       var result =  SUT.solve(listOf(
               newLivro(isbn="111111",titulo = "t1"),
               newLivro(isbn="222222",titulo = "t2"),
               newLivro(isbn="333333",titulo = "t3"),
               newLivro(isbn="444444",titulo = "t4"),
               newLivro(isbn="555555",titulo = "t5"),
               newLivro(isbn="666666",titulo = "t6")
        ))

        assertThat(result).containsAllEntriesOf(
                mapOf(  "111111" to "t1"
                        ,"222222" to "t2"
                        ,"333333" to "t3"
                        ,"444444" to "t4"
                        ,"555555" to "t5"
        ))
    }
}

class CPI_001_A_Java_Tests : CPI_001_A_Tests(CPI_001_A_Java())
class CPI_001_A_Kotlin_Tests : CPI_001_A_Tests(CPI_001_A_Kotlin())