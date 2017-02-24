package br.com.gersonkm.swkata.datetime.dat_003

import org.junit.Test

abstract class DAT_003_A_Tests(val SUT: DAT_003_A) {

    @Test
    fun `teste #1 - give me a better name, please!`() {
        TODO()
    }

}

class DAT_003_A_Java_Tests : DAT_003_A_Tests(DAT_003_A_Java())
class DAT_003_A_Kotlin_Tests : DAT_003_A_Tests(DAT_003_A_Kotlin())