@file:Suppress("UnusedImport")

package br.com.gersonkm.swkata.collectionpipeline.cpi_001

import org.junit.Test

abstract class CPI_001_B_Tests(val SUT: CPI_001_B) {

    @Test
    fun `teste #1 - give me a better name, please!`() {
        TODO()
    }

}

class CPI_001_B_Java_Tests : CPI_001_B_Tests(CPI_001_B_Java())
class CPI_001_B_Kotlin_Tests : CPI_001_B_Tests(CPI_001_B_Kotlin())