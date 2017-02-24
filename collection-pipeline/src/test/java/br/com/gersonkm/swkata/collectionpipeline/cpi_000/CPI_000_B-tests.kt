@file:Suppress("UnusedImport")

package br.com.gersonkm.swkata.collectionpipeline.cpi_000

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

abstract class CPI_000_B_Tests(val SUT: CPI_000_B) {

    @Test
    fun `com alguns elementos`() {
        val result = SUT.solve(listOf(
                CoffeeBrand("Caribou"),
                CoffeeBrand("dunkin donuts"),
                CoffeeBrand("Kopi Luwak"),
                CoffeeBrand("FOLGERS")
        ))

        assertThat(result)
                .isEqualTo("Caribou, dunkin donuts, Kopi Luwak, FOLGERS")
    }

    @Test
    fun `com nenhum elemento`() {
        val result = SUT.solve(emptyList())

        assertThat(result)
                .isEqualTo("")
    }

}

class CPI_000_B_Java_Tests : CPI_000_B_Tests(CPI_000_B_Java())
class CPI_000_B_Kotlin_Tests : CPI_000_B_Tests(CPI_000_B_Kotlin())