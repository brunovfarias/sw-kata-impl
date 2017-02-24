@file:Suppress("UnusedImport")

package br.com.gersonkm.swkata.collectionpipeline.cpi_000

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

abstract class CPI_000_C_Tests(val SUT: CPI_000_C) {

    @Test
    fun `com 1 elemento a menos do limite`() {
        val result = SUT.solve(listOf(
                CoffeeBrand("Caribou"),
                CoffeeBrand("dunkin donuts")
        ))

        assertThat(result)
                .isEqualTo("CARIBOU / DUNKIN DONUTS")
    }

    @Test
    fun `com quantidade de elementos no limite`() {
        val result = SUT.solve(listOf(
                CoffeeBrand("Caribou"),
                CoffeeBrand("dunkin donuts"),
                CoffeeBrand("Kopi Luwak")
        ))

        assertThat(result)
                .isEqualTo("CARIBOU / DUNKIN DONUTS / KOPI LUWAK")
    }

    @Test
    fun `com 1 elemento a mais do limite`() {
        val result = SUT.solve(listOf(
                CoffeeBrand("Caribou"),
                CoffeeBrand("dunkin donuts"),
                CoffeeBrand("Kopi Luwak"),
                CoffeeBrand("FOLGERS")
        ))

        assertThat(result)
                .isEqualTo("CARIBOU / DUNKIN DONUTS / KOPI LUWAK / ...")
    }

    @Test
    fun `com 2 elementos a mais do limite`() {
        val result = SUT.solve(listOf(
                CoffeeBrand("Caribou"),
                CoffeeBrand("dunkin donuts"),
                CoffeeBrand("Kopi Luwak"),
                CoffeeBrand("FOLGERS"),
                CoffeeBrand ("Gloria Jean's")
        ))

        assertThat(result)
                .isEqualTo("CARIBOU / DUNKIN DONUTS / KOPI LUWAK / ...")
    }

}

class CPI_000_C_Java_Tests : CPI_000_C_Tests(CPI_000_C_Java())
class CPI_000_C_Kotlin_Tests : CPI_000_C_Tests(CPI_000_C_Kotlin())