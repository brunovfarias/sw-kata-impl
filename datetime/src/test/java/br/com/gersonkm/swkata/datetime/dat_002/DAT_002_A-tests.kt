package br.com.gersonkm.swkata.datetime.dat_002

import org.junit.Test

abstract class DAT_002_A_Tests(val SUT: DAT_002_A) {

    @Test
    fun `teste #1 - give me a better name, please!`() {
        TODO()
    }

}

class DAT_002_A_Java_Tests : DAT_002_A_Tests(DAT_002_A_Java())
class DAT_002_A_Kotlin_Tests : DAT_002_A_Tests(DAT_002_A_Kotlin())