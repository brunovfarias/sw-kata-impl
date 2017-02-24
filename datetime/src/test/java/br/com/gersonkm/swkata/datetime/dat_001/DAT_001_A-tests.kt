package br.com.gersonkm.swkata.datetime.dat_001

import org.junit.Test

abstract class DAT_001_A_Tests(val SUT: DAT_001_A) {

    @Test
    fun `teste #1 - give me a better name, please!`() {
        TODO()
    }

}

class DAT_001_A_Java_Tests : DAT_001_A_Tests(DAT_001_A_Java())
class DAT_001_A_Kotlin_Tests : DAT_001_A_Tests(DAT_001_A_Kotlin())