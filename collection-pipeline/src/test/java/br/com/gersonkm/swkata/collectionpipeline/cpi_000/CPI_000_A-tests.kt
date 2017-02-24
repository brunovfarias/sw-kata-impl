@file:Suppress("UnusedImport")

package br.com.gersonkm.swkata.collectionpipeline.cpi_000

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

abstract class CPI_000_A_Tests(val SUT: CPI_000_A) {

    @Test
    fun `teste #1 - give me a better name, please!`() {
        val result = SUT.solve(listOf(
                CoffeeBrand("Caribou"),
                CoffeeBrand("dunkin donuts"),
                CoffeeBrand("Kopi Luwak"),
                CoffeeBrand("FOLGERS")
        ))
        assertThat(result)
                .containsExactly("Caribou", "dunkin donuts", "Kopi Luwak", "FOLGERS")
    }

}

class CPI_000_A_Java_Tests : CPI_000_A_Tests(CPI_000_A_Java())
class CPI_000_A_Kotlin_Tests : CPI_000_A_Tests(CPI_000_A_Kotlin())