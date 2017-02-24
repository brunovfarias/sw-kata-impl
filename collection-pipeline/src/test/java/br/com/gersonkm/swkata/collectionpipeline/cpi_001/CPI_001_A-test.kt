@file:Suppress("UnusedImport")

package br.com.gersonkm.swkata.collectionpipeline.cpi_001

import org.junit.Test

abstract class CPI_001_A_Tests(val SUT: CPI_001_A) {

    @Test
    fun `teste #1 - give me a better name, please!`() {
        TODO()
    }

}

class CPI_001_A_Java_Tests : CPI_001_A_Tests(CPI_001_A_Java())
class CPI_001_A_Kotlin_Tests : CPI_001_A_Tests(CPI_001_A_Kotlin())